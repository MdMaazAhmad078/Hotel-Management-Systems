package com.example.hotel.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.staff.bean.StaffBean;
import com.example.hotel.staff.service.StaffService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	
	@PostMapping(value="/CreateStaff")
	public void createStaff(@RequestBody StaffBean staffBean)
	{
		staffService.createStaff(staffBean);
	}
	
	@DeleteMapping(value="/DeleteStaff/{id}")
	public void deleteStaffbyId(@PathVariable("id") int id) {
		 staffService.deleteStaffById(id);
	}
	
	@PostMapping(value="GetStaffByID/{id}")
	public StaffBean getStaffbyId(@PathVariable("id") int id)
	{
		return staffService.getStaffById(id);
	}
	
	@GetMapping(value=" GetListOfStaff")
	public List<StaffBean> getListOfStaffList()
	{
		return staffService.getListOfStaffList();
	}


}
