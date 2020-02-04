package com.employee.model;

import java.sql.Date;

public class EmployeeDetail {
   
	private  int eId;    
    public String departmentId;
    public String  employeeName;
    public EmployeeDetail gender;
    public Date birthDate ;
    public Date joiningDate;
    public int panCard ;
    public long adharNum ;
    public String drivingLicense_num;
    public long employeeMobnum;
	@Override
	public String toString() {
		return "emptab [eId=" + geteId() + ", departmentId=" + departmentId + ", employeeName=" + employeeName + ", gender="
				+ gender + ", birthDate=" + birthDate + ", joiningDate=" + joiningDate + ", panCard=" + panCard
				+ ", adharNum=" + adharNum + ", drivingLicense_num=" + drivingLicense_num + ", employeeMobnum="
				+ employeeMobnum + "]";
	}
	
	public EmployeeDetail() {
		
	}
	
	public EmployeeDetail(int eId, String departmentId, String employeeName, EmployeeDetail gender, Date birthDate,
			Date joiningDate, int panCard, long adharNum, String drivingLicense_num, long employeeMobnum) {
		super();
		this.seteId1(eId);
		this.departmentId = departmentId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.joiningDate = joiningDate;
		this.panCard = panCard;
		this.adharNum = adharNum;
		this.drivingLicense_num = drivingLicense_num;
		this.employeeMobnum = employeeMobnum;
	}
	
	public void seteId1(int eId) {
		if ( eId < 0) {
			throw new IllegalArgumentException("Invalid Eid");
		}
		this.seteId1(eId);
	}
	
	public int getId() {
		return geteId();
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public void save(EmployeeDetail employeeDetail) {
		// TODO Auto-generated method stub
		
	}

	public void getInput() {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
		
	}

