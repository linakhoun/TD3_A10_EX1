package ca.qc.bdeb.apoo.td3.model;

import java.util.List;

public class Car {
    private static int AUTOGEN_ID = 0;
    private int id;
    private String make;
    private String model;
    private int year;
    private Driver driver;

    public Car(String make, String model, int year, Driver driver) {
        this.id = Car.AUTOGEN_ID++;
        this.make = make;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    public Car(int id, String make, String model, int year, Driver driver) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    public Car(){}
}
