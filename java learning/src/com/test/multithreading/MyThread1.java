package com.test.multithreading;

public class MyThread1 extends Thread {
	public void run() {
		System.out.println("MyThread1");
//		super.start();//IllegalThreadStateException
		System.out.println("run()");
	}

	public void run(int i) {
		System.out.println("run(int i)");
	}
}
