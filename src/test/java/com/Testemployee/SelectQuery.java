package com.Testemployee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.employee.model.dbconnection;

public class SelectQuery {


		public void sel() throws Exception {
			  Connection connection = dbconnection.getConnection();
	          
		        Scanner scan = new Scanner(System.in);
		        Statement st = connection.createStatement();
		        System.out.println("1.View a record\n2.View the table\n");
		        int ch = scan.nextInt();
		         
		        if(ch==2)
		        {
		        String sql = "select * from employee_details";
		         
		        ResultSet rs = st.executeQuery(sql);
		         
		        if(rs == null)
		        {
		            System.out.println("Table Empty");
		        }
		         
		        System.out.print("ID\t\tName\n");
		        System.out.print("--\t\t----\n\n");
		        while(rs.next()){
		            System.out.println(rs.getInt(1)+"\t\t"+rs.getString("employee_name"));
		        }
		        rs.close();
		         
		        st.close();
		        connection.close();
		        }
		         
		        else if(ch == 1)
		        {
		            System.out.println("Enter Employee ID to view record:");
		            int eId = scan.nextInt();
		            
		            String sql =  "select department_id,employee_name from employee_details where e_id=?";
		           PreparedStatement k=connection.prepareStatement(sql);
                   k.setInt(1,eId);
		            ResultSet rs = k.executeQuery();
		             
		            if(rs == null)
		            {
		                System.out.println("Table Empty");
		            }
		             
		             
		            while(rs.next()){
		                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		            }
		            rs.close();
		             
		            st.close();
		            connection.close();
		        }}
	    
}
