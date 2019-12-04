package com.demo.concurrency;

import java.util.concurrent.ExecutionException;

/**
 * Simply, wait() is an instance method that's used for thread
 * synchronization(like in producer consumer example).It can be called on any
 * object, as it's defined right on java.lang.Object, but it can only be called
 * from a synchronized block. It releases the lock on the object so that another
 * thread can jump in and acquire a lock.
 * 
 * For wait(), the waking up process is a bit more complicated. We can wake the
 * thread by calling either the notify() or notifyAll() methods on the monitor
 * that is being waited on.
 * 
 * On the other hand, Thread.sleep() is a static method that can be called from
 * any context. Thread.sleep() pauses the current thread and does not release
 * any locks.
 * 
 * For sleep(), a thread gets started after a specified time interval, unless it
 * is interrupted.
 * 
 * @author shahjade.a
 *
 */
public class WaitAndSleep {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

	}

}