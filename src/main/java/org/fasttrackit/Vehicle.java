package org.fasttrackit;

public class Vehicle {

    // instance variables
    String make;
    String model;
    String color;
    double mileage;
    double fuelLevel;
    double maxSpeed;
    double totalTraveledDistance;
    boolean damaged;

    public double accelerate(double speed, double durationInHours) {
        if (speed > maxSpeed) {
            System.out.println("Max speed exceeded.");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Careful! Max speed reached!");
        } else {
            System.out.println("Valid speed entered.");
        }

        if (damaged) {
            System.out.println("The vehicle is damaged. You cannot accelerate.");
            return 0;
        }

        System.out.println(make + " is accelerating with " + speed + " km/h for " + durationInHours + "h");

        // local variable
        double distance = speed * durationInHours;
        totalTraveledDistance = totalTraveledDistance + distance;

        // same result as the statement above
//        totalTraveledDistance += distance;

        System.out.println("Total traveled distance: " + totalTraveledDistance);

        double usedFuel = distance * mileage / 100;

        // todo: use more fuel if speed > 120 km/h

        fuelLevel = fuelLevel - usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }

    public void makeSound() {
        System.out.println("Make way!!!");
    }
}
