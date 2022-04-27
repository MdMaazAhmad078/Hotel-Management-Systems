package com.example.hotel.reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.reservation.entity.ReservationEntity;

public interface ReservationRepository  extends CrudRepository<ReservationEntity, Integer> {

}
