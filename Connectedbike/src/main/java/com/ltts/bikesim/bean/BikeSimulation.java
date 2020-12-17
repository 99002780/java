package com.ltts.bikesim.bean;

import org.springframework.stereotype.Component;

@Component

public class BikeSimulation {

	private String vin;
	private Integer speed;
	private Integer heading;
	private Double latitude;
	private Double longitude;
	private Long odometer = 250L;
	private String timestamp;
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getHeading() {
		return heading;
	}
	public void setHeading(Integer heading) {
		this.heading = heading;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Long getOdometer() {
		return odometer;
	}
	public void setOdometer(Long odometer) {
		this.odometer = odometer;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public BikeSimulation(String vin, Integer speed, Integer heading, Double latitude, Double longitude, Long odometer,
			String timestamp) {
		super();
		this.vin = vin;
		this.speed = speed;
		this.heading = heading;
		this.latitude = latitude;
		this.longitude = longitude;
		this.odometer = odometer;
		this.timestamp = timestamp;
	}
	public BikeSimulation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * // * Queue data structure with fixed size to hold the status-logs of vehicle
	 * simulation. //
	 *//*
		 * @JsonIgnore public LinkedBlockingQueue<String> vehicleSimulationLog = new
		 * LinkedBlockingQueue<>(40);
		 * 
		 * @JsonIgnore List<String> dtc_list =new ArrayList<>();
		 */

}
