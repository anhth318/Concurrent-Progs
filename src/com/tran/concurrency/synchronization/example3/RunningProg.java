package com.tran.concurrency.synchronization.example3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class RunningProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(3);
	    SyncMethods summation = new SyncMethods();
	 
	    IntStream.range(0, 1000)
	      .forEach(count -> service.submit(summation::calculate));
	    
	    try {
	    	service.shutdown();
			service.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("termination interrupted");
		}finally {
            if (!service.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            service.shutdownNow();
        }
	    
	    System.out.print(summation.getSum()); 
	    
	}

}
