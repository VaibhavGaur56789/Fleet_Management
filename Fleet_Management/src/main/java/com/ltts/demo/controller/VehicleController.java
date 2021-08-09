package com.ltts.demo.controller;

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

import com.ltts.demo.Dao.VehicleDao;
import com.ltts.demo.model.Vehicle;

@RestController
public class VehicleController {

	@Autowired
	VehicleDao vd;
	
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
	
	/*int vehicle_id = Integer.parseInt(request.getParameter("vid"));There is no
	need of this variable as we use autoincrement vehicle id will be incremented by
	 1 every time we insert other deatils*/
	int customer_id = Integer.parseInt(request.getParameter("cid"));
	String vehicle_name = request.getParameter("vname");
	String create_ts = request.getParameter("vdate");
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	  LocalDate localDate = LocalDate.parse(create_ts, formatter);
	
	Vehicle v = new Vehicle( customer_id, vehicle_name, localDate);
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
