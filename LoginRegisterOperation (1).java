package com.te.console.operations;

//import java.util.Date;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.te.console.beans.EmployeesInfo;

public class LoginRegisterOperation implements Login, Register {
	@Override
	public void login1(EmployeesInfo le) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Login");
		System.out.println( );

		System.out.print("Enter the user id : ");
		le.setId(scan.nextInt());

		System.out.print("Enter the password : ");
		le.setPassword(scan.next());
		
		System.out.println( );

		
	}

	@Override
	public void register2(EmployeesInfo info) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Register");
		System.out.println( );

		System.out.print("Enter the employess empno : ");
		info.setId(scan.nextInt());

		System.out.print("Enter the employees ename : ");
		scan.nextLine();
		info.setName(scan.nextLine());

		System.out.print("Enter the employees designation : ");
		info.setDesgination(scan.next());

		System.out.print("Enter the employees hiredate : ");
		info.setHiredate(scan.next());

//		SimpleDateFormat obj = new SimpleDateFormat("YYYY-MM-DD");
//		try {
//			obj.parse();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		System.out.print("Enter the employee salary : ");
		info.setSalary(scan.nextDouble());

		System.out.print("Enter the password : ");
		info.setPassword(scan.next());

	
	}

}
