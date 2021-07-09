package com.hostel.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.hostel.model.Block;
import com.hostel.model.Building;
import com.hostel.model.Floor;
import com.hostel.model.Hostel;
import com.hostel.model.Room;
import com.hostel.model.Student;

public class HostelData {
	public static Map<String, List<Block>> hostelData = new HashMap<String, List<Block>>();
	public static List<Block> blockList = new ArrayList<Block>();
	private static int rollNo = 10000;
	static {

		blockList.add(createHostelData("Agni", 4, 5, 6, 2, 4, 2));
		blockList.add(createHostelData("Vayu", 4, 5, 6, 2, 4, 2));
		blockList.add(createHostelData("Jal", 4, 5, 6, 2, 4, 2));
		blockList.add(createHostelData("Prithvi", 4, 5, 6, 2, 4, 2));
		hostelData.put("XYZHostel", blockList);
	}

	public static Block createHostelData(String blockName, int noOfBuilding, int noOfFloors, int noOfRooms,
			int noOfStdInRoom, int roomCapacity, int noOfStudent) {
		Block block = new Block();
		List<Building> buildingList = new ArrayList<Building>();
		for (int i = 1; i <= noOfBuilding; i++) {
			Building building1 = new Building();
			building1.setBuildingName(blockName + i);
			int studentNameIndex = 0;
			List<Floor> floorList = new ArrayList<Floor>();
			for (int j = 1; j <= noOfFloors; j++) {
				Floor floor = new Floor();
				if (j == 1) {
					floor.setFloorName("1st Floor");
				} else if (j == 2) {
					floor.setFloorName("2nd Floor");
				} else if (j == 3) {
					floor.setFloorName("3rd Floor");
				} else {
					floor.setFloorName(j + "th Floor");
				}
				List<Room> roomList = new ArrayList<Room>();
				for (int k = 1; k <= noOfRooms; k++) {
					List<Student> studentList = new ArrayList<Student>();

					Room room = new Room();
					String blkName = "";
					if (i == 1) {
						blkName = "A";
					} else if (i == 2) {
						blkName = "B";
					} else if (i == 3) {
						blkName = "C";
					} else if (i == 4) {
						blkName = "D";
					}
					room.setRoomNo(blkName + "-" + (j * 100 + k));
					room.setOccupiedStudent(noOfStdInRoom);
					room.setTotalOccupancy(roomCapacity);

					String fileName = "D:\\khushbu\\HostelManagement\\src\\com\\hostel\\data" + blkName
							+ "StudentList.txt";
					List<String> studentNameList = new ArrayList<>();
				try {
					File file = new File(fileName);

					BufferedReader br = new BufferedReader(new FileReader(file));
					
					String st;
					while ((st = br.readLine()) != null) {
						studentNameList.add(st);
					}
				}catch(FileNotFoundException FNFE) {
					System.out.println("File Not Found Exception ");
					String fileName1 = "D:\\khushbu\\HostelManagement\\src\\com\\hostel\\data" + blkName
							+ "StudentList.txt";
				try {
					File file1 = new File(fileName1);

					BufferedReader br = new BufferedReader(new FileReader(file1));
					
					String st;
					while ((st = br.readLine()) != null) {
						studentNameList.add(st);
					}
				}catch(Exception e) {
						
					}
				}catch(IOException ioe) {
					System.out.println("IO Not Found");
				}catch(Exception e) {
					System.out.println("Common exception");
				}
					for (int l = 1; l <= noOfStudent; l++) {
						studentNameIndex = studentNameIndex + 1;
						Student student = new Student();
						try {
							student.setName(studentNameList.get(studentNameIndex));
						} catch (Exception e) {
							student.setName("Dummy");
						}
						rollNo = rollNo + 1;
						student.setRollNo(rollNo + "");
						student.setRoomNo(room.getRoomNo());
						studentList.add(student);
					}
					room.setStudent(studentList);
					roomList.add(room);
				}
				floor.setRoom(roomList);
				floorList.add(floor);
			}
			building1.setFloor(floorList);
			buildingList.add(building1);
		}

		block.setName(blockName);
		block.setBuilding(buildingList);
		return block;
	}

