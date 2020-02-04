package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.employee.model.dbconnection;

public class managerADDImpl implements addmanagerDAO {

	
	public void addmanager(addman add) throws Exception {
		 Connection connection = dbconnection.getConnection();
         String sql="insert into manager(manager_name,email,dob,mob_num,pass_word,gender,manager_id) values(?,?,?,?,?,?,Update_sequence.nextval)";
	       System.out.println(sql); 
	       PreparedStatement k=connection.prepareStatement(sql);
	       k.setString(1, add.managerName);
	       k.setString(1, add.Email);
	       k.setDate(3, add.dob);
	       k.setLong(4, add.mobNum);
	       k.setString(5, add.passWord);
	       k.setString(6, add.Gender);
	       k.executeUpdate(); 
	}}       
    
	       
	


