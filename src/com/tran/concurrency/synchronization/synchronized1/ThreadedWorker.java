package com.tran.concurrency.synchronization.synchronized1;

public class ThreadedWorker extends Thread {
	ResourcesExploiter rExp;
	
	ThreadedWorker(ResourcesExploiter obj){
		rExp = obj;
	}
	
	public void run(){
		
		String threadName = Thread.currentThread().getName();
	    synchronized(rExp){
	    	for(int i=0;i<1000;i++){
	    		rExp.exploit();
	    		System.out.println("Thread " + threadName + " obtained the resource value of " + rExp.getRsc());
	    	}
	    }
	}

}
