package com.example.hotel.guest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.hotel.guest.entity.GuestEntity;



public interface GuestRepository extends CrudRepository<GuestEntity, Integer> {
	
	@Query("from GuestEntity where roomId=:roomId")
	List<GuestEntity> getGuestByRoomId(int roomId);
	

}
