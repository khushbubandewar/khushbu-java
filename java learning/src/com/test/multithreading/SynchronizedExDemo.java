package com.test.multithreading;

public class SynchronizedExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1= new Display();
		SynchronizedEx Thread = new SynchronizedEx(d1,"Dhoni");
		SynchronizedEx Thread1 = new SynchronizedEx(d1,"Kohli");
		Thread1.start();
		Thread.start();
		
	}

}
