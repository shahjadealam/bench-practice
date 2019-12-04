package com.demo.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MainScheduledExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);
//		Callable<String> task1 = new Callable<String>() {
//
//			@Override
//			public String call() throws Exception {
//
//				return "Hello World :: " + Thread.currentThread().getName();
//			}
//		};
//		Callable<String> task2 = new Callable<String>() {
//
//			@Override
//			public String call() throws Exception {
//
//				return "Hi World :: " + Thread.currentThread().getName();
//			}
//		};
		Future<String> result = executorService.schedule(new MyTaskCallable(), 7, TimeUnit.SECONDS);
		ScheduledFuture<String> resultNew = executorService.schedule(new MyTaskCallable(), 3, TimeUnit.SECONDS);
		

		System.out.println("Hello : 1");
		
		System.out.println(resultNew.get());
		System.out.println(result.get());

		System.out.println("========================================");
		// Initially it will execute at 2 second and after that it remain execute after
		// each 4 seconds
		executorService.scheduleAtFixedRate(new MyTaskRunnable(), 2, 4, TimeUnit.SECONDS);

		// It will execute 10 second after previous thread is over
		// executorService.scheduleWithFixedDelay(new MyTaskRunnable(), 3, 10,
		// TimeUnit.SECONDS);

	}

}

// Same as Runnable, just use Callable<Type> in case you want to return some value
class MyTaskCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
// It allow to throw exception while runnable does not
		return "Hello : " + Thread.currentThread().getName();
	}

}

class MyTaskRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Task-1:: " + Thread.currentThread().getName());
	

	}
}
