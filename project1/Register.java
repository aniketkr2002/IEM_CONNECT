package project1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	public static void register() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aniket","12345");
			
			Statement smt =  con.createStatement();
			Scanner scn = new Scanner(System.in);
			
// taking user details to save in data base
			System.out.println("<-------your--Login--page-------------->");
			System.out.println("enter your name");
			String name= scn.next(); //br.readLine();
			System.out.print("please Enter your Enrollment number\n");
			int Enroll_num =scn.nextInt() ;
			System.out.println("Enter your password\n");
			String password = scn.next();
			
//checking that user is already registered or not
			if(IsStudent.isStudent(Enroll_num,con)) {		
			if(IsRegistered.isRegister(Enroll_num,password,con)) {
				System.out.println("you have already registered!! please login");
				return;
			}
			
	//inserting user data in data base	
			PreparedStatement pmt = con.prepareStatement("insert into logdetails  values(?,?,?)");
			pmt.setString(1,name);
			pmt.setInt(2, Enroll_num);
			pmt.setString(3, password);
			System.out.println(pmt.executeUpdate()+" data insert");
			System.out.println("your are now resisted");
			
			}
			else {
				System.out.println("you are not student of our college or please check your enrollment number");
				return;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
     			e.printStackTrace();
		}
		
	}

}
