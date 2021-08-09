package com.ltts.fleetMngmt.controller;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.fleetMngmt.dao.VehicleDao;
import com.ltts.fleetMngmt.dao.impl.VehicleDaoImpl;
import com.ltts.fleetMngmt.model.Vehicle;

@RestController
public class VehicleController {

	@Autowired
	VehicleDaoImpl vd;
	
	@RequestMapping("/")
	public ModelAndView firstMethod() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/vehicle")
	public ModelAndView vehicleMethod() {
		return new ModelAndView("addvehicle");
	}
	
	@RequestMapping(value="/insertVehicle", method = RequestMethod.POST)
	public ModelAndView vehicleInsertMethod(HttpServletRequest request) {
		
	ModelAndView mv = null;
	
	int vehicleId = Integer.parseInt(request.getParameter("vid"));
	int customerId = Integer.parseInt(request.getParameter("cid"));
	String vehicleName = request.getParameter("vname");
	String createTs = request.getParameter("vdate");
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	  LocalDate localDate = LocalDate.parse(createTs, formatter);
	
	Vehicle v = new Vehicle(vehicleId, customerId, vehicleName, localDate);
	boolean b = vd.insertVehicle(v);
	
	if(b == false) {
		return mv = new ModelAndView("success");
	}
	else {
		return mv = new ModelAndView("error");
	}	
	}
	
	@RequestMapping("/viewvehicle")
	public ModelAndView viewVehicle(Model model) {
		ModelAndView mv = new ModelAndView("viewvehicle");
		List<Vehicle> vl = vd.getAllVehicle();
		model.addAttribute("vehicle", vl);
		return mv;
	}
	
}