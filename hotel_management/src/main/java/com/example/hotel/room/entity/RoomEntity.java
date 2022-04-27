package com.example.hotel.room.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class RoomEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Room_Id")
	private int roomId;
	
	@Column(name="Room_Number")
	private int roomNumber;
	
	@Column(name="Number_of_Beds")
	private int bedNumber;
	
	@Column(name="View")
	private String view;
	
	@Column(name="Room_Type")
	private String roomType;
	
	@Column(name="Price_Per_Night")
	private float pricePerNight ;
	
	@Column(name="Floor_No")
	private int floorNo;
	
	@Column(name="Status")
	private String status;

	public RoomEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public RoomEntity(int roomId, int roomNumber, int bedNumber, String view, String roomType, float pricePerNight,
			int floorNo, String status) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.bedNumber = bedNumber;
		this.view = view;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.floorNo = floorNo;
		this.status = status;
	}





	public int getRoomId() {
		return roomId;
	}





	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}





	public int getFloorNo() {
		return floorNo;
	}


	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public float getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(float pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	

}
