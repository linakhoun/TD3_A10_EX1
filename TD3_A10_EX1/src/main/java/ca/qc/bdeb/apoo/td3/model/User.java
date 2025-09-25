package ca.qc.bdeb.apoo.td3.model;

public class User {
    protected static int AUTOGEN_ID = 0;
    protected int id;
    protected String name;

    public User(String name) {
        this.id = User.AUTOGEN_ID++;
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {}
}
