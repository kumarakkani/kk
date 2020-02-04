package com.Testemployee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.util.Scanner;

import com.employee.model.dbconnection;

public class InsertQuery {

		public void insert() throws Exception {
			 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the employee ID");
		     int eId = sc.nextInt();
		     sc.nextLine();
			    System.out.println("Enter Employee Name " );
			   String employeeName=sc.nextLine();
			    System.out.println("Enter gender(Male/Female/Others)  " );
			    String Gender = sc.nextLine();
			    System.out.println("Enter DOB  " );
			    String DateOfBirth = sc.nextLine();
			    
			    Date date = Date.valueOf(DateOfBirth);
			    
			    System.out.println("Enter Joindate  " );
			    String JoiningDate = sc.nextLine();
			    //Date k=Date.valueOf(JoiningDate);
				
			    Date date1 = Date.valueOf(JoiningDate);

			    System.out.println("Enter Pan>> " );
			    String panCard = sc.nextLine();
			    System.out.println("Enter Adhar >> " );
			    long AdharNumber = sc.nextLong();
			    System.out.println("Enter contactNo: >> " );
			    long employeeMobNum = sc.nextLong();
			   
			Connection connection = dbconnection.getConnection();
			 
			Statement st = connection.createStatement();
			 
			String sql = "insert into employee_details (e_id,employee_name,gender,birth_date,joining_date,pan_card,adhar_num,employee_mobnum) values("+eId+",'"+employeeName+"','"+Gender+"',to_date('" + date + "','yyyy-MM-dd'),to_date('" + date1 + "','yyyy-MM-dd'),'"+panCard+"',"+AdharNumber+","+employeeMobNum+")";
			 System.out.println(sql);
			 
			st.executeUpdate(sql);
			 
			st.close();
			connection.close();
			 
			System.out.println("Insert Successful");
			 
			}

				
			
	}


