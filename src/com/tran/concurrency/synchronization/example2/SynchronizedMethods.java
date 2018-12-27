package com.tran.concurrency.synchronization.example2;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.Test;

public class SynchronizedMethods {
	private int sum = 0;
	
	public void calculate() {
        setSum(getSum() + 1);
    }
	
	public void setSum(int n){
		sum = n;
	}
	
	public int getSum(){
		return sum;
	}

	@Test
	public void givenMultiThread_whenNonSyncMethod() {
	    ExecutorService service = Executors.newFixedThreadPool(3);
	    SynchronizedMethods summation = new SynchronizedMethods();
	 
	    IntStream.range(0, 1000)
	      .forEach(count -> service.submit(summation::calculate));
	    try {
			service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    assertEquals(1000, summation.getSum());
	}
	
	
}
