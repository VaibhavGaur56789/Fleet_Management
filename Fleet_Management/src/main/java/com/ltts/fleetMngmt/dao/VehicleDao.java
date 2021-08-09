package com.ltts.fleetMngmt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.fleetMngmt.model.Vehicle;

public interface VehicleDao {
	boolean insertVehicle(Vehicle v);
	List<Vehicle> getAllVehicle();
}

