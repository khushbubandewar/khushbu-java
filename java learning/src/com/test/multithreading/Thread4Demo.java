package com.test.multithreading;

public class Thread4Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 thread = new MyThread4();
		Thread thread1 = new Thread(thread);
//		thread.start();
		thread1.start();
		System.out.println("Main method");
	}

}
