package com.test.exception;

public class TestFlowOfTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("state - 1");
			System.out.println("state - 2"+10/0);
			System.out.println("state - 3");
		}catch(Exception e) {
			System.out.println("state - 4"+10/0);
		}finally {
			System.out.println("state - 5");
		}
		System.out.println("state - 6");
	}

}
