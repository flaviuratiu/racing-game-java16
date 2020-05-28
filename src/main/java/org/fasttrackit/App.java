package org.fasttrackit;

// one-line comment
public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Racing Game!");

        System.out.println("\uD83D\uDE97");

        Car carReference = new Car();
        carReference.make = "Skoda";
        carReference.model = "Fabia";
        carReference.mileage = 7.5;
        carReference.fuelLevel = 60;
        carReference.color = "red";
        carReference.maxSpeed = 300;

        carReference.engine = new Engine();
        carReference.engine.manufacturer = "VW";
        carReference.engine.capacity = 1900;

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 1900;

        carReference.engine = engine1;

        System.out.println(carReference.engine.manufacturer);


        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.color);
        System.out.println(carReference.maxSpeed);

        System.out.println(carReference.totalTraveledDistance);
        System.out.println(carReference.damaged);
        System.out.println(carReference.doorCount);

        System.out.println(carReference);


        Car car2 = new Car();
        car2.make = "Mercedes";
        car2.model = "CLS";
        car2.color = "black";

        car2.make = carReference.make;


        // concatenation
        System.out.println(car2.make + " " + carReference.make);

        System.out.println("Car2 make: " + car2.make);
        System.out.println("CarReference make: " + carReference.make);

        Car car2Backup = car2;

        car2 = carReference;

        System.out.println("Initial name");
        System.out.println(car2.make);
        System.out.println(carReference.make);

        car2.make = "Audi";

        System.out.println("Updated name");

        System.out.println(car2.make);
        System.out.println(carReference.make);


        // NPE (NullPointerException) example
//        car2 = null;
//        System.out.println(car2.make);
    }
}
