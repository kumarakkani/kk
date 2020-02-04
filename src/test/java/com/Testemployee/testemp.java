package com.Testemployee;

import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;

import com.employee.EMP_t2.empdetailsDAOImpl;
import com.employee.EMP_t2.employeeGender;
import com.employee.model.EmployeeDetail;
import com.employee.model.dbconnection;

public class testemp {

	public static  void main(String[] args) throws Exception {
	//com.employee.EMP_t2.empdetailsDAOImpl obj= new com.employee.EMP_t2.empdetailsDAOImpl();
	
	//obj.empdept(employeeGender.male, 7);
	
	 //Select * from emp
	
		//obj.showemp();                     
		//System.out.println(obj.toString());  
		
/*------------------------------------------------------------------------------------------------*/
	//managname,h_id,dept_count
	
	    //obj.joinempdept() ; }}
		//System.out.println(obj.toString());;     
		
/*------------------------------------------------------------------------------------------------*/
		
		
//emptab k= new emptab(eId,departmentId,employeeName,gender,birthDate,joiningDate, panCard,adharNum,drivingLicense_num,employeeMobnum);
		//obj.jdate();
		
		//System.out.println(k);
		//obj.deptcount();   }}
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the Dept id");
	//int deptid=sc.nextInt();
	//obj.empdept(gender, e_id)
	//obj.empdet(deptid);
	//EmployeeDetail e = new EmployeeDetail();
		//e.seteId1(-1);
		//e.setEId(-1);
		
		//obj.Allemp();
		//System.out.println(obj.toString());
	

 Scanner scan = new Scanner(System.in);
     Scanner scan2 = new Scanner(System.in);
                  
     SelectQuery sq = new SelectQuery();
     InsertQuery iq = new InsertQuery();
     UpdateQuery uq = new UpdateQuery();
     DeleteQuery dq = new DeleteQuery(); 
    empdetailsDAOImpl obj1 = new empdetailsDAOImpl();
     //deptcount Dc= new deptcount(obj1);
     
     
     
     Connection connection = dbconnection.getConnection();
      
     String con = "y";

 while(con.equalsIgnoreCase("y"))
     {
     System.out.println("Enter Choice:\n1.ViewData\n2.Insert Data\n3.Update Data\n4.Delete Data\n5.Department Members\n6.DeptEmpName");
     int choice = scan.nextInt();
  
     switch(String.valueOf(choice))
     {
  
     case "1":{sq.sel();}        break;
     case "2":{iq.insert();}     break;  
     case "3":{uq.upd();}        break;
     case "4":{dq.delete();}     break;
     case "5":{obj1.deptcount(); }  break;
     case "6":{
    	 Scanner ec = new Scanner(System.in);
 		System.out.println(" Enter employeeID ->");
 		int dId= ec.nextInt();
    	 
    	 obj1.empdet(dId);}  break;
     default :{System.out.println("Wrong Choice");}  break; 
  
 }
 System.out.println("\n\nContinue? (Y/N): ");
 con = scan2.nextLine();
 }
 }   
}
	

	
			 
