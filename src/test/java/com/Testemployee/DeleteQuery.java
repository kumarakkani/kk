package com.Testemployee;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.employee.model.dbconnection;

public class DeleteQuery {


		public void delete() throws Exception {

			 Connection connection = dbconnection.getConnection();
			    Scanner sc = new Scanner(System.in);
			     
			    System.out.println("1.Delete a record\n2.Clear Table\n");
			    int ch = sc.nextInt();
			     
			    if (ch==1)
			    {
			    System.out.println("Enter ID: "  );
			    int eid = sc.nextInt();
			             
			    Statement st = connection.createStatement();
			             
			    String sql = "delete from employee_Details where e_id="+eid;
			    System.out.println(sql);
			     
			    st.executeUpdate(sql);
			     
			    st.close();
			    connection.close();
			     
			    System.out.println("\nDelete Successfull");
			    }
			     
			    else if(ch == 2)
			    {
			        Statement st = connection.createStatement();
			         
			        String sql = "truncate table emp";
			        System.out.println(sql);
			         
			        st.executeUpdate(sql);
			         
			        st.close();
			        connection.close();
			         
			        System.out.println("\nTable Cleared");
			    }
			     
			    else{System.out.println("Wrong Choice");}
			}
		
		
	}


