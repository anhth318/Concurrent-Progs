package com.tran.concurrency.threads_executors.threads_runnables;

public class Threads_tuto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};

		task.run();

		Thread thread = new Thread(task);
		thread.start();

		System.out.println("Done!");

	}

}
