package com.test.exception;

public class TestCustomException1 {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		int a=90;
		int b=20;
		if(a>b) {
			throw new CustomException("a value should be greater than b");

		}
		System.out.println("Custom Exception");
	}

}
