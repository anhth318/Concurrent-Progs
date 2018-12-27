package com.tran.concurrency.synchronization.synchronized1;

public class ThreadedWorkerWithoutSync extends Thread{
	private ResourcesExploiter rExp;
	
	public ThreadedWorkerWithoutSync(ResourcesExploiter obj){
		rExp = obj;
	}
	
	public void run(){
		String threadName = Thread.currentThread().getName();

	    for(int i=0;i<1000;i++){
	    	rExp.exploit();
	    	System.out.println("Thread " + threadName + " obtained the resource value of " + rExp.getRsc());
	    }	    
	}

}
