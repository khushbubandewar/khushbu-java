package com.hostel.model;

import java.util.List;

public class Block {
	private String name;
	private List<Building> Building;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Building> getBuilding() {
		return Building;
	}
	public void setBuilding(List<Building> building) {
		Building = building;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Block [name=" + name + ", Building="
				+ (Building != null ? Building.subList(0, Math.min(Building.size(), maxLen)) : null) + "]";
	}


}
