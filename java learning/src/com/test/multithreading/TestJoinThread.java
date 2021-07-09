package com.test.multithreading;

public class TestJoinThread {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		JoinThread thread = new JoinThread();
		thread.start();
		thread.join();
		for(int i=0; i<10; i++) {
			System.out.println("Test Join Thread");
		}
	}

}
