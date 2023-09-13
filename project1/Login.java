package project1;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;
import java.util.Scanner;

public class Login {
		
		public static void enterDetails()
		{
			try
			{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aniket","12345");
			//Statement smt = con.createStatement();
			Scanner scn = new Scanner(System.in);
			
			System.out.println("<-------your--Login--page-------------->");
			System.out.print("\n");
			System.out.println("please Enter your Enrollment number");
			int Enroll_num = scn.nextInt();scn.nextLine();
			System.out.println("Enter your password");
			String password = scn.next();
			
// cheking that user id and password registered or not
			scn.close();

			if(IsRegistered.isRegister(Enroll_num,password,con)) {
				System.out.println("thank you for Login ");
				return;
			}
			else {
				System.out.println("you have not registered!!! please register");
			}
			con.close();
			return;
			}catch(Exception e) {
			
			}
			

			
		
		}

}
