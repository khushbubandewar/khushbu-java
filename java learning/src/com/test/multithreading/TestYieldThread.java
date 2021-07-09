package com.test.multithreading;

public abstract class TestYieldThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThread thread = new YieldThread();
		thread.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main Method");
		}
	}

}
