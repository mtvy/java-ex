package org.example;

/**
 *         Информационная система предназначена для “сборки” моделей автомобилей. Модель
 *         автомобиля может включать , например, следующие компоненты: кузов, двигатель, коробка
 *         передач, диски/шины(выбрать не менее 3 компонентов). Описать каждый из компонентов
 *         классом с подходящим набором атрибутов, реализовать “сборку” различных моделей
 *         выбранного автопроизводителя(не менее 3 моделей). Вывести описание моделей.
 */
class Car {

    private String body;
    private String engine;
    private String transmission;
    private String wheel;
    public  String brand;
    public  String model;

    public Car(String brand, String model, String body, String engine, String transmission, String wheel) {
        this.brand = brand;
        this.model = model;
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
    }

    public String getBody() {
        return body;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getWheel() {
        return wheel;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void printCarModel() {
        System.out.println(
                "Car model: " + this.brand + " " + this.model + " Body: " + this.body + ", Engine: " + this.engine + ", Transmission: " + this.transmission + ", Wheels: " + this.wheel);
    }
}

class CarFactory {

    public static Car getCar(String brand, String model) {

        switch (brand) {
            case "Ford":
                switch (model) {
                    case "Fiesta":
                        return new Car(brand, model,"Sedan", "V6", "Automatic", "18inch Alloy");
                    case "Explorer":
                        return new Car(brand, model,"SUV", "V8", "Automatic", "20inch Alloy");
                    case "Mustang":
                        return new Car(brand, model,"Coupe", "V12", "Automatic", "19inch Alloy");
                }
            case "Toyota":
                switch (model) {
                    case "Corolla":
                        return new Car(brand, model,"Sedan", "V6", "Automatic", "18inch Alloy");
                    case "RAV4":
                        return new Car(brand, model,"SUV", "V8", "Automatic", "20inch Alloy");
                    case "Camry":
                        return new Car(brand, model,"Coupe", "V12", "Automatic", "19inch Alloy");
                }
            default:
                return null;
        }
    }
}

public class App 
{
    public static void main( String[] args )
    {
        // Создаем модели автомобиля
        Car car1 = CarFactory.getCar("Ford", "Fiesta");
        Car car2 = CarFactory.getCar("Toyota", "RAV4");
        Car car3 = CarFactory.getCar("Ford", "Mustang");

        car1.printCarModel();
        car2.printCarModel();
        car3.printCarModel();
    }
}

