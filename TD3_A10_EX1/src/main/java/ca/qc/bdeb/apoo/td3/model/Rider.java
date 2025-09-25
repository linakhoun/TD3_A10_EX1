package ca.qc.bdeb.apoo.td3.model;

import java.util.List;

public class Rider extends User {
    private String cc;
    private List<Trip> trips;

    public Rider(int id, String name, String cc, List<Trip> trips) {
        super(id, name);
        this.cc = cc;
        this.trips = trips;
    }

    public Rider(String name, String cc, List<Trip> trips) {
        super(name);
        this.cc = cc;
        this.trips = trips;
    }

    public Rider() {}


}
