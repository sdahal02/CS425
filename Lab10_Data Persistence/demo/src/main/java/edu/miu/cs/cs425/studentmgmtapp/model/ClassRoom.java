package edu.miu.cs.cs425.studentmgmtapp.model;

public class ClassRoom {
	private Integer classroomId;
	private String buildingName;
	private Integer roomNumber;

	public ClassRoom() {
		// TODO Auto-generated constructor stub
	}

	public ClassRoom(Integer classroomId, String buildingName, Integer roomNumber) {
		super();
		this.classroomId = classroomId;
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

}
