package ca.qc.bdeb.apoo.td3.model;

public class Driver extends User {
    private String license;

    public Driver(String name, String license) {
        super(name);
        this.license = license;
    }

    public Driver(int id, String name, String license) {
        super(id, name);
        this.license = license;
    }

    public Driver() {}
}
