package com.example.hotel.reservation.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class ReservationEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Reservation_id")
	private int reservationId;
	
	@Column(name="Check_In")
	private LocalDate checkIn ;
	
	@Column(name="Check_Out")
	private LocalDate checkOut;
	
	@Column(name="Room_No")
	private int roomNumber;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Addhar_Number")
	private long addharNumber;
	
	@Column(name="Pan_Number")
	private String panNumber;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Phone_Number")
	private long phoneNumber;
	
	@Column(name="Permanent_Address")
	private String permanentAddress;
	
	@Column(name="Secondary_address")
	private String secondaryAddress;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="PinCode")
	private int pinCode;
	
	@Column(name="Number_Of_Guest")
	private int numberOfGuest;
	
	@Column(name="Total_Number")
	private int totalAmount;
	
	@Column(name="Room_Id")
	private int roomId;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Transaction_Id")
	private String transactionId;
	
	@Column(name="Special_Request")
	private String specialRequest;
	public ReservationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationEntity(int reservationId, LocalDate checkIn, LocalDate checkOut, int roomNumber, String firstName,
			String lastName, long addharNumber, String panNumber, String email, long phoneNumber,
			String permanentAddress, String secondaryAddress, String city, String state, int pinCode, int numberOfGuest,
			int totalAmount, int roomId, int age, String transactionId, String specialRequest) {
		super();
		this.reservationId = reservationId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.roomNumber = roomNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addharNumber = addharNumber;
		this.panNumber = panNumber;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.permanentAddress = permanentAddress;
		this.secondaryAddress = secondaryAddress;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.numberOfGuest = numberOfGuest;
		this.totalAmount = totalAmount;
		this.roomId = roomId;
		this.age = age;
		this.transactionId = transactionId;
		this.specialRequest = specialRequest;
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
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
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
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
	public long getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(long addharNumber) {
		this.addharNumber = addharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getSecondaryAddress() {
		return secondaryAddress;
	}
	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getNumberOfGuest() {
		return numberOfGuest;
	}
	public void setNumberOfGuest(int numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getSpecialRequest() {
		return specialRequest;
	}
	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}
	
}
