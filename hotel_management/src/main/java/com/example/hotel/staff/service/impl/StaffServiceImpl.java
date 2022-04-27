package com.example.hotel.staff.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.staff.bean.StaffBean;
import com.example.hotel.staff.entity.StaffEntity;
import com.example.hotel.staff.repository.StaffRepository;
import com.example.hotel.staff.service.StaffService;
@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
	
	@Override
	public void createStaff(StaffBean staffBean)
	{
		StaffEntity staffEntity = new StaffEntity();
		if(staffBean != null)
		BeanUtils.copyProperties(staffBean, staffEntity);
		staffRepository.save(staffEntity);

		
		
	}
	
	@Override
	public void deleteStaffById(int id)
	{
		if(id!=0)
		{
			staffRepository.deleteById(id);
		}
	}
	
	@Override
	public StaffBean getStaffById(int id) {
		StaffBean staffBean = new StaffBean();
		Optional<StaffEntity> staffEntity = staffRepository.findById(id);
	
		if(staffEntity != null && !"".equals(staffEntity))
		BeanUtils.copyProperties(staffEntity.get(), staffBean);
		return staffBean;
	}
	
	@Override
	public List<StaffBean> getListOfStaffList() {
		List<StaffEntity> listOfStaffEntity = (List<StaffEntity>) staffRepository.findAll();
		List<StaffBean> listOfStaffBean = null;
		if(listOfStaffEntity!=null && !listOfStaffEntity.isEmpty()) {
			listOfStaffBean = new ArrayList();
			for(StaffEntity staffEntity :listOfStaffEntity) {
				StaffBean staffBean = new StaffBean();
				BeanUtils.copyProperties(staffEntity, staffBean);
				listOfStaffBean.add(staffBean);
			}
		}
		return listOfStaffBean;
	}


}
