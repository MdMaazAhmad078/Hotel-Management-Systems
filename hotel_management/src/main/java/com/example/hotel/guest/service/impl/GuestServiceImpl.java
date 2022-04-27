package com.example.hotel.guest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.guest.bean.GuestBean;
import com.example.hotel.guest.entity.GuestEntity;
import com.example.hotel.guest.repository.GuestRepository;
import com.example.hotel.guest.service.GuestService;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestRepository guestRepository;
	
	@Override
	public GuestBean createGuest(GuestBean guestbean)
	{
		GuestEntity guestEntity= null;
		if(guestbean!=null)
		{
			guestEntity = new GuestEntity();
			BeanUtils.copyProperties(guestbean, guestEntity);
			guestRepository.save(guestEntity);
		}
		if(guestEntity!=null)
		{
			guestbean = new GuestBean();
			BeanUtils.copyProperties(guestEntity, guestbean);
			return guestbean;
		}
		return null;
	}
	
	@Override
	public void deleteGuestById(int id)
	{
		if(id!=0)
		{
			guestRepository.deleteById(id);
		}
	}
	
	@Override
	public GuestBean getGuestById(int id) {
		GuestBean guestbean = new GuestBean();
		Optional<GuestEntity> guestEntity = guestRepository.findById(id);
	
		if(guestEntity != null && !"".equals(guestEntity))
		BeanUtils.copyProperties(guestEntity.get(), guestbean);
		return guestbean;
	}
	
	@Override
	public List<GuestBean> getListOfGuestList() {
		List<GuestEntity> listOfGuestEntity = (List<GuestEntity>) guestRepository.findAll();
		List<GuestBean> listOfGuestBean = null;
		if(listOfGuestEntity!=null && !listOfGuestEntity.isEmpty()) {
			listOfGuestBean = new ArrayList();
			for(GuestEntity guestEntity :listOfGuestEntity) {
				GuestBean guestbean = new GuestBean();
				BeanUtils.copyProperties(guestEntity, guestbean);
				listOfGuestBean.add(guestbean);
			}
		}
		return listOfGuestBean;
	}


	}


