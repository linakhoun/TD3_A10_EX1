package ca.qc.bdeb.apoo.td3.view;

import ca.qc.bdeb.apoo.td3.control.DriverService;

public class AppDriver {
    private DriverService ds;

    public AppDriver() {
        this.ds = new DriverService();
    }

    public void UI() {
        String name = "Youcef";
        String licence = "ABCD";
        double total = this.ds.findTotalAmountOfAllTrips(name, licence);
        System.out.println(String.format("Total is: %f", total));
    }

    public static void main(String[] args) {
        AppDriver ad = new AppDriver();
        ad.UI();



    }
}