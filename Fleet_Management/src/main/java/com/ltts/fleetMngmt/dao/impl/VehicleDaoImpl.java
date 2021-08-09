package com.ltts.fleetMngmt.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ltts.fleetMngmt.dao.VehicleDao;
import com.ltts.fleetMngmt.model.Vehicle;


@Transactional
@Repository
@Service
public class VehicleDaoImpl implements VehicleDao {
	
	@Autowired
	private SessionFactory sf;
	
	public boolean insertVehicle(Vehicle v) {
	
		boolean b = false;
		Session s = null;
		
		try {
			s = sf.openSession();		
			s.beginTransaction();
			
			s.save(v);
			s.getTransaction().commit();
		}
		
		catch(Exception e) {
			System.out.println("Exception" + e);
			b = true;
		}
		
		return b;
	}
	
	public List<Vehicle> getAllVehicle() {
		Session session = sf.openSession();
		session.beginTransaction();
		
		List<Vehicle> li = sf.openSession().createCriteria(Vehicle.class).list();
		session.getTransaction().commit();
		
		return li;
	}
}

