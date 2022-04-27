package com.example.hotel.guest.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.hotel.room.entity.RoomEntity;

@Entity
@Table(name="Guest")
public class GuestEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Guest_id")
	 private int guestId;
	
	@Column(name="Aadhar_Number")
	 private long aadharNumber;
	
	@Column(name="Phone_Number")
	 private long phoneNumber;
	
	
	
	@Column(name="Email")
	 private String email;
	
	@Column(name="FirstName")
	 private String firstName;
	
	@Column(name="LastName")
	 private String lastName;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Room_No")
	private int roomNo;
	
	@Column(name="Check_In")
	private LocalDate checkIn ;
	
	@Column(name="Check_Out")
	private LocalDate checkOut;
	 
	@Column(name="Room_Id")
	private int roomId;
	
	@OneToOne
	@JoinColumn(name = "Room_Id", nullable = true, insertable = false, updatable = false)
	private RoomEntity roomEntity;

	public GuestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GuestEntity(int guestId, long aadharNumber, long phoneNumber,  String email, String firstName,
			String lastName, int age, int roomNo, LocalDate checkIn, LocalDate checkOut, int roomId,
			RoomEntity roomEntity) {
		super();
		this.guestId = guestId;
		this.aadharNumber = aadharNumber;
		this.phoneNumber = phoneNumber;
	
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.roomNo = roomNo;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.roomId = roomId;
		this.roomEntity = roomEntity;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
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

	
	

	public void setEmail(String email) {
		this.email = email;
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
