package com.demo.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		Future<String> result = executorService.submit(new TaskCallable());
	
		System.out.println(result.get());
	}
}

class TaskCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return "Hello : " + Thread.currentThread().getName();
	}

}