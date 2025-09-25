package ca.qc.bdeb.apoo.td3.dal;

import ca.qc.bdeb.apoo.td3.model.Trip;

import java.util.List;

public interface ITripDAO {
    List <Trip> findAll();
}
