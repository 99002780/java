package com.hotelapp.dao;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelDAO {

	List<Hotel> getAllHotels();
	List<Hotel> getByHotelName(String Name);
	List<Hotel> getBycity(String city);
	Hotel getById(int Id);
}
