package com.test.multithreading;

public class SynchronizedEx extends Thread{
	Display d;
	String name;
	SynchronizedEx(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}
