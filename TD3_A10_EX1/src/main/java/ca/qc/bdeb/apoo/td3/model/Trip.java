package ca.qc.bdeb.apoo.td3.model;

public class Trip {
    private static int AUTOGEN_ID = 0;
    private int id;
    private String start;
    private String end;
    private double distance;
    private double fare;
    private Car car;

    public Trip(String start, String end, double distance, double fare, Car car) {
        this.id = Trip.AUTOGEN_ID++;
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.fare = fare;
        this.car = car;
    }

    public Trip(int id, String start, String end, double distance, double fare, Car car) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.fare = fare;
        this.car = car;
    }

    public Trip() {}
}
