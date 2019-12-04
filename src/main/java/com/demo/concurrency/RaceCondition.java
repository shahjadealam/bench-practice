package com.demo.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * 
 * @author shahjade.a
 *
 *         Each thread want to change value of shared variable "sum" , so its
 *         race condition here. Use synchronized block or Use synchronized
 *         keyword, in calculate() function to avoid any race conditions
 */
public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		SharedData test = new SharedData();

		IntStream.range(0, 1000).forEach(inst -> executorService.submit(() -> {

			try {
				test.calculate();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " : " + test.getSum());
		}));

		executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
		System.out.println("Last Value : " + test.getSum());

	}
}

class SharedData {
	 int sum = 0;

	public synchronized void calculate() throws InterruptedException {

		// if we use sleep, awaitTerminate() completes,
		// when all the thread goes to sleep at single moment,
		// so last line will execute any undefined position
		// Thread.sleep(1000);

		setSum(this.sum + 1);
	}

	public void setSum(int i) throws InterruptedException {
		// Faltu ke kam , no use, just for some processing things or task or delay
		List<String> list = new ArrayList<String>(Arrays.asList("Himanshu", "Harry", "Shahjade", "Alam"));
		list.sort((a, b) -> a.compareTo(b));

		this.sum = i;

	}

	public int getSum() {
		return sum;
	}
}