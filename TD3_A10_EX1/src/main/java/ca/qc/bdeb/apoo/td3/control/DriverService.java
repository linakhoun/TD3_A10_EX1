package ca.qc.bdeb.apoo.td3.control;
import ca.qc.bdeb.apoo.td3.model.*;

import java.util.List;

public class DriverService {
    private ITripDAO tripDAO;

    public DriverService(ITripDAO tripDAO) {
        this.tripDAO = tripDAO;
    }

    public double findTotalAmountOfAllTrips(String name, String licence) {
        List<Trip> allTrips = tripDAO.findAll();
        return 0;
    }
}
