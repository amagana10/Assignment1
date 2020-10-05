package com.meritamerica.assignment1;

public class AccountHolder {
	//Const 
	public static final int YEARS = 3;
	
	//instance variables
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	
	private SavingsAccount sAccount;
	private CheckingAccount cAccount;
	
	
	//default constructor
	public AccountHolder(){
		//initializing values
	    this.firstName = "none";
	    this.middleName = "none";
	    this.lastName = "none";
	    this.ssn = "none";
	    this.sAccount = new SavingsAccount(0);
	    this.cAccount = new CheckingAccount(0);
	    
	}
	
	public AccountHolder(String firstName, 
			String middleName, 
			String lastName, 
			String ssn, 
			double checkingAccountOpeningBalance, 
			double savingsAccountOpeningBalance) {
		//initializing values
		this.firstName = firstName;
	    this.middleName = middleName;
	    this.lastName = lastName;
	    this.ssn = ssn;
	    this.sAccount = new SavingsAccount(savingsAccountOpeningBalance);
	    this.cAccount = new CheckingAccount(checkingAccountOpeningBalance);
		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return this.ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount getCheckingAccount() {
		return this.cAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return this.sAccount;
	}
	
	public String toString() {
		return "Name: " + this.firstName + " " + this.middleName + " " + this.lastName +"\n"
				+ "SSN: " + this.ssn +"\n"
				+ this.cAccount.toString() 
				+ this.sAccount.toString(); 
	}
	
}
