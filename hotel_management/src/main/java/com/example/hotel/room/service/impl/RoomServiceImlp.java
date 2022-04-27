package com.example.hotel.room.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.guest.entity.GuestEntity;
import com.example.hotel.guest.repository.GuestRepository;
import com.example.hotel.room.bean.RoomBean;
import com.example.hotel.room.entity.RoomEntity;
import com.example.hotel.room.repository.RoomRepository;
import com.example.hotel.room.service.RoomService;

@Service
public class RoomServiceImlp  implements RoomService  {
	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	GuestRepository guestrepository;
	
	@Override
	public RoomBean createRoom(RoomBean roombean)
	{
		RoomEntity roomEntity= null;
		if(roombean!=null)
		{
			roomEntity = new RoomEntity();
			BeanUtils.copyProperties(roombean, roomEntity);
			roomRepository.save(roomEntity);
		}
		if(roomEntity!=null)
		{
			roombean = new RoomBean();
			BeanUtils.copyProperties(roomEntity, roombean);
			return roombean;
		}
		return null;
	}
	
	@Override
	public void deleteRoomById(int id)
	{
		if(id!=0)
		{
			roomRepository.deleteById(id);
		}
	}
	
	@Override
	public RoomBean getRoomById(int id) {
		RoomBean roombean = new RoomBean();
		Optional<RoomEntity> roomEntity = roomRepository.findById(id);
	
		if(roomEntity != null && !"".equals(roomEntity))
		BeanUtils.copyProperties(roomEntity.get(), roombean);
		return roombean;
	}
	
	@Override
	public List<RoomBean> getListOfRoomList() {
		List<RoomEntity> listOfRoomEntity = (List<RoomEntity>) roomRepository.findAll();
		List<RoomBean> listOfRoomBean = null;
		if(listOfRoomEntity!=null && !listOfRoomEntity.isEmpty()) {
			listOfRoomBean = new ArrayList();
			for(RoomEntity roomEntity :listOfRoomEntity) {
				RoomBean roombean = new RoomBean();
				BeanUtils.copyProperties(roomEntity, roombean);
				listOfRoomBean.add(roombean);
			}
		}
		return listOfRoomBean;
	}

	@Override
	public List<RoomBean> getListofAvailableRooms() {
		List<RoomBean> listOfRooms = getListOfRoomList();
		List<RoomBean> listOfRoomBean = new ArrayList();;
		for(RoomBean roombean : listOfRooms) {
			List<GuestEntity> guestentity = guestrepository.getGuestByRoomId(roombean.getRoomId());
			if(guestentity.size()==0) {
				listOfRoomBean.add(roombean);
			}
		}
		return listOfRoomBean;
	}



}
