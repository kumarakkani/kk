package com.employee.model;

public class DeptModel {
	public int dId;

public String departmentName;
 public int managerId;
 public String departmentLocation;
 
 
 @Override
	public String toString() {
		return "class1 [dId=" + dId + ", departmentName=" + departmentName + ", managerId=" + managerId
				+ ", departmentLocation=" + departmentLocation + "]";
	}


public DeptModel(int dId, String departmentName, int managerId, String departmentLocation) {
	super();
	this.dId = dId;
	this.departmentName = departmentName;
	this.managerId = managerId;
	this.departmentLocation = departmentLocation;
}
}
