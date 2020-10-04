package com.meritamerica.assignment1;

public class SavingsAccount {
	public class SavingAccount {
		private double balance;
		private double interestRate;

		public SavingAccount(double openingBalance) {
			this.balance = openingBalance;
			this.interestRate = 0.01;
}
		
		public double getBalance() {
			return this.balance;
		}

		public double getInterestRate() {
			return this.interestRate;
		}
		

		public boolean withdraw(double amount) {
			if (this.balance >= amount && amount >= 0) {
				this.balance = this.balance - amount;
				return true;
			} else {
				return false;
			}
			
		}

		public boolean deposit(double amount) {
			if (amount >= 0) {
				this.balance = this.balance + amount;
				return true;
			}
			else {
				return false;
			}
		}
		
		// This calculates the future value given the number of years
		public double futureValue(int years) {
			return this.balance * (Math.pow(1 + this.interestRate, years));
		}
		public String toString() {
			return  "Saving Account Balance: $" + this.getBalance() +"\n"
					+ "Saving Account Interest Rate: " + this.getInterestRate() +"\n"
					+ "Saving Account Balance in " + AccountHolder.YEARS + " years: $" + this.futureValue(AccountHolder.YEARS) +"\n";
		}
	}
}
