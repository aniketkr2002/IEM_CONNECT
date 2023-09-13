package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IsStudent {
		public static boolean isStudent(int Enroll_num,Connection con) {
				try
				{
		   // checking student is from college or not data base or not;		
				Statement pr  = con.createStatement();
				ResultSet rs =pr.executeQuery("select * from Stud_details");
				while(rs.next()) {
					int r =rs.getInt(2);
					if(r == Enroll_num) {
						return false;// found then return true;
					}
				}
				
				}catch(Exception e) {
					System.out.println(e);
				}
				return true;
			
		}
}
