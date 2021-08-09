package com.ltts.demo.model;


import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Vehicle  {
	
	
	@Id
	@GeneratedValue
	private int vehicle_id;
	//we use generated value and id to identify vehicle_id as auto incrementing and PK
	private int customer_id;
	private String vehicle_name;
	private LocalDate create_ts;
	
	/*@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date create_ts;
	
	@PrePersist
	private void onCreate() {
		create_ts = new Date();
	}*/
    
	public Vehicle() {
		super();
	}

	public Vehicle( int customer_id, String vehicle_name, LocalDate create_ts) {
		super();
		//this.vehicle_id = vehicle_id;
		this.customer_id = customer_id;
		this.vehicle_name = vehicle_name;
		this.create_ts = create_ts;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public LocalDate getCreate_ts() {
		return create_ts;
	}

	public void setCreate_ts(LocalDate create_ts) {
		this.create_ts = create_ts;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", customer_id=" + customer_id + ", vehicle_name=" + vehicle_name
				+ ", create_ts=" + create_ts + "]";
	}
	
	
	
	
	
}