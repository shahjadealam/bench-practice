package com.demo.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutorService {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);// newSingleThreadExecutor(); for single
																			// thread
		executorService.execute(new MyTask());
		executorService.submit(new MyTask());
		executorService.submit(new MyTask());
		executorService.submit(new MyTask());
		executorService.submit(()->System.out.println("MyTask : "+Thread.currentThread().getName()));
		executorService.shutdown();
		
		
		System.out.println("---------------------------------------");
		// Using FixedThreadPool and Thread Factory
		ExecutorService executorService2 = Executors.newFixedThreadPool(4, new MyFactory());
		executorService2.execute(()->System.out.println("newFixedThreadPool 1 : "+Thread.currentThread().getName()));
		executorService2.execute(()->System.out.println("newFixedThreadPool 2 :  "+Thread.currentThread().getName()));
		executorService2.execute(()->System.out.println("newFixedThreadPool 3 :  "+Thread.currentThread().getName()));
		executorService2.execute(()->System.out.println("newFixedThreadPool 4 :  "+Thread.currentThread().getName()));
		executorService2.execute(()->System.out.println("newFixedThreadPool 5 :  "+Thread.currentThread().getName()));
		executorService2.execute(()->System.out.println("newFixedThreadPool 6 :  "+Thread.currentThread().getName()));
		executorService2.shutdown();
		
		System.out.println("---------------------------------------");
		// Using CachedThreadPool and Thread Factory
		ExecutorService executorService3 = Executors.newCachedThreadPool(new MyFactory());
		executorService3.execute(()->System.out.println("newCachedThreadPool 1 : "+Thread.currentThread().getName()));
		executorService3.execute(()->System.out.println("newCachedThreadPool 2 : "+Thread.currentThread().getName()));
		executorService3.execute(()->System.out.println("newCachedThreadPool 3 : "+Thread.currentThread().getName()));
		executorService3.execute(()->System.out.println("newCachedThreadPool 4 : "+Thread.currentThread().getName()));
		executorService3.execute(()->System.out.println("newCachedThreadPool 5 : "+Thread.currentThread().getName()));
		executorService3.execute(()->System.out.println("newCachedThreadPool 6 : "+Thread.currentThread().getName()));
		executorService3.execute(()->System.out.println("newCachedThreadPool 7 : "+Thread.currentThread().getName()));
		executorService3.shutdown();
		
	}

}

class MyTask implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Task-1:: " + Thread.currentThread().getName());
	}
}
