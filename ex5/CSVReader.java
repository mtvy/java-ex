import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static void main(String[] args) {
        
        String csvFile = "C:\\mtvy\\java\\mtvy.csv";
        String line = "";
        String csvSplitBy = ",";

        int maleCount = 0;
        int femaleCount = 0;
        int survivedCount = 0;
        int totalCount = 0;
        int firstClassCount = 0;

        double ageSum = 0;

        List<Double> ages = new ArrayList<>();
        List<Integer> sibSpList = new ArrayList<>();
        List<Integer> parchList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {

                String[] passenger = line.split(csvSplitBy);

                if (passenger[0].equals("PassengerId")) {
                    continue;
                }

                String sx = passenger[5];

                int survived = Integer.parseInt(passenger[1]);
                int pclass = Integer.parseInt(passenger[2]);
                
                String age = passenger[6];

                if (!age.isEmpty()) {
                    double ageValue = Double.parseDouble(age);
                    ages.add(ageValue);
                    ageSum += ageValue;
                }
                if (sx.equals("male")) {
                    maleCount++;
                } else if (sx.equals("female")) {
                    femaleCount++;
                }
                if (survived == 1) {
                    survivedCount++;
                }
                totalCount++;
                if (pclass == 1) {
                    firstClassCount++;
                }
                int sibSp = Integer.parseInt(passenger[7]);
                int parch = Integer.parseInt(passenger[8]);
                sibSpList.add(sibSp);
                parchList.add(parch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double survivalRate = (double) survivedCount / totalCount * 100;
        double firstClassRate = (double) firstClassCount / totalCount * 100;
        double averageAge = ageSum / ages.size();
        double medianAge;
        ages.sort(null);
        int middle = ages.size() / 2;
        if (ages.size() % 2 == 0) {
            medianAge = (ages.get(middle - 1) + ages.get(middle)) / 2;
        } else {
            medianAge = ages.get(middle);
        }
        double correlation = calculatePearsonCorrelation(sibSpList, parchList);
        
        System.out.println(maleCount + " " + femaleCount);
        System.out.printf("%.2f%n", survivalRate);
        System.out.printf("%.2f%n", firstClassRate);
        System.out.printf("%.2f %.2f%n", averageAge, medianAge);
        System.out.println("Корреляция между SibSp and Parch: " + correlation);
    }

    public static double calculatePearsonCorrelation(List<Integer> x, List<Integer> y) {
        double sumX = 0.0, sumY = 0.0, sumXY = 0.0, sumXSquare = 0.0, sumYSquare = 0.0;
        int n = x.size();

        for (int i = 0; i < n; i++) {
            int xi = x.get(i);
            int yi = y.get(i);
            sumX += xi;
            sumY += yi;
            sumXY += xi * yi;
            sumXSquare += xi * xi;
            sumYSquare += yi * yi;
        }

        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumXSquare - sumX * sumX) * (n * sumYSquare - sumY * sumY));

        return numerator / denominator;
    }
}
