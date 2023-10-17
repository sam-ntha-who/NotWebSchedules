package com.notwebschedules.NWSWebApp.exceptions;

public class PhoneNumberNotValidException extends IllegalArgumentException{

	private static final long serialVersionUID = 1L;
	
	public PhoneNumberNotValidException(String phoneNumber){
		super("This phone number (" + phoneNumber + ") is not formatted correctly. Please use 10 digit format.");
	}
	
}
