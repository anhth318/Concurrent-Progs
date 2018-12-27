package com.tran.concurrency.synchronization.synchronized1;

public class ExecutableProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ResourcesExploiterWithLock resource = new ResourcesExploiterWithLock(0);
		ResourcesExploiter resource = new ResourcesExploiter(0);
		
		ThreadedWorker worker1 = new ThreadedWorker(resource);
		ThreadedWorker worker2 = new ThreadedWorker(resource);
		ThreadedWorker worker3 = new ThreadedWorker(resource);
		
		/*ThreadedWorkerWithLock worker1 = new ThreadedWorkerWithLock(resource);
		ThreadedWorkerWithLock worker2 = new ThreadedWorkerWithLock(resource);
		ThreadedWorkerWithLock worker3 = new ThreadedWorkerWithLock(resource);*/
		
		/*ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resource);
		ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resource);
		ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resource);*/
		
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
		
		System.out.println("The final value of resource is " + resource.getRsc());
		
	}

}
