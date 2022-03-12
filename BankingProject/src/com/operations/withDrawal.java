package com.operations;
import java.util.HashMap;
import java.util.Scanner;
import com.banking.*;
import java.util.Scanner;
import com.banking.*;
import com.banking.*;

public class withDrawal extends NewCustomer{
	
	Integer accNo;
	Integer withdrawAmount, balance;
	String name, password, option;

	// getting Account Number and Password
	public void withDrawal() {
		
	inputAccDetails obj4 = new inputAccDetails();this.accNo=obj4.getAccNo();this.password=obj4.getPassword();

	if(passwordDetails.get(this.accNo).equals(this.password))
 	{
		this.name = accountDetails.get(this.accNo);
		balance = balanceDetails.get(this.accNo);
		
		System.out.println("Account Number : " + this.accNo + "  Name :" + this.name + "  Balance = Rs." + balance);
		System.out.println("Confirm Account Details : y / n");
		Scanner in = new Scanner(System.in);
		option = in.next();
		// withdraw amount and update hashmap
		if (option.equals("y")) {
			System.out.println("Enter Amount to be withdrawn");
			withdrawAmount = in.nextInt();
			if (withdrawAmount <= balance) {
				balance = balance - withdrawAmount;
				balanceDetails.replace(this.accNo, balance);
			} else {
				System.out.println("No sufficient balance");
				return;
			}
		} else {
			System.out.println("Wrong login credentials!");
			return;
		}
	}else
	{
		System.out.println("Account not found");
		return;
	}
}}
