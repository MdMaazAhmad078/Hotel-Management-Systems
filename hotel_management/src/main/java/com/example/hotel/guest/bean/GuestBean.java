package com.example.hotel.guest.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.hotel.room.entity.RoomEntity;

public class GuestBean {
	
	 private long aadharNumber;
	 private long phoneNumber;
	 private String firstName;
	 private String lastName;
	private int age;
	private int roomNo;
	private LocalDate checkIn ;
	private LocalDate checkOut;
	private String email;
	 private int guestId;
	 private int roomId;
	 private RoomEntity roomEntity;
	 
	public GuestBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GuestBean(long aadharNumber, long phoneNumber, String firstName, String lastName, int age, int roomNo,
			LocalDate checkIn, LocalDate checkOut, String email, int guestId, int roomId, RoomEntity roomEntity) {
		super();
		this.aadharNumber = aadharNumber;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.roomNo = roomNo;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.email = email;
		this.guestId = guestId;
		this.roomId = roomId;
		this.roomEntity = roomEntity;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public RoomEntity getRoomEntity() {
		return roomEntity;
	}

	public void setRoomEntity(RoomEntity roomEntity) {
		this.roomEntity = roomEntity;
	}

	
}
