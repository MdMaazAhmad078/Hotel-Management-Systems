package com.example.hotel.staff.service;

import java.util.List;

import com.example.hotel.staff.bean.StaffBean;

public interface StaffService {
	public void createStaff(StaffBean staffBean);
	public StaffBean getStaffById(int id);
	public List<StaffBean> getListOfStaffList();
	public void deleteStaffById(int id);
}
