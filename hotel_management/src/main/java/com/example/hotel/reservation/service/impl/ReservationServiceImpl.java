package com.example.hotel.reservation.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.guest.bean.GuestBean;
import com.example.hotel.guest.entity.GuestEntity;
import com.example.hotel.guest.repository.GuestRepository;
import com.example.hotel.reservation.bean.ReservationBean;
import com.example.hotel.reservation.entity.ReservationEntity;
import com.example.hotel.reservation.repository.ReservationRepository;
import com.example.hotel.reservation.service.ReservationService;
import com.example.hotel.room.bean.RoomBean;
import com.example.hotel.room.service.RoomService;
@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	RoomService roomservice;
	
	@Autowired
	GuestRepository guestrepository;
	
	@Override
	public void createReservation(ReservationBean reservationbean)
	{
		ReservationEntity reservationEntity= null;
		GuestEntity guestdata = new GuestEntity() ;
		if(reservationbean!=null)
		{
			RoomBean roombean = roomservice.getRoomById(reservationbean.getRoomId());
			reservationbean.setRoomNumber(roombean.getRoomNumber());
			reservationEntity = new ReservationEntity();
			BeanUtils.copyProperties(reservationbean, reservationEntity);
			guestdata.setAadharNumber(reservationbean.getAddharNumber());
			guestdata.setAge(reservationbean.getAge());
			guestdata.setFirstName(reservationbean.getFirstName());
			guestdata.setLastName(reservationbean.getLastName());
			guestdata.setCheckIn(reservationbean.getCheckIn());
			guestdata.setCheckOut(reservationbean.getCheckOut());
			guestdata.setRoomId(reservationbean.getRoomId());
			guestdata.setRoomNo(roombean.getRoomNumber());
			guestdata.setPhoneNumber(reservationbean.getPhoneNumber());
			guestdata.setEmail(reservationbean.getEmail());
			reservationRepository.save(reservationEntity);
			guestrepository.save(guestdata);
			
		}
		
		
	}
	
	@Override
	public void deleteReservationById(int id)
	{
		if(id!=0)
		{
			reservationRepository.deleteById(id);
		}
	}
	
	@Override
	public ReservationBean getReservationById(int id) {
		ReservationBean reservationbean = new ReservationBean();
		Optional<ReservationEntity> reservationEntity = reservationRepository.findById(id);
	
		if(reservationEntity != null && !"".equals(reservationEntity))
		BeanUtils.copyProperties(reservationEntity.get(), reservationbean);
		return reservationbean;
	}
	
	@Override
	public List<ReservationBean> getListOfReservationList() {
		List<ReservationEntity> listOfReservationEntity = (List<ReservationEntity>) reservationRepository.findAll();
		List<ReservationBean> listOfReservationBean = null;
		if(listOfReservationEntity!=null && !listOfReservationEntity.isEmpty()) {
			listOfReservationBean = new ArrayList();
			for(ReservationEntity reservationEntity :listOfReservationEntity) {
				ReservationBean reservationbean = new ReservationBean();
				BeanUtils.copyProperties(reservationEntity, reservationbean);
				listOfReservationBean.add(reservationbean);
			}
		}
		return listOfReservationBean;
	}



}
