package com.ltts.bikesim.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Component
public class Bike {
	 private String vin;
	 private Integer speed;
	 private String engine_status;
	 private Double latitude;
	 private Double longitude;
	 private String name;
	 private Long odometer; 
	 private Integer engine_rpm;
	 private Integer fuel_capacity;
	 private Long engine_load;
	 private Long fuel_consumption;
	 private Long engine_temp;
	 private String timestamp;
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
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
	public String getEngine_status() {
		return engine_status;
	}
	public void setEngine_status(String engine_status) {
		this.engine_status = engine_status;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getOdometer() {
		return odometer;
	}
	public void setOdometer(Long odometer) {
		this.odometer = odometer;
	}
	public Integer getEngine_rpm() {
		return engine_rpm;
	}
	public void setEngine_rpm(Integer engine_rpm) {
		this.engine_rpm = engine_rpm;
	}
	public Integer getFuel_capacity() {
		return fuel_capacity;
	}
	public void setFuel_capacity(Integer fuel_capacity) {
		this.fuel_capacity = fuel_capacity;
	}
	public Long getEngine_load() {
		return engine_load;
	}
	public void setEngine_load(Long engine_load) {
		this.engine_load = engine_load;
	}
	public Long getFuel_consumption() {
		return fuel_consumption;
	}
	public void setFuel_consumption(Long fuel_consumption) {
		this.fuel_consumption = fuel_consumption;
	}
	public Long getEngine_temp() {
		return engine_temp;
	}
	public void setEngine_temp(Long engine_temp) {
		this.engine_temp = engine_temp;
	}
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(String vin, Integer speed, String engine_status, Double latitude, Double longitude, String name,
			Long odometer, Integer engine_rpm, Integer fuel_capacity, Long engine_load, Long fuel_consumption,
			Long engine_temp, String timestamp) {
		super();
		this.vin = vin;
		this.speed = speed;
		this.engine_status = engine_status;
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
		this.odometer = odometer;
		this.engine_rpm = engine_rpm;
		this.fuel_capacity = fuel_capacity;
		this.engine_load = engine_load;
		this.fuel_consumption = fuel_consumption;
		this.engine_temp = engine_temp;
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Bike [vin=" + vin + ", speed=" + speed + ", engine_status=" + engine_status + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", name=" + name + ", odometer=" + odometer + ", engine_rpm="
				+ engine_rpm + ", fuel_capacity=" + fuel_capacity + ", engine_load=" + engine_load
				+ ", fuel_consumption=" + fuel_consumption + ", engine_temp=" + engine_temp + ", timestamp=" + timestamp
				+ "]";
	}
	
	}	 
	 

