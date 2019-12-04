package com.demo.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegEx {

	public static void main(String[] args) {
		/**
		 * Write a program to validate password using regular expression. The usecase
		 * that needs to be addressed are
		 * 
		 * 1. A lower case 
		 * 2. A capital letter 
		 * 3. 5 numbers at least 
		 * 4. Minimum 10 characters 
		 * 5. One “_” 
		 * 6. One “@”
		 */
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Choose Password");
			String password = sc.next();

			String regex = "((?=.*[a-z])(?=.*[A-Z])((?=.*[0-9]){5,})(?=.*[@])(?=.*[_])).{10,}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);
			System.out.println(matcher.matches());

		} catch (Exception e) {
			System.out.println("Some Exception Occured due to : " + e.getMessage());
		}

	}

}
