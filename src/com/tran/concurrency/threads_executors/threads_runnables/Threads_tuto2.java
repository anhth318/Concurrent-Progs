package com.tran.concurrency.threads_executors.threads_runnables;

import java.util.concurrent.TimeUnit;

public class Threads_tuto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
		    try {
		        String name = Thread.currentThread().getName();
		        System.out.println("Foo " + name);
		        TimeUnit.SECONDS.sleep(1);
		        System.out.println("Bar " + name);
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};
		runnable.run();
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
