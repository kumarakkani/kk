package com.employee.dao;

import java.sql.Date;

public class addman {
	int managerId;
	String managerName;
	String Email;
	Date dob;
	Long mobNum;
	String passWord;
	String Gender;
	@Override
	public String toString() {
		return "addman [managerId=" + managerId + ", managerName=" + managerName + ", Email=" + Email + ", dob=" + dob
				+ ", mobNum=" + mobNum + ", passWord=" + passWord + ", Gender=" + Gender + "]";
	}
	

}
