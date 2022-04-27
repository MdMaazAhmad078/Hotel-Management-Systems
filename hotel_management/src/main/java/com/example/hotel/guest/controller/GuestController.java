package com.example.hotel.guest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.guest.bean.GuestBean;
import com.example.hotel.guest.service.GuestService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class GuestController {
	
	@Autowired
	GuestService guestService;
	
	
	@PostMapping(value="/CreateGuest")
	public void createGuest(@RequestBody GuestBean guestBean)
	{
		guestService.createGuest(guestBean);
	}
	
	@DeleteMapping(value="/DeleteGuest/{id}")
	public void deleteGuestbyId(@PathVariable("id") int id) {
		 guestService.deleteGuestById(id);
	}
	
	@PostMapping(value="GetGuestByID/{id}")
	public GuestBean getGuestbyId(@PathVariable("id") int id)
	{
		return guestService.getGuestById(id);
	}
	
	@GetMapping(value=" GetListOfGuest")
	public List<GuestBean> getListOfGuestList()
	{
		return guestService.getListOfGuestList();
	}

}
