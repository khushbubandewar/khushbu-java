package com.test.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runnable = new MyRunnable();
//		Thread thread = new Thread();
		Thread thread1 = new Thread(runnable);
//		thread.start();
		thread1.start();
//		thread.run();
//		thread1.run();
		for(int i=1; i<=10;i++) {
			System.out.println("Main Thread");
		}
	}

}
