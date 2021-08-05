package com.ltts.demo.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.demo.model.Vehicle;

public interface VehicleDao {
	boolean insertVehicle(Vehicle v);
	List<Vehicle> getAllVehicle();
}

