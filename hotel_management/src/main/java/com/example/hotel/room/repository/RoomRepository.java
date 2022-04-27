package com.example.hotel.room.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.room.entity.RoomEntity;

public interface RoomRepository  extends CrudRepository<RoomEntity, Integer> {

}
