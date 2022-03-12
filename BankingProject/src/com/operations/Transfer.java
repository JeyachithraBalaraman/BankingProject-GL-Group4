package com.operations;

import java.util.HashMap;
import java.util.Scanner;
import com.banking.*;

public class Transfer extends NewCustomer {
	Integer accNo1, accNo2;
	Integer transferAmount, balance1, balance2;
	String name, password, option;

	// getting Account Number and Password
	public void Transfer() {
		inputAccDetails obj4 = new inputAccDetails();
		this.accNo1 = obj4.getAccNo();
		this.password = obj4.getPassword();

		//NewCustomer obj1 = new NewCustomer();
		//NewCustomer obj11 = new NewCustomer();
		// If account number and password match with NewCustomer hashmap

		if (passwordDetails.get(this.accNo1).equals(this.password)) {
			this.name = accountDetails.get(this.accNo1);
			balance1 = balanceDetails.get(this.accNo1);
			
			System.out.println("Account Number : " + this.accNo1 + " Name :" + this.name + " Balance = Rs." + balance1);
			System.out.println("Confirm Account Details : y / n");
			Scanner in = new Scanner(System.in);
			option = in.next();
			// transfer amount and update hashmap
			if (option.equals("y")) {
				System.out.println("Enter beneficiary account number");
				accNo2 = in.nextInt();
				if (balanceDetails.get(this.accNo2) != null) {
					System.out.println("Enter Amount to be transfered");
					transferAmount = in.nextInt();
					balance2 = balanceDetails.get(this.accNo2);
					if (transferAmount <= balance1) {
						balance1 = balance1 - transferAmount;
						balance2 = balance2 + transferAmount;
						balanceDetails.replace(this.accNo1, balance1);
						balanceDetails.replace(this.accNo2, balance2);
					} else {
						System.out.println("No sufficient balance");
						return;
					}
				} else {
					System.out.println("Beneficiary doesn't exist!");
					return;
				}

			} else {
				System.out.println("Wrong login credentials!");
				return;
			}
		} else {
			System.out.println("Account not found");
			return;
		}
	}
}
