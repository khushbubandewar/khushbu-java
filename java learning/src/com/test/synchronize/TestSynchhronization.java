package com.test.synchronize;

public class TestSynchhronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t= new Table();
		MyThread1 thread = new MyThread1(t);
		MyThread2 thread1 = new MyThread2(t);
		thread.start();
		thread1.start();
	}

}
