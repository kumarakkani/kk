package com.Testemployee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.employee.model.dbconnection;

public class UpdateQuery {

	public void upd() throws Exception {
		 Connection connection = dbconnection.getConnection();
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Insert Employee id to update record: "  );
		    int eid = sc.nextInt();
		    System.out.println("Enter Employee departmentId >>");
		    String id = sc.next();
		     
		     
		    Statement st = connection.createStatement();
		     
		    String sql = "update employee_details set department_id='"+id+"' where e_id="+eid;
		             
		    st.executeUpdate(sql);
		     
		    st.close();
		    connection.close();
		     
		    System.out.println("Update Successful");
		}		
	
		
	}
