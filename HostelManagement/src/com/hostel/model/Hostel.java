package com.hostel.model;

import java.util.List;

public class Hostel {
	private String name;
	private String address;
	private List<Block> blockList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Block> getBlockList() {
		return blockList;
	}

	public void setBlockList(List<Block> blockList) {
		this.blockList = blockList;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Hostel [name=" + name + ", address=" + address + ", blockList="
				+ (blockList != null ? blockList.subList(0, Math.min(blockList.size(), maxLen)) : null) + "]";
	}

}
