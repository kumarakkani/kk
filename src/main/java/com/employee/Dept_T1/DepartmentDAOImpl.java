package com.employee.Dept_T1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.employee.dao.EmployeeDAO;
import com.employee.model.dbconnection;


public  class DepartmentDAOImpl implements DepartmentDAO {

public void display(int did,String departmentname,int managerid,String departmentlocation) {
		// TODO Auto-generated method stub
		String str="insert into department(did,departmentname,managerid,departmentlocation)values ("+"did :"  +did +",departmentname:" +departmentname +",managerid:" +managerid +",departmentlocation:" +departmentlocation +")";
	System.out.println(str);
		}

	
		
public void inserdept(int departmentId, String departmentName, int managerId,String departmentlocation) throws Exception
{
Connection con=dbconnection.getConnection();
String sql="insert into departments (d_id,department_name,manager_id,department_location) values("+departmentId+",'"+departmentName+"',"+managerId+",'"+departmentlocation+"')";
System.out.println(sql);
Statement stmt=con.createStatement();
int row=stmt. executeUpdate(sql);
System.out.println(row);

}


public EmployeeDAO empdept() throws Exception {
	// TODO Auto-generated method stub
	Connection con=dbconnection.getConnection();
	String sql="(select  department_name as dept from departments where department_location = 'null')";
	System.out.println(sql);
	Statement stmt=con.createStatement();
	//int row=stmt. executeUpdate(sql);
	ResultSet rs = stmt.executeQuery(sql);
	if(rs.next())
	{
		String deptt=rs.getString("dept");
		
		System.out.println(deptt);
	}
			
	return null;
}

public void deptadd(String deptName,int deptId)throws Exception{
	Connection con=dbconnection.getConnection();
	String sql="update departments set department_name= ? where d_id= ?";
	
	PreparedStatement stmt=con.prepareStatement(sql);  
     stmt.setString(1,deptName);
	 stmt.setInt(2,deptId);
	//Statement stmt=con.createStatement();
	System.out.println(sql);
	int rows=stmt.executeUpdate();
	System.out.println(rows);
}




public int getNoOfdept(String departmentLocation) throws Exception {
	// TODO Auto-generated method stub
	Connection con=dbconnection.getConnection();
	String sql="select count(department_name) as dept from departments where department_location=?";
	//System.out.println(sql);
	PreparedStatement stmtt=con.prepareStatement(sql);
	stmtt.setString(1,departmentLocation);
	//Statement stmt=con.createStatement();
	ResultSet rs= stmtt.executeQuery();
	while(rs.next())
	{
		
		String sqll=rs.getString("dept");
		System.out.println(sqll);
	}
	
	return 0;
}
}















	
