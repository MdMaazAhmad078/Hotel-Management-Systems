package com.example.hotel.guest.service;

import java.util.List;

import com.example.hotel.guest.bean.GuestBean;

public interface GuestService {
	public GuestBean createGuest(GuestBean guestBean);
	public GuestBean getGuestById(int id);
	public List<GuestBean> getListOfGuestList();
	public void deleteGuestById(int id);
	
}
