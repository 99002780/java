package com.ltts.bikesim.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
public class BikeEvent {
	Integer id;
	String vin;
	Double latitude;
	Double longitude;
	Integer altitude; 
	Integer heading;
	Integer speed; 
	String brake_operation;
	String light_status; 
	Integer tire_pressure_front;
	Integer tire_pressure_rear;
	Double handle_angle;
	String timestamp;
	public BikeEvent(Integer id, String vin, Double latitude, Double longitude, Integer altitude, Integer heading,
			Integer speed, String brake_operation, String light_status, Integer tire_pressure_front,
			Integer tire_pressure_rear, Double handle_angle, String timestamp) {
		super();
		this.id = id;
		this.vin = vin;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.heading = heading;
		this.speed = speed;
		this.brake_operation = brake_operation;
		this.light_status = light_status;
		this.tire_pressure_front = tire_pressure_front;
		this.tire_pressure_rear = tire_pressure_rear;
		this.handle_angle = handle_angle;
		this.timestamp = timestamp;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
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
	public Integer getAltitude() {
		return altitude;
	}
	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}
	public Integer getHeading() {
		return heading;
	}
	public void setHeading(Integer heading) {
		this.heading = heading;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getBrake_operation() {
		return brake_operation;
	}
	public void setBrake_operation(String brake_operation) {
		this.brake_operation = brake_operation;
	}
	public String getLight_status() {
		return light_status;
	}
	public void setLight_status(String light_status) {
		this.light_status = light_status;
	}
	public Integer getTire_pressure_front() {
		return tire_pressure_front;
	}
	public void setTire_pressure_front(Integer tire_pressure_front) {
		this.tire_pressure_front = tire_pressure_front;
	}
	public Integer getTire_pressure_rear() {
		return tire_pressure_rear;
	}
	public void setTire_pressure_rear(Integer tire_pressure_rear) {
		this.tire_pressure_rear = tire_pressure_rear;
	}
	public Double getHandle_angle() {
		return handle_angle;
	}
	public void setHandle_angle(Double handle_angle) {
		this.handle_angle = handle_angle;
	}
	
	public BikeEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BikeEvent [id=" + id + ", vin=" + vin + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", altitude=" + altitude + ", heading=" + heading + ", speed=" + speed + ", brake_operation="
				+ brake_operation + ", light_status=" + light_status + ", tire_pressure_front=" + tire_pressure_front
				+ ", tire_pressure_rear=" + tire_pressure_rear + ", handle_angle=" + handle_angle + ", timestamp="
				+ timestamp + "]";
	}
	
	
}
