package com.banking;

import com.operations.*;
import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// variables declaration
		int accNo;
		int option,option1;
		String name, password;
		int balance;
		// Main Menu
		do {
		System.out.println("Welcome to Indian Bank ");
		System.out.println("Enter Valid Option");
		System.out.println("------------------");
		System.out.println("1.New Customer creation");
		System.out.println("2.Existing customer login");
		System.out.println("3.List of Customers ");
		System.out.println("4.Exit");
		option = in.nextInt();
		// 1. New Customer creation
		switch (option) {
		case 1:
			// call new customer creation
			System.out.println("New Customer Creation ");
			System.out.println("---------------------");
			inputAccDetails obj = new inputAccDetails();
			accNo = obj.getAccNo();
			name = obj.getName();
			password = obj.getPassword();
			NewCustomer cust = new NewCustomer();
			cust.InsertCustomer(accNo,name,password);
			break;
		case 2:
			do {
			System.out.println("1.Deposit ");
			System.out.println("2.Withdrawal ");
			System.out.println("3.Transfer");
			System.out.println("4.Exit");
			option1 = in.nextInt();
			switch (option1) {
			case 1:
				Deposit deposit = new Deposit();
				deposit.Deposit();
			    break;
			case 2:
				withDrawal withdraw = new withDrawal();
				withdraw.withDrawal();	
			    break;
			case 3:
				Transfer transfer = new Transfer();
				transfer.Transfer();
				break;
			}
			}while(option1!=4);
			break;
		case 3:
			NewCustomer cust1 = new NewCustomer();
			cust1.DisplayCustomerList();
			break;
		case 4:
			System.out.println("Thanks for Banking with us!");
			break;
		}

		} while(option!=4);
	}
}