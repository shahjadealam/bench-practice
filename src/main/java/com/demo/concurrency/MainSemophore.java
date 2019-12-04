package com.demo.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class MainSemophore {
	
	// Semaphore is used where only a maximum of n number of thread can execute the given block at a time

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(15);
		Semaphore s1 = new Semaphore(3);
		IntStream.range(0, 10).forEach(threadNumber -> {
			System.out.println(s1.availablePermits());
			executorService.submit(() -> {
				Boolean result = s1.tryAcquire();

				while (result == false) {

					// System.out.println("Hi");
					if (result = s1.tryAcquire()) {

					}
				}
				System.out.println("acquired by " + Thread.currentThread().getName() + " : " + result);

				// processing Or Task
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (result) {
					System.out.println("Thread : " + Thread.currentThread().getName() + " is going to release");
					s1.release();
				}

			});
		});

//		MySemaphore mySemaphore = new MySemaphore(5);
//		IntStream.range(0, 10).forEach(threadNumber -> {
//			System.out.println(mySemaphore.checkSlots());
//			executorService.submit(() -> {
//				System.out.println(Thread.currentThread().getName() + " : " + mySemaphore.tryLogin());
//			});
//		});

		executorService.shutdown();
	}
}

class MySemaphore {

	private Semaphore semaphore;

	public MySemaphore(int slots) {
		semaphore = new Semaphore(slots);
	}

	public boolean tryLogin() {
		return semaphore.tryAcquire();
	}

	public void login() throws InterruptedException {
		semaphore.acquire();
	}

	public void logo() {

		semaphore.release();
	}

	public int checkSlots() {

		return semaphore.availablePermits();
	}
}