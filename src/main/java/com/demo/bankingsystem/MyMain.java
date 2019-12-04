package com.demo.bankingsystem;

import java.util.Scanner;

public class MyMain {
	public static void main(String[] args) {

		Transaction transaction = new Transaction();
		int flag = 0;
		while (flag == 0) {
			System.out.println(
					"Options:- \n 1) WithDraw \n 2) Deposit \n 3) Check Balance \n 4) Check Transaction \n 5) Exit \n Choose option : ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.println("Enter Amount you want to withdraw : ");
				int amount = sc.nextInt();
				transaction.withdraw(amount);
				break;

			case 2:
				System.out.println("Enter Amount you want to Deposit : ");
				int deposit = sc.nextInt();
				transaction.deposit(deposit);
				break;

			case 3:
				System.out.println("Your Available Balance is $" + transaction.getAccount().getBalance());
				break;
				
			case 4:
				transaction.getTransaction().forEach(System.out::println);
				break;

			case 5:
				flag = 1;
				break;

			default:
				System.out.println("invalid option");

			}
		}
	}
}
