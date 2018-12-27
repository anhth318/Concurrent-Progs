package com.tran.concurrency.multithreading;

public class ExecutableProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateLCMThread worker1 = new CalculateLCMThread(57, 89);
		CalculateLCMThread worker2 = new CalculateLCMThread(23, 62);
		CalculateLCMThread worker3 = new CalculateLCMThread(14, 18);
		
		worker1.start();
		worker2.start();
		worker3.start();
		
		try
        { 
			worker1.join(); 
			worker2.join();
			worker3.join();
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        }

	}

}
