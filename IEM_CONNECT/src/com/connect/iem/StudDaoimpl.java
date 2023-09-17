package com.connect.iem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudDaoimpl implements StudDaointerface {
	Connection con;
	public void Login(Student student) {
	    con = DBConnection.createDBConnection();
	    String query = "insert into logdetails values(?,?,?)";
	    try {
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1,student.getName());
			psmt.setLong(2,student.getEnrollment());
			psmt.setString(3,student.getPassword());
			int count = psmt.executeUpdate();
			if(count!=0) {
				System.out.println("login successfull");
			}else {
				System.out.println("data not  inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	}
	public void Register(Student student) {
		con = DBConnection.createDBConnection();
	    String query = "insert into regdetails values(?,?,?)";
	    try {
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1,student.getName());
			psmt.setLong(2,student.getEnrollment());
			psmt.setString(3,student.getPassword());
			int count = psmt.executeUpdate();
			if(count!=0) {
				System.out.println("registered  successfull");
			}else {
				System.out.println("data not  inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
