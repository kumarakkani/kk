package com.employee.Dept_T1;

import java.awt.List;

public interface DepartmentDAO {
	
void display(int did,String departmentname,int managerid,String departmentlocation);
	//insert into dept(deptId,deptName) values(12,ece);

void inserdept(int departmentId, String departmentName, int managerId,String departmentlocation) throws Exception;

void deptadd(String deptName,int deptId) throws Exception;

int getNoOfdept(String departmentLocation) throws Exception;



}


