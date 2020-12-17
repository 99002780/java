package com.ltts.bikesim.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ltts.bikesim.bean.Bike;
import com.ltts.bikesim.bean.BikeEvent;
import com.ltts.bikesim.bean.BikeLog;
import com.ltts.bikesim.bean.BikeSimulation;
import com.ltts.bikesim.bean.Location;


@Service
public class BikeService {
	Map<String, Bike> bikeMap = new HashMap<String, Bike>();
	Map<Integer,BikeEvent> bikeEventMap = new HashMap<Integer, BikeEvent>();
	Map<String, BikeLog> vehicleMap = new HashMap<String, BikeLog>();
	

	public BikeService() {
	super();
	// TODO Auto-generated constructor stub
	}

	@Autowired
	private KafkaTemplate<String, Bike> kafkaTemplate;
	
	@Autowired
	private KafkaTemplate<String, BikeEvent> kafkaTemplateBikeEvent;
	
	@Autowired
	private KafkaTemplate<String, BikeLog> kafkaTemplateBikeLog;
	 
	 @Autowired
	 BikeUtil bikeUtil;
	 @Autowired
	 BikeEvent bikeEvent;
	 @Autowired
	 Bike bike;
	 @Autowired
	 BikeSimulation bikeSimulation;
	
	 String vin;
	 String name;
	 

	private static final String TOPICBIKE = "Bike";
	private static final String TOPICBIKEEVENT = "BikeEvent";
	private static final String TOPICBIKELOG = "BikeLog";
	

	/**
	 * Adding VehicelSimulation as a object into VehicleSimulationMap
   */
	/*
	 * public void addSimulation(Bike bike){ bikeMap.put(bike.getVin(), bike); }
	 */
	
	/**
	 * Removing  VehicelSimulation object from VehicleSimulationMap
	 */
	
	 
	 
	

	
	/*
	 * public void postBike(Bike bike) { bikeMap.put(bike.getVin(),bike);
	 * kafkaTemplate.send(TOPICBIKE, bike); }
	 */
	
	public void postBikeEvent(BikeEvent bikeEvent) {
		bikeEventMap.put(bikeEvent.getId(),bikeEvent);
		kafkaTemplateBikeEvent.send(TOPICBIKEEVENT, bikeEvent);
		
	}
	
	
	public String post() throws IOException
	{
		Bike bike = new Bike();
		BikeLog vehicle=vehicleMap.get(vin);
        if(vehicle!=null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    	Date now = new Date();
    	String strDate = sdf.format(now);
    	 bike.setTimestamp(strDate);
    	 Location location = new Location();
		 bikeUtil.readDataFromExcel(location);
		 bike.setLatitude(location.getLatitude());
		 bike.setLongitude(location.getLongitude());
		 bike.setVin(vehicle.getVin());
		 bike.setOdometer(bikeUtil.getRandomNumberLong(200,300));
		 long odometerValue =bike.getOdometer();
		 bike.setSpeed(bikeUtil.calculateSpeedFromRpm(odometerValue));
		 bike.setEngine_status("off");
		 bike.setName(vehicle.getName());
		 System.out.println(bike.getLatitude());
		 System.out.println(bike.getLongitude());
		 bike.setEngine_rpm(bikeUtil.getRandomNumber(200,300));
		 bike.setFuel_capacity(bikeUtil.getRandomNumber(0,15));
		 bike.setEngine_load(bikeUtil.getRandomNumberLong(20,80));
		 bike.setFuel_consumption(bikeUtil.getRandomNumberLong(0,15));
		 bike.setEngine_temp(bikeUtil.getRandomNumberLong(69,100));
		 kafkaTemplate.send(TOPICBIKE, bike);}
        else
        {
        	System.out.println("no vehicle data");
        }
		
		return "success";
	}
	public String bikeEvent()
	{
		bikeEventRandom();
		kafkaTemplateBikeEvent.send(TOPICBIKEEVENT, bikeEvent);
		return "success";
	}
	
	public void bikeRegister(BikeLog vehicle)
	{
		 vin = vehicle.getVin();
         name = vehicle.getName();
        vehicleMap.put(vehicle.getVin(), vehicle);
        System.out.println(vehicleMap);
         kafkaTemplateBikeLog.send(TOPICBIKELOG,vehicle);
	}
	
	public void bikeEventRandom()
	{
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    Date now = new Date();
	    String strDate = sdf.format(now);
	    bikeEvent.setTimestamp(strDate);
		bikeEvent.setId(bikeUtil.getEventId()+1);
		bikeEvent.setVin("honda2010a7");
		bikeEvent.setLatitude(bikeUtil.getRandomNumberDouble(10,100));
		bikeEvent.setLongitude(bikeUtil.getRandomNumberDouble(10,100));
		bikeEvent.setAltitude(bikeUtil.getRandomNumber(12,50));
		bikeEvent.setHeading(bikeUtil.getRandomNumber(0,360));
		bikeEvent.setSpeed(bikeUtil.getRandomNumber(0,120));
		bikeEvent.setBrake_operation(bikeUtil.getRandomElement());
		bikeEvent.setLight_status(bikeUtil.getRandomElement());
		bikeEvent.setTire_pressure_front(bikeUtil.getRandomNumber(0,35));
		bikeEvent.setTire_pressure_rear(bikeUtil.getRandomNumber(0,40));
		bikeEvent.setHandle_angle(bikeUtil.getRandomNumberDouble(0,180));



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public String post() { // TODO Auto-generated method stub
	 * kafkaTemplate.send(TOPIC, new
	 * Bike(89,"off",25.99,789L,"him",9L,56,78,3,5L,67L,56L));
	 * 
	 * 
	 * 
	 * return "Published successfully";
	 * 
	 * }
	 */
}
