package com.notwebschedules.NWSWebApp.models.staff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

	private String digits;

	public PhoneNumber(String digits) {
		// create an exception class for invalid input
		if (numberValidator(digits)) {
			this.digits = digits;
		}
		this.digits = "0000000000";
		
	}

	public String getDigits() {
		return digits;
	}

	public void setDigits(String digits) {
		this.digits = digits;
	}
	
	public boolean numberValidator(String digits) {
		String regex = "\\d{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(digits);
		
		return matcher.find();
	}
	
}
