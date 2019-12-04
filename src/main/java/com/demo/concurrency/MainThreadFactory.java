package com.demo.concurrency;

import java.util.concurrent.ThreadFactory;

public class MainThreadFactory {

	public static void main(String[] args) {
		
		ThreadFactory myFactory = new MyFactory();
		
		// Creating Runnable using two ways
		Thread t1 = myFactory.newThread(new Task());// earlier we do "=new Thread(new Task())"
		Thread t2 = myFactory.newThread(() -> System.out.println("Hi : " + Thread.currentThread().getName()));

		t1.start();
		t2.start();
	}

}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Hi : " + Thread.currentThread().getName());

	}

}

class MyFactory implements ThreadFactory {
	int threadId = 1;

	@Override
	public Thread newThread(Runnable r) {

		Thread t = new Thread(r, "Himanshu Thread_" + threadId);
		System.out.println("New Thread Created with thread name : " + t.getName() + "\n Thread Id :_" + threadId);
		threadId++;
		return t;
	}

}
