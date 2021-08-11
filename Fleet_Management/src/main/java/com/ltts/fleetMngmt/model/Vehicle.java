package com.ltts.fleetMngmt.model;


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
	private int vehicleId;
	private int customerId;
	private String vehicleName;
	private LocalDate createTs;
	
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

	public Vehicle(int vehicleId, int customerId, String vehicleName, LocalDate createTs) {
		super();
		this.vehicleId = vehicleId;
		this.customerId = customerId;
		this.vehicleName = vehicleName;
		this.createTs = createTs;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public LocalDate getCreateTs() {
		return createTs;
	}

	public void setCreatrTs(LocalDate createTs) {
		this.createTs = createTs;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicleId + ", customer_id=" + customerId + ", vehicle_name=" + vehicleName
				+ ", create_ts=" + createTs + "]";
	}
	
	
	
	
	
}