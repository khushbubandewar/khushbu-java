package com.hostel.model;

import java.util.List;

public class Floor {
	private	String floorName;
	private	List<Room> RoomList;
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public List<Room> getRoom() {
		return RoomList;
	}
	public void setRoom(List<Room> roomList) {
		RoomList = roomList;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Floor [floorName=" + floorName + ", Room="
				+ (RoomList != null ? RoomList.subList(0, Math.min(RoomList.size(), maxLen)) : null) + "]";
	}


}
