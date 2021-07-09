package com.test.multithreading;

public class TestInterruptedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptedEx thread = new InterruptedEx();
		thread.start();
		thread.interrupt();
		System.out.println("End Main Thread");
	}

}
