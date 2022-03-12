package com.operations;

import java.util.HashMap;
import java.util.Scanner;
import com.banking.*;

public class Deposit extends NewCustomer {

	Integer accNo;
	Integer depositAmount, balance;
	String name, password, option;

	// getting Account Number and Password
	public void Deposit() {
		inputAccDetails obj4 = new inputAccDetails();this.accNo=obj4.getAccNo();this.password=obj4.getPassword();

		//NewCustomer obj1 = new NewCustomer();

		// If account number and password match with NewCustomer hashmap
				
		if(passwordDetails.get(this.accNo).equals(this.password))
		{
			this.name = accountDetails.get(this.accNo);
			balance = balanceDetails.get(this.accNo);
			
			System.out.println("Account Number : " + this.accNo + " Name :" + this.name + " Balance = Rs." + balance);
			System.out.println("Confirm Account Details : y / n");
			Scanner in = new Scanner(System.in);
			option = in.next();
			// deposit amount and update hashmap
			if (option.equals("y")) {
				System.out.println("Enter Amount to be Deposited");
				depositAmount = in.nextInt();
				balance = balance + depositAmount;
				balanceDetails.replace(this.accNo, balance);
				System.out.println("Amount Deposited !" + " Current Balance = Rs. "+ balance);
			}else {
				System.out.println("Wrong Account !");
				return;}
	   }else {
			System.out.println("Account not found");
	    	return;
	         }
}
}
