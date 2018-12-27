package com.tran.concurrency.synchronization.synchronized1;

public class ThreadedWorkerWithLock extends Thread{
	private ResourcesExploiterWithLock rExp;
	
	ThreadedWorkerWithLock(ResourcesExploiterWithLock obj){
		rExp = obj;
	}
	
	public void run(){
		String threadName = Thread.currentThread().getName();
		for(int i=0;i<100;i++){
			rExp.exploit();
			System.out.println("Thread " + threadName + " obtained the resource value of " + rExp.getRsc());
		}
	    
	}

}
