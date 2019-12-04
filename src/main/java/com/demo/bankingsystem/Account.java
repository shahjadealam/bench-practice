package com.demo.bankingsystem;

public class Account {

	private int balance=0;

	public Account() {
		super();
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public String deposit(int amount) {
		balance += amount;
		return "Deposting $" + amount;
	}

	public String withdraw(int amount) {
		String response = null;
		if (balance > amount) {
			
			balance =balance- amount;
			response = "Withdrawing $" + amount;

		} else {
			
			response = "Withdrawing $" + amount + "(Insufficient Balance)";
		}
		return response;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
