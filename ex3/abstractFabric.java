
interface Lada {
    long getLadaPrice();
}

interface InteAbsFactory {
    Lada getLada();
}

// Две фабрики

// Первая
class UaLadaImpl implements Lada {
    public long getLadaPrice() {
        return 1000;
    }
}

class UaCarPriceAbsFactory implements InteAbsFactory {
    public Lada getLada() {
        return new UaLadaImpl();
    }

}

// Вторая
class RuLadaImpl implements Lada {
    public long getLadaPrice() {
        return 10000;
    }
}

class RuCarPriceAbsFactory implements InteAbsFactory {
    public Lada getLada() {
        return new RuLadaImpl();
    }
}


public class abstractFabric {
    public static void main(String[] args) {
        String country = "UA";
        InteAbsFactory ifactory = null;
        if(country.equals("UA")) {
            ifactory = new UaCarPriceAbsFactory();
        } else if(country.equals("RU")) {
            ifactory = new RuCarPriceAbsFactory();
        }

        Lada lada = ifactory.getLada();
        System.out.println(lada.getLadaPrice());
    }
}
