package com.demo.concurrency;

/**
 * @author shahjade.a
 *
 *         In Java, each thread has a separate memory space known as working
 *         memory; this holds the values of different variables used for
 *         performing operations. After performing an operation, thread copies
 *         the updated value of the variable to the main memory, and from there
 *         other threads can read the latest value.
 * 
 *         Simply put, the volatile keyword marks a variable to always go to
 *         main memory, for both reads and writes, in the case of multiple
 *         threads accessing it.
 */
public class VolatileKeyword {
	static volatile int var =5;
	public static void main(String[] args) throws InterruptedException {
		int var =5;

	}
}