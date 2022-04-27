package com.example.hotel.room.controller;

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
import com.example.hotel.room.bean.RoomBean;
import com.example.hotel.room.service.RoomService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class RoomController {

	@Autowired
	RoomService roomService;
	
	
	
	@PostMapping(value="/CreateRoom")
	public void createRoom(@RequestBody RoomBean roomBean)
	{
		roomService.createRoom(roomBean);
	}
	
	@DeleteMapping(value="/DeleteRoom/{id}")
	public void deleteRoomtbyId(@PathVariable("id") int id) {
		 roomService.deleteRoomById(id);
	}
	
	@PostMapping(value="GetRoomByID/{id}")
	public RoomBean getRoombyId(@PathVariable("id") int id)
	{
		return roomService.getRoomById(id);
	}
	
	@GetMapping(value=" GetListOfRoom")
	public List<RoomBean> getListOfRoomList()
	{
		return roomService.getListOfRoomList();
	
}
	
	@GetMapping(value=" getListofAvailableRooms")
	public List<RoomBean> getListofAvailableRooms() {
		return roomService.getListofAvailableRooms();
	}
	
	
}