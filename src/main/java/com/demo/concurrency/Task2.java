package com.demo.concurrency;

import org.apache.log4j.Logger;

public class Task2 implements Runnable {

	private int taskId;
	private static int parkingSlot = 5;
	long parkingTime;

	final static Logger logger = Logger.getLogger(Task.class);

	public Task2(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {

		System.out.println("parkingSlot :" + parkingSlot);

		if (parkingSlot > 0)
			checkParking();

		if (parkingSlot < 0) {
			System.out.println("Parking is Full, Waiting for free lot");
			try {
				Thread.sleep(parkingTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Checking for free Parking lot");
			checkParking();

		}

	}

	private void checkParking() {
		parkingSlot--;
		System.out.println("Car:" + taskId + " Stand in the Parking Lot");
		parkingTime = ((long) (Math.random() * 10000));
		try {
			Thread.sleep(parkingTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		parkingSlot++;
		System.out.println("Car: " + taskId + " has left parking, it stood there " + parkingTime / 1000 + ".00 Sec");
	}

}
