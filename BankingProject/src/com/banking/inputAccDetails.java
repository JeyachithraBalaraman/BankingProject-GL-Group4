package com.banking;

import java.util.Scanner;

public class inputAccDetails {
	private int accNo;
	private String name, password;
	Scanner in = new Scanner(System.in);

	public int getAccNo() {
		System.out.println("Account Number");
		this.accNo = in.nextInt();
		return this.accNo;
	}

	public String getName() {
		System.out.println("Account Name");
		this.name = in.next();
		return this.name;
	}

	public String getPassword() {
		System.out.println("Password :");
		this.password = in.next();
		return this.password;
	}

}
