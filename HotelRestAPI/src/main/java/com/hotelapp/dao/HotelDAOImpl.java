package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
@Service
public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByHotelName(String Name) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel Hotel : showHotelList())
		{
			if(Hotel.getHotelName().equals(Name))
				newHotelList.add(Hotel);
		}
		return newHotelList;
	}

	@Override
	public List<Hotel> getBycity(String city) {
		List<Hotel> newHotelList = new ArrayList<>();
		for (Hotel Hotel : showHotelList())
		{
			if(Hotel.getCity().equals(city))
				newHotelList.add(Hotel);
		}
		// TODO Auto-generated method stub
		return newHotelList;
	}
	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		List<Hotel> newHotelList = new ArrayList<>();
		for (Hotel Hotel : showHotelList())
		{
			if(Hotel.getCuisine().equals(cuisine))
				newHotelList.add(Hotel);
		}
		// TODO Auto-generated method stub
		return newHotelList;
	}

	@Override
	public Hotel getById(int Id) {
		// TODO Auto-generated method stub
		for(Hotel Hotel : showHotelList() ) {
			if(Hotel.getHotelId()==Id)
					return Hotel;
		}
		return null;
	}
	
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel("Garden",101,"Coimbatore","indian"),
				new Hotel("Delhi-darbar",102,"Delhi","indian"),
				new Hotel("Hablis",103,"Mysuru","chinese"),
				new Hotel("ITC-Grandchola",104,"Bangalore","chinese"),
				new Hotel("Kokarako",105,"Mumbai","indian")				);
	}

}
