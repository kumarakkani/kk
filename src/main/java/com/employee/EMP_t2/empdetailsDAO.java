package com.employee.EMP_t2;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import com.employee.dao.EmployeeDAO;
import com.employee.model.EmployeeDetail;

//import com.employee.EmployeeDAO;

public interface empdetailsDAO{

	EmployeeDAO showemp() throws Exception;
	
	EmployeeDAO joinempdept() throws  Exception;
	
	void jdate() throws Exception;
	
	//void save(EmployeeDetail employeeDetail);
	
	EmployeeDAO deptcount() throws Exception;
	
	 ArrayList<EmployeeDetail> empdet(int dId) throws Exception;
	 
	 //EmployeeDAO empdept(employeeGender gender,int e_id) throws Exception;
	// EmployeeDAO Allemp() throws Exception ;
	int empfull() throws  Exception; 

	void delete() throws Exception;
	void upd() throws Exception;
	void insert() throws Exception;
	 void sel() throws Exception;
	
}
