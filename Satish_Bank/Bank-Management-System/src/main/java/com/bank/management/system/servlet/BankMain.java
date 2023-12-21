package com.bank.management.system.servlet;

import com.bank.management.system.dao.AdminDAO;
import com.bank.management.system.dao.CustomerDAO;
import com.bank.management.system.dto.AdminDTO;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		AdminDAO a = new AdminDAO();
		AdminDTO adminDTO = new AdminDTO();
		Method m = new Method();
		CustomerDAO c = new CustomerDAO();
		
//		m.transferMoney();
		
//		int count = m.newAccount();
//		if (count > 0) {
//			System.out.println("ritesh");
//		} else {
//			System.out.println("patil");
//		}
//		m.viewParticularAccount();
//		int count = a.adminRegistration(adminDTO);
//		if (count > 0)
//			System.out.println("Product detail save successfully.");
//		else
//			System.out.println("Unable to save Product detail.");
//		
//		
//		
//		String email = a.adminLogin();
//		System.out.println(email + " ee");
//		if (email != null) {
//			System.out.println();
//			System.out.println("User Logged In!");
//		} else {
//			System.out.println("Incorrect Email or Password!");
//		}
//		System.out.println("Enter Your Choise");
//		int ch = sc.nextInt();
//		switch (ch) {
//		case 1: {
//
//			String email = a.adminLogin();
//		    if (email != null) {
//				System.out.println();
//				System.out.println("User Logged In!");
//				
//			} else {
//				System.out.println("Incorrect Email or Password!");
//			}
//
//			break;
//
//		}
//		case 2: {
//
//			break;
//
//		}
//
//		}
//		System.out.println("======================================================================================");
//		System.out.println("======================================================================================");
//		
//		
//		  System.out.print("\t\t\t=============================================================================\n");
//	        System.out.print( "\t\t\t\t\t\tWELCOME TO BANKING APPLICATION\n" );
//	        System.out.println("\t\t\t\t====================================================================\n");
//	        System.out.println("\t\t\t\t\t\tPlease Choose An Option: ");
//
//	         
//	        System.out.println( "\n\n\t\t\t\t\t\t1. Bank Admin Login: " );
//	        System.out.println( "\t\t\t\t\t\t2. Bank Customer: " );
//
//	        System.out.println( "\t\t\t\t\t\t3. Exit" );
//
//	        System.out.print("\n\n\t\t\t\t\t\tPlease Choose An Option: ");
//
//	       int  ch = sc.nextInt();
//
//	        switch (ch) {
//	            case 1:
//	                adminlogin();
//	                break;
//	            case 2:
//	                custmer();
//	                break;
//	            case 3:
//	                System.exit(0);
//	        }
		
		
		
		
//	     Scanner sc = new Scanner(System.in);
	        int ch;
	        String color, reset = "\u001B[0m";

	        color = "\u001B[31m";

	        System.out.print("\t\t\t=============================================================================\n");
	        System.out.print(color + "\t\t\t\t\t\tWELCOME TO BANKING APPLICATION\n" + reset);
	        System.out.println("\t\t\t\t====================================================================\n");
	        System.out.println("\t\t\t\t\t\tPlease Choose An Option: ");

	        color = "\u001B[34m";
	        System.out.println(color + "\n\n\t\t\t\t\t\t1. Bank Admin Login: " + reset);
	        System.out.println(color + "\t\t\t\t\t\t\t2. Bank Customer: " + reset);

	        System.out.println(color + "\t\t\t\t\t\t\t3. Exit" + reset);

	        System.out.print("\n\n\t\t\t\t\t\tPlease Choose An Option: ");

	        ch = sc.nextInt();

	        switch (ch) {
	            case 1:
	                m.adminLogin();
	                break;
	            case 2:
	                c.customerLogin();
	                break;
	            case 3:
	                System.exit(0);
	        }
	    }
		
		
	}

