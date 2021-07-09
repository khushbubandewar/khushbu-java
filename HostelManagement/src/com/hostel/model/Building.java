package com.hostel.model;

import java.util.List;

public class Building {
	private	String buildingName;
	private	List<Floor> Floor;

	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	public List<Floor> getFloor() {
		return Floor;
	}
	public void setFloor(List<Floor> floor) {
		Floor = floor;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Building [buildingName=" + buildingName + "" + (Floor != null ? Floor.subList(0, Math.min(Floor.size(), maxLen)) : null) + "]";
	}

}
