package com.example.hotel.room.service;

import java.util.List;

import com.example.hotel.room.bean.RoomBean;
import com.example.hotel.room.entity.RoomEntity;

public interface RoomService {
	public RoomBean createRoom(RoomBean roomBean);
	public RoomBean getRoomById(int id);
	public List<RoomBean> getListOfRoomList();
	public void deleteRoomById(int id);
	public List<RoomBean> getListofAvailableRooms();
	

}
