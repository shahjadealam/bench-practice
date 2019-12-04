package com.demo.concurrency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainExecutor {
	// We are passing two different task into executor,
	// but many a times only single thread complete both task
	// if we make a slight delay in tasks [i.e. something like thread.sleep()]
	// then only we can see a different Thread opening
	public static void main(String[] args) {
		Executor executor = Executors.newScheduledThreadPool(3);// CachedThreadPool();

		// Using Lambda
		executor.execute(() -> {

			// Thread.sleep(100);

			// Some Delay
			List<String> list = Arrays.asList("Shahjade", "Alam", "Shahjade", "Shahjade", "Alam", "Shahjade");
			List<String> list2 = Arrays.asList("Shahjade", "Alam", "Shahjade", "Shahjade", "Alam", "Shahjade");
			Collections.sort(list);
			Collections.sort(list2);
			// Delay Ends

			System.out.println("using Lambda : " + Thread.currentThread().getName());
		});
		executor.execute(new MyTask());

	}

}

/*class MyExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		command.run();
	}

}*/
