package com.tran.concurrency.synchronization.example3;

public class SyncMethods {
private int sum = 0;
	
	public synchronized void calculate() {
        setSum(getSum() + 1);
    }
	
	public void setSum(int n){
		sum = n;
	}
	
	public int getSum(){
		return sum;
	}

}
