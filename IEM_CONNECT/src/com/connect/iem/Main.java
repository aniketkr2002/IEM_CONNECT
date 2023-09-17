package com.connect.iem;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("welcome to iem connet login page");
		StudDaointerface dao = new StudDaoimpl();
		Scanner scn = new Scanner(System.in);
		do {
			System.out.print("Enter your Choice1\n"+
		                     "1:Login into website\n"+
							 "2:Register\n"+
							 "3:close menu\n");
			int choise = scn.nextInt();
			switch(choise) {
			case 1 :
				System.out.print("Enter your name\n");
				String name = scn.next(); scn.nextLine();
				System.out.print("Enter your password\n");
				String password = scn.next();scn.nextLine();
				System.out.print("Enter your Enrollment\n");
				long Enrollment =scn.nextLong();
				Student student = new Student(name,password,Enrollment);
				dao.Login(student);
				break;
			case 2 :
				System.out.print("Enter your name\n");
			     name = scn.next();scn.nextLine();
				System.out.print("Enter your password\n");
				 password = scn.next();scn.nextLine();
				System.out.print("Enter your Enrollment\n");
				Enrollment =scn.nextLong();
			    student = new Student(name,password,Enrollment);
				dao.Register(student);
				break;
			case 4 :
				System.exit(0);
			default:
				System.out.print("invalid choise\n");
			}
		}while(true);

		}

}
