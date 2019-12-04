package com.demo.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

/**
 * 
 * @author shahjade.a
 *
 */
public class MainApplication {

	final static Logger logger = Logger.getLogger(MainApplication.class);
	// static ResourceBundle rb = ResourceBundle.getBundle("application");
	// static String splunkHost = rb.getString("splunk.host.name");

	public static void main(String[] args) {
		
		System.out.println("Application Started !!");

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 15; i++) {
			executorService.execute(new Task2(i + 1));
		}

		executorService.shutdown();
		/*
		 * try { if (!executorService.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
		 * executorService.shutdownNow(); } } catch (InterruptedException e) {
		 * executorService.shutdownNow(); }
		 */
	}

}
