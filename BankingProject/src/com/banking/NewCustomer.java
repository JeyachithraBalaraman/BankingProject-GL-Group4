package com.banking;

import java.util.HashMap;

 public class NewCustomer {
// creating HashMaps to store Account number , name , password , balance	
	
		 public static HashMap<Integer, String> accountDetails = new HashMap<>();
		 public static HashMap<Integer, String> passwordDetails = new HashMap<>();
		 public static HashMap<Integer, Integer> balanceDetails = new HashMap<>();
	     
// method to insert new customer details
	    public void InsertCustomer(int accNo,String name,String password) {
		accountDetails.put(accNo, name);
		passwordDetails.put(accNo, password);
		balanceDetails.put(accNo, 0);
		System.out.println(accNo + "  Account Created! ");
        }
// method to Display all customers	    
	    
        public void DisplayCustomerList(){
        	System.out.println("List Of Customers ");
        	System.out.println(accountDetails);
        	System.out.println("List of account balances");
        	System.out.println(balanceDetails);
        }
}
 