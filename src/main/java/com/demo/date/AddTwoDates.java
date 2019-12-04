package com.demo.date;

import java.time.LocalDate;

public class AddTwoDates {

	public static void main(String[] args) {

		// Java7 : Old API
//		Calendar c1 = Calendar.getInstance();
//		Calendar c2 = Calendar.getInstance();
//
//		Calendar total = (Calendar) c1.clone();
//		total.add(Calendar.YEAR, c2.get(Calendar.YEAR));
//		total.add(Calendar.MONTH, c2.get(Calendar.MONTH));
//		total.add(Calendar.DATE, c2.get(Calendar.DATE));
//		total.add(Calendar.HOUR, c2.get(Calendar.HOUR));
//		total.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
//		total.add(Calendar.SECOND, c2.get(Calendar.SECOND));
//		total.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));
//		System.out.println(total.getTime());

		// Java8 : New Data/Time API
		LocalDate now = LocalDate.now();
		LocalDate nowNew = LocalDate.parse("2015-05-14");

		LocalDate result = now.plusYears(nowNew.getYear()).plusMonths(nowNew.getMonthValue())
				.plusDays(nowNew.getDayOfMonth());
		System.out.println("New : " + result);

	}

}
