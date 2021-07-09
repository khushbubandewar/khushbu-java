package com.test.multithreading;

public class TestGetSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Khushbu's Thread");
		System.out.println(Thread.currentThread().getName());
	}
	

}
