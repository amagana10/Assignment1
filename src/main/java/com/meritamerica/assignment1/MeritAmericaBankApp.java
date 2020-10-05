package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		
		//Instantiate an account holder with a checkings balance of $100 and a savings balance of $1000
		AccountHolder client = new AccountHolder("Homer", "Jay", "Simpson", "123-45-6789", 100, 1000);	
		
		//Display the account holder’s toString() output
		System.out.println(client.toString());
		
		//Deposit $500 into the checking account
		client.getCheckingAccount().deposit(500);
		
		//Withdraw $800 from the savings account
		client.getSavingsAccount().withdraw(800);
		
		//Display the checking account toString() output
		System.out.println(client.getCheckingAccount().toString());
		
		//Display the savings account toString() output
		System.out.println(client.getSavingsAccount().toString());
		
		//Instantiate another account holder with a checkings balance of $200 and a savings balance of $500
		AccountHolder customer = new AccountHolder("Donald", "John", "Trump", "000-00-0001", 200, 500);
		
		//Deposit -$500 into the checking account
		customer.getCheckingAccount().deposit(-500);
		
		//Withdraw $600 from the savings account
		customer.getSavingsAccount().withdraw(600);
		
		//Display the second account holder’s toString() output
		System.out.println(customer.toString());
	}
	
}