package com.hotelapp.service;

import java.util.List;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.dao.HotelDAOImpl;
import com.hotelapp.model.Hotel;

public class HotelServiceImpl implements HotelService{

	HotelDAO hotelDAO = new HotelDAOImpl();
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelDAO.getAllHotels();
	}

	@Override
	public List<Hotel> getByHotelName(String Name) {
		// TODO Auto-generated method stub
		return hotelDAO.getByHotelName(Name);
	}

	@Override
	public List<Hotel> getBycity(String city) {
		// TODO Auto-generated method stub
		return hotelDAO.getBycity(city);
		
	}

	@Override
	public Hotel getById(int Id) {
		// TODO Auto-generated method stub
		return hotelDAO.getById(Id);
	}
	

}
