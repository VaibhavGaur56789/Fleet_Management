package com.ltts.demo.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.demo.model.Vehicle;

@Repository
public class VehicleDao {

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
