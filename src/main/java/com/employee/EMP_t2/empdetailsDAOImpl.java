package com.employee.EMP_t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.employee.model.dbconnection;
import com.Testemployee.InsertQuery;
import com.employee.dao.EmployeeDAO;
//import com.employee.EmployeeDAO;
import com.employee.model.EmployeeDetail;

public  class empdetailsDAOImpl implements empdetailsDAO {

	private String salary;
	private String employeeName;
	private String eId;

	public EmployeeDAO showemp() throws Exception {
		Connection con=dbconnection.getConnection();
		String sql="select * from employee_details";
		System.out.println(sql);
		Statement k=con.createStatement();
		//Statement stmt=con.createStatement();
		ResultSet rs=  k.executeQuery(sql);
		if(rs.next())
		{
			
		do {
			String employeeDetails=rs.getString("e_id");
			String employeeDetails1=rs.getString("employee_name");
			String employeeDetails2=rs.getString("gender");
			String employeeDetails3=rs.getString("birth_date");
			String employeeDetails4=rs.getString("joining_date");
            String employeeDetails5=rs.getString("pan_card");
            System.out.println(employeeDetails+","+employeeDetails1+","+employeeDetails2+","+employeeDetails3+","+employeeDetails4+","+employeeDetails5+"");;
            //System.out.println(rs);
		}while(rs.next());
		}else {
			System.out.println("Record not Found");
		}con.close();
		return null;
	}

	public  EmployeeDAO joinempdept() throws Exception {
		Connection con=dbconnection.getConnection();
		String sql="select employee_details.employee_name ,departments.manager_id,count(department_name) as department_count from departments join employee_details on departments.manager_id=employee_details.e_id group by departments.manager_id,employee_details.employee_name";
		System.out.println(sql.toString());
		Statement k=con.createStatement();
		//Statement stmt=con.createStatement();
		ResultSet rs=  k.executeQuery(sql);
		while(rs.next())
		{
		String employeeName= rs.getString("employee_name\n");
		String employeeName2= rs.getString("manager_id");
		String employeeName3=rs.getString("department_count");
		System.out.println(employeeName +","+employeeName2+","+employeeName3+"");	
	
	}
		return null;}

	
	
	public void jdate()throws Exception {
		// TODO Auto-generated method stub
		String joiningDate = "2019-04-12";
		int empId=2;
		LocalDate kt=LocalDate.parse(joiningDate);
		System.out.println(kt);
		 Date kt1=Date.valueOf(kt);
		 Connection con=dbconnection.getConnection();
			String sql="update employee_details set joining_date=? where e_id=? ";
	
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setDate(1,kt1);
			stmt.setInt(2,empId);
			System.out.println(sql);
			int rows = stmt. executeUpdate();
			System.out.println(rows);
			
		 }

	public EmployeeDAO deptcount() throws Exception {
		// TODO Auto-generated method stub
		
		 Connection con=dbconnection.getConnection();
			String sql="select department_id,department_name,count(employee_name) as emp_count from departments  inner join employee_details  on departments.d_id=employee_details.department_id  group by department_id,department_name order by department_id asc";
			System.out.println(sql);
			Statement k=con.createStatement();
			//Statement stmt=con.createStatement();
			ResultSet rs=  k.executeQuery(sql);
			while(rs.next())
			{
				String departmentName =rs.getString("department_name");
			String employeeName= rs.getString("department_id");
			
			int employeeName2=rs.getInt("emp_count");
			System.out.println(employeeName+","+departmentName+","+employeeName2+"");
					
	}
			return null;

}

	public ArrayList<EmployeeDetail> empdet(int dId) throws Exception {
		// TODO Auto-generated method stub
		Connection con=dbconnection.getConnection();
		
		String sql="select department_name,employee_name,department_id from departments d inner join employee_details e on d.d_id=e.department_id where d.d_id=?";
		//Statement rss= con.createStatement();
		PreparedStatement stmt=con.prepareStatement(sql); 
		stmt.setInt(1,dId);
		//System.out.println(sql);
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
             String department_name = rs.getString("department_name");
             String employee_name  = rs.getString("employee_name");
             String department_id  = rs.getString("department_id");
        
            System.out.println(department_name+","+employee_name+","+department_id+"");
            
            
            //ArrayList<EmployeeDetail> list=new arraylist<employeeDetail>();
           // employeeDetail ob= new employeeDEtail();
            
		}
		
		
		
		return null;
	}

	public EmployeeDAO empdept(employeeGender gender,int e_id) throws Exception {
		
		Connection con=dbconnection.getConnection();
		String sql="update employee_details set gender=? where e_id=?";
		PreparedStatement k=con.prepareStatement(sql);
		k.setString(1, gender.toString());
		k.setInt(2,e_id);
		System.out.println(sql);
		int rows=k.executeUpdate();
		System.out.println(rows);
				
		
		
		return null;
	}

	public int empfull() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upd() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sel() throws Exception {
		// TODO Auto-generated method stub
		
	}}


	



	/*public EmployeeDAO Allemp() throws Exception {
	
			Connection con=dbconnection.getConnection();
			Statement k=con.createStatement();
           String sql= ("select * from employee_details");
	
        System.out.println(sql);
        ResultSet rs = k.executeQuery(sql);

                   System.out.println("     d_ID     |    NAME        |     GENDER     |     DOB      |     JOINDATE    |   PAN   ");

                   System.out.println("--------------------------------------------------------------------------");

         while(rs.next()) {

                   System.out.println( rs.getString(2).toString() + "\t " + rs.getString(3).toString() + "\t\t" + rs.getString(4).toString() + "\t " + rs.getString(5).toString() + "\t " + rs.getString(6) + "\t " + rs.getString(7).toString());

         }
		return null;
	}

}*/







    


