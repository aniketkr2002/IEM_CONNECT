package project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IsRegistered {
	public static boolean isRegister(int Enroll_num,String password,Connection con) {
		try
		{
// checking roll and password exits in data base or not;		
		Statement pr  = con.createStatement();
		ResultSet rs =pr.executeQuery("select * from logdetails");
		while(rs.next()) {
			int r =rs.getInt(3);
			String s =rs.getString(2);
			if(r==Enroll_num && s.equalsIgnoreCase(password)) {
				System.out.println("user found"); 
				return true;// found then return true;
			}
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return false;
	}
}
