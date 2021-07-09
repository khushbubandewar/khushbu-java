package com.test.exception;
class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
}
class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);
	}
}
public class TestDemoCostomizeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[0]);
		if(age>60) {
			throw new TooYoungException("TooYoungException");
		}else if(age<18) {
			throw new TooOldException("TooOldException");
		}else {
			System.out.println("Last Block ");
		}
	}

}
