package com.test.multithreading;

public class Thread1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 myThread = new MyThread1();
		myThread.start();
		
//		myThread.start();//IllegalThreadStateException
	}

}
