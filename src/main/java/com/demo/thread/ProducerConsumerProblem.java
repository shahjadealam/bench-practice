package com.demo.thread;

import java.util.LinkedList;

public class ProducerConsumerProblem {
	public static void main(String[] args) throws InterruptedException {
		MyResource obj = new MyResource();
		Thread th1 = new Thread() {
			@Override
			public void run() {

				try {
					obj.producer();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		};
		Thread th2 = new Thread() {
			@Override
			public void run() {
				try {
					obj.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		th1.start();
		th2.start();

		th1.join();
		th2.join();
	}

}

class MyResource {
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 3;

	public void producer() throws InterruptedException {

		int item = 0;

		while (true) {

			synchronized (this) {
				while (list.size() == capacity)
					wait();

				list.add(item);
				System.out.println("Producer Produced : " + item++);

				notify();

				Thread.sleep(1000); // for visible to human eyes only
			}
		}
	}

	public void consumer() throws InterruptedException {
		while (true) {

			synchronized (this) {

				while (list.size() == 0)
					wait();

				System.out.println("Consumer Consumes - " + list.removeFirst());

				notify();

				Thread.sleep(1000);
			}
		}
	}
}