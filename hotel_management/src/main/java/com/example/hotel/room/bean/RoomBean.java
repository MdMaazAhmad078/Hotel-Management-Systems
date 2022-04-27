package com.example.hotel.room.bean;

public class RoomBean {
	private int roomId;
	private int roomNumber;
	private int bedNumber;
	private String view;
	private String roomType;
	private float pricePerNight ;
	private int floorNo;
	private String status;
	
	public RoomBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	public RoomBean(int roomId, int roomNumber, int bedNumber, String view, String roomType, float pricePerNight,
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
