package com.bank.management.system.servlet;

import java.util.regex.*;
import java.util.Scanner;
import com.bank.management.system.dto.CustomerDTO;

public class Validation {

	CustomerDTO customerDTO = new CustomerDTO();

	public boolean Number(String number) {
		Scanner sc = new Scanner(System.in);

		Pattern p = Pattern.compile("[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		// Pattern p=Pattern.compile("[7-9][0-9]{9}");
		Matcher m = p.matcher(number);
		if (m.find() && m.group().equals(number)) {
			System.out.println("valid number");
			customerDTO.setMobile(sc.nextLine());
			return false;
		} else {
			System.out.println("invalid number");
		}
		return false;
	}

	public void email() {
		Scanner sc = new Scanner(System.in);
		String l = sc.next();
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(l);
		if (m.find() && m.group().equals(l)) {
			System.out.println("valid mail id");
		} else {
			System.out.println("invalid mail id");
		}
	}
}