	public static Map<String, String> getStudentHostelDetail(int stdRollNo) {
		String stRollNo = stdRollNo + "";
		Map<String, String> studentHostelDetailsMap = new LinkedHashMap<>();
		List<Block> blockList = hostelData.get("XYZHostel");
		boolean isStudentFound = false;
		if (blockList != null) {
			for (Block block : blockList) {
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
					List<Floor> floorList = building.getFloor();
					for (Floor floor : floorList) {
						List<Room> roomList = floor.getRoom();
						for (Room room : roomList) {
							List<Student> studentList = room.getStudent();
							for (Student student : studentList) {
								if (student.getRollNo().equals(stRollNo)) {
									studentHostelDetailsMap.put("Student Name : ", student.getName());
									studentHostelDetailsMap.put("Student Roll No : ", student.getRollNo());
									studentHostelDetailsMap.put("Room No : ", room.getRoomNo());
									studentHostelDetailsMap.put("Floor Name : ", floor.getFloorName());
									studentHostelDetailsMap.put("Building Name : ", building.getBuildingName());
									studentHostelDetailsMap.put("Block Name : ", block.getName());
									isStudentFound = true;
									break;
								}
							}
							if (isStudentFound) {
								break;
							}
						}
						if (isStudentFound) {
							break;
						}
					}
					if (isStudentFound) {
						break;
					}
				}
			}
		}
		return studentHostelDetailsMap;
	}
	
	public static Map<String, String> getStudentsInfo() {
		Map<String, String> studentHostelDetailsMap = new HashMap<>();
		List<Block> blockList = hostelData.get("XYZHostel");
		boolean isStudentFound = false;
		if (blockList != null) {
			for (Block block : blockList) {
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
					List<Floor> floorList = building.getFloor();
					for (Floor floor : floorList) {
						List<Room> roomList = floor.getRoom();
						for (Room room : roomList) {
							List<Student> studentList = room.getStudent();
							for (Student student : studentList) {

							}

						}

					}
				}
			}
		}
		return studentHostelDetailsMap;
	}

	public static int getTotalStudents() {
		int totalNoOfStudent = 0;
		Map<String, Object> studentHostelDetailsMap = new HashMap<>();
		List<Block> blockList = hostelData.get("XYZHostel");
		boolean isStudentFound = false;
		if (blockList != null) {
			for (Block block : blockList) {
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
					List<Floor> floorList = building.getFloor();
					for (Floor floor : floorList) {
						List<Room> roomList = floor.getRoom();
						for (Room room : roomList) {
							List<Student> studentList = room.getStudent();
							for (Student student : studentList) {
								// if(student.getRollNo().equals("10746")) {
								// studentHostelDetailsMap.put("student", student);
								// studentHostelDetailsMap.put("room", room);
								// studentHostelDetailsMap.put("floor", floor);
								// studentHostelDetailsMap.put("building", room);
								// studentHostelDetailsMap
								// isStudentFound= true;
								// }
								totalNoOfStudent = totalNoOfStudent + 1;
							}
						}
					}
				}
			}
		}
		return totalNoOfStudent;

	}

	
	public static Map<String, Object> getBuildingInfo(String buildingName) {
		Map<String, Object> studentHostelDetailsMap = new HashMap<>();
		List<Block> blockList = hostelData.get("XYZHostel");
		boolean isRoomFound = false;
		if (blockList != null) {
			for (Block block : blockList) {
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
						if(building.getBuildingName().equals(buildingName)) {
									studentHostelDetailsMap.put("Building Name  :", building.getBuildingName());
									studentHostelDetailsMap.put("Floors of building :", building.getFloor());
									studentHostelDetailsMap.put("block Name  :", block.getName());
							}
						}
					}
				}
		return studentHostelDetailsMap;

	}


	public static Map<String, Object> getFloorInfo(String floorNo) {
		Map<String, Object> studentHostelDetailsMap = new HashMap<>();
		List<Block> blockList = hostelData.get("XYZHostel");
		boolean isRoomFound = false;
		if (blockList != null) {
			for (Block block : blockList) {
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
					List<Floor> floorList = building.getFloor();
					for (Floor floor : floorList) {
						if(floor.getFloorName().equals(floorNo)) {
									studentHostelDetailsMap.put("Floor Name  :", floor.getFloorName());
									studentHostelDetailsMap.put("Room of Floor  :", floor.getRoom());
									studentHostelDetailsMap.put("building Name  :", building.getBuildingName());
									studentHostelDetailsMap.put("block Name  :", block.getName());
								}
							}
						}
					}
				}
		return studentHostelDetailsMap;

	}
		
		



	public static Map<String, Object> getRoomInfo(String roomNo) {
		Map<String, Object> studentHostelDetailsMap = new HashMap<>();
		List<Block> blockList = hostelData.get("XYZHostel");
		boolean isRoomFound = false;
		if (blockList != null) {
			for (Block block : blockList) {
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
					List<Floor> floorList = building.getFloor();
					for (Floor floor : floorList) {
						List<Room> roomList = floor.getRoom();
						for (Room room : roomList) {
								if (room.getRoomNo().equals(roomNo)) {
									studentHostelDetailsMap.put("Room ", room.getRoomNo());
									studentHostelDetailsMap.put("studentList", room.getStudent());
									studentHostelDetailsMap.put("Room Capacity", room.getTotalOccupancy());
									studentHostelDetailsMap.put("No of bed Occupied ", room.getOccupiedStudent());
									studentHostelDetailsMap.put("Ro", room.getStudent());
									studentHostelDetailsMap.put("floor Name", floor.getFloorName());
									studentHostelDetailsMap.put("building Name", building.getBuildingName());
									studentHostelDetailsMap.put("block Name", block.getName());
								}
						}
					}
				}

			}
		}
		return studentHostelDetailsMap;
	}
	
	public static Map<String, Object> getTotalNoOfRoom() {
		int TotalNoOfRoom=0;
		Map<String, Object> studentHostelDetailsMap = new HashMap<>();
		List<Block> blockList = hostelData.get("XYZHostel");
		boolean isRoomFound = false;
		if (blockList != null) {
			for (Block block : blockList) {
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
					List<Floor> floorList = building.getFloor();
					for (Floor floor : floorList) {
						List<Room> roomList = floor.getRoom();
						for (Room room : roomList) {
								//if (room.getRoomNo().equals(roomNo)) {
									//studentHostelDetailsMap.put("Room ", room.getRoomNo() + "");
									//studentHostelDetailsMap.put("studentList", room.getStudent());
									//studentHostelDetailsMap.put("Room Capacity", room.getTotalOccupancy());
									//studentHostelDetailsMap.put("No of bed Occupied ", room.getOccupiedStudent());
									//studentHostelDetailsMap.put("Ro", room.getStudent());
									//studentHostelDetailsMap.put("floor Name", floor.getFloorName() + "");
									//studentHostelDetailsMap.put("building Name", building.getBuildingName() + "");
									//studentHostelDetailsMap.put("block Name", block.getName() + "");
								//}
							TotalNoOfRoom = TotalNoOfRoom+1;
						}
					}
				}

			}
		}
		return studentHostelDetailsMap;
	}


	public static void printHostelDetails() {
		Map<String, List<Block>> hostelData = HostelData.hostelData;
		// System.out.println(hostelData.get("GirlsHostel"));
		List<Block> blockList = hostelData.get("XYZHostel");
		if (blockList != null) {
			for (Block block : blockList) {
				System.out.println("=======================    " + block.getName() + "    =======");
				List<Building> buildingList = block.getBuilding();
				for (Building building : buildingList) {
					System.out.println("          **********    " + building.getBuildingName() + "    ***********");
					List<Floor> floorList = building.getFloor();
					for (Floor floor : floorList) {
						System.out.println("          $$$$$$ " + floor.getFloorName() + " $$$$$$$");
						List<Room> roomList = floor.getRoom();
						for (Room room : roomList) {
							System.out.println("         __________" + room.getRoomNo() + "__________________");
							List<Student> studentList = room.getStudent();
							for (Student student : studentList) {
								System.out.println("   ---------------------" + student.getName() + "---------------");
								System.out
										.println("   ---------------------" + student.getRollNo() + "---------------");
							}

						}
					}
				}
			}
		}
	}
}
