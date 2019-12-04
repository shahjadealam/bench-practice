package com.demo.concurrency;

/**
 * Why ThreadPoolExecutor?
 * <p>
 * <i> The Executor and ExecutorService interfaces are used to work with
 * different thread pool implementations in Java.
 * 
 * The Executors helper class contains several methods for creation of
 * pre-configured thread pool instances for you. Those classes are a good place
 * to start with – use it if you don't need to apply any custom fine-tuning.
 * </p>
 * </i>
 * 
 * <b> But if you need to apply any custom fine-tuning, you should go for
 * ThreadPoolExecutor. </b>
 * <p>
 * ThreadPoolExecutor is an extensible thread pool implementation with lots of
 * parameters and hooks for fine-tuning.
 * </p>
 * 
 * The main configuration parameters that we'll discuss here are: corePoolSize,
 * maximumPoolSize, and keepAliveTime.
 * 
 * 
 * <p>
 * The pool consists of a fixed number of core threads that are kept inside all
 * the time, and some excessive threads that may be spawned and then terminated
 * when they are not needed anymore. The corePoolSize parameter is the amount of
 * core threads which will be instantiated and kept in the pool. If all core
 * threads are busy and more tasks are submitted, then the pool is allowed to
 * grow up to a maximumPoolSize.
 * 
 * The keepAliveTime parameter is the interval of time for which the excessive
 * threads (i.e. threads that are instantiated in excess of the corePoolSize)
 * are allowed to exist in the idle state.
 * </p>
 * 
 * @author shahjade.a
 */
public class MainThreadPoolExecutor {
	public static void main(String[] args) {

	}
}
