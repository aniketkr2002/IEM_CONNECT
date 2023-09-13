package project1;
import java.util.Scanner;

// created two database table 1. logdetails(store student details liks pw ater ver
//       verifying from stud_details table ) 2.stud_details

public class User {
	public static void main(String[] args) {
		while(true) {
			try {
			System.out.println("enter:1 for login\nenter:2 for register\nenter:3 for exit\n");
			
			Scanner scn = new Scanner(System.in);
			int val=scn.nextInt();
			scn.close();
			switch(val) {
			case 1 :
				Login.enterDetails();
				break;
			case 2 :
				Register.register();
				break;
			case 3 :
				break;
			default :
				System.out.println("worng choise ! enter right value");
					
				}	
			
		}catch(Exception e) {
			System.out.println(e);
		                  }
		}
		
	}

}
