package org.fasttrackit;

// one-line comment
public class App {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();

//        // String pool
//        String a = "test";
//        // String literals
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a == c: " + (a == c));
//        System.out.println("a equals c: " + (a.equals(c)));

//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//
////        AutoVehicle autoVehicle = new AutoVehicle(engine);
//
//        Car car = new Car(engine);
//        car.make = "Dacia";
//
//        System.out.println(car.make);

//
//        autoVehicle.engine = engine;

//        Car carReference = new Car();
//        carReference.make = "Skoda";
//        carReference.model = "Fabia";
//        carReference.mileage = 7.5;
//        carReference.fuelLevel = 60;
//        carReference.color = "red";
//        carReference.maxSpeed = 300;
//
//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 1900;
//
//        Engine engine1 = new Engine();
//        engine1.manufacturer = "VW";
//        engine1.capacity = 1900;
//
//        carReference.engine = engine1;
//
//        double currentDistance = carReference.accelerate(100, 0.5);
//
//        System.out.println("Total distance before repair: " + carReference.totalTraveledDistance);
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Total distance after repair: " + carReference.totalTraveledDistance);
//
//
//        System.out.println(carReference.make);
//        System.out.println(carReference.model);
//        System.out.println(carReference.mileage);
//        System.out.println(carReference.fuelLevel);
//        System.out.println(carReference.color);
//        System.out.println(carReference.maxSpeed);
//
//        System.out.println(carReference.totalTraveledDistance);
//        System.out.println(carReference.damaged);
//        System.out.println(carReference.doorCount);
//
//        System.out.println(carReference);
//
//
//        Car car2 = new Car();
//        car2.make = "Mercedes";
//        car2.model = "CLS";
//        car2.color = "black";
//
//        double car2Distance = car2.accelerate(120, 3);
//
//        car2.make = carReference.make;
//
//
//        // concatenation
//        System.out.println(car2.make + " " + carReference.make);
//
//        System.out.println("Car2 make: " + car2.make);
//        System.out.println("CarReference make: " + carReference.make);
//
//        Car car2Backup = car2;
//
//        car2 = carReference;
//
//        System.out.println("Initial name");
//        System.out.println(car2.make);
//        System.out.println(carReference.make);
//
//        car2.make = "Audi";
//
//        System.out.println("Updated name");
//
//        System.out.println(car2.make);
//        System.out.println(carReference.make);


        // NPE (NullPointerException) example
//        car2 = null;
//        System.out.println(car2.make);

//        System.out.println("Modulo (modulus) examples:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        System.out.println("Is 5 even?");
//        System.out.println(5 % 2 == 0);
    }
}
