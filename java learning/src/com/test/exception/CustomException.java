package com.test.exception;

public class CustomException extends Exception{
	CustomException(String message){
		super(message);
	}
	CustomException(){
		super();
	}
}
