package com.test.multithreading;

public class TestpriorityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityEx priority = new PriorityEx();
//		MyThread1 myth = new MyThread1();
		//myth.setPriority(5);
//		myth.start();
		priority.setPriority(10);
//		priority.setPriority(100);//IllegalArgumentException
		priority.start();
//		for(int i=11;i<=20;i++) {
//			System.out.println("Main Method"+i);
//		}
	}

}
