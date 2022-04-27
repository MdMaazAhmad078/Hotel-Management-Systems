package com.example.hotel.reservation.service;

import java.util.List;

import com.example.hotel.reservation.bean.ReservationBean;

public interface ReservationService {
	public void createReservation(ReservationBean reservationBean);
	public ReservationBean getReservationById(int id);
	public List<ReservationBean> getListOfReservationList();
	public void deleteReservationById(int id);

}
