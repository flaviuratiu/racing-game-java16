package org.fasttrackit;

public class Car {

    // instance variables
    String make;
    String model;
    String color;
    double mileage;
    double fuelLevel;
    double maxSpeed;
    double totalTraveledDistance;
    boolean damaged;
    int doorCount;

    // "has-a" relationship (Aggregation)
    Engine engine;

}
