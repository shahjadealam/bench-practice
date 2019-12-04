package com.demo.concurrency;

/**
 * @author shahjade.a
 * 
 *         ThreadLocal gives us the ability to store data individually for the
 *         current thread – and simply wrap it within a special type of object.
 *         The TheadLocal construct allows us to store data that will be
 *         accessible only by a specific thread.
 * 
 *         Note: Do Not Use ThreadLocal with ExecutorService 
 *         -> If we want to use an ExecutorService and submit a Runnable to it, using ThreadLocal
 *         will yield non-deterministic results – because we do not have a
 *         guarantee that every Runnable action for a given user object will be
 *         handled by the same thread every time it is executed. 
 *         -> Because of that, our ThreadLocal will be shared among different userIds. That's
 *         why we should not use a TheadLocal together with ExecutorService. It
 *         should only be used when we have full control over which thread will
 *         pick which runnable action to execute.
 */
public class MainThreadLocal {
	public static void main(String[] args) {
		ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
		// setting the value
		threadLocalValue.set(50);

		// getting the value
		Integer i = threadLocalValue.get();
		System.out.println(i);
	}
}
