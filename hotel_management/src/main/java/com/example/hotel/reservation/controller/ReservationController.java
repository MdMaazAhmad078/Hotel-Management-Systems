package com.example.hotel.reservation.controller;

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

import com.example.hotel.reservation.bean.ReservationBean;
import com.example.hotel.reservation.service.ReservationService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	
	@PostMapping(value="/CreateReservation")
	public void createReservation(@RequestBody ReservationBean reservationBean)
	{
		reservationService.createReservation(reservationBean);
	}
	
	@DeleteMapping(value="/DeleteReservation/{id}")
	public void deleteReservationbyId(@PathVariable("id") int id) {
		 reservationService.deleteReservationById(id);
	}
	
	@PostMapping(value="GetReservationByID/{id}")
	public ReservationBean getReservationbyId(@PathVariable("id") int id)
	{
		return reservationService.getReservationById(id);
	}
	
	@GetMapping(value=" GetListOfReservation")
	public List<ReservationBean> getListOfReservationList()
	{
		return reservationService.getListOfReservationList();
	}


}
