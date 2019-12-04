package com.demo.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BasicOperation {
	public static void main(String[] args) {

// Days
		LocalDate current = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1994, 6, 12);
		
		
		long days = ChronoUnit.DAYS.between(birthDate, current);
		System.out.println(days);
		/**
		 * One More Way 1)long diffDays = current.toEpochDay() - birthDate.toEpochDay();
		 * 2) System.out.println(diffDays);
		 */
// Weeks

		long weeks = ChronoUnit.WEEKS.between(birthDate, current);
		System.out.println(weeks);
		
	

	}

}
