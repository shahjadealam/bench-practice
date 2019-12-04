package com.demo.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private Account account= new Account();
	private List<String> transactions= new ArrayList<String>();

	public Transaction() {
		super();
	}

	public Transaction(Account account, List<String> transactions) {
		super();
		this.account = account;
		this.transactions = transactions;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<String> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}

	public void deposit(int money) {
		String transaction = account.deposit(money);
		System.out.println(transaction);
		transactions.add(transaction);
	}

	public void withdraw(int money) {
		
		String transaction = account.withdraw(money);
		System.out.println(transaction);
		transactions.add(transaction);
		
	}

	public List<String> getTransaction() {
		return transactions;
	}
	
}
