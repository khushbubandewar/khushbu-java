package com.test.exception;

public class TestException {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//		System.out.println("hello");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("java");

//		System.out.println("hello");
//		Thread.sleep(5000);
//		System.out.println("java");
	
		doStuff();	
}
	
	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	public static void doMoreStuff() throws InterruptedException {
		Thread.sleep(5000);
	}
	

}
