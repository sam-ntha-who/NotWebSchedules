package com.notwebschedules.NWSWebApp.models.schedule;

public enum ShiftType {

	DAYS_0700_1100("0700", "1100", 4),
	DAYS_0700_1530("0700", "1530", 8), 
	DAYS_0700_1930("0700", "1930", 12),
	DAYS_0900_1300("0900", "1300", 4),
	DAYS_0900_1730("0900", "1730", 8),
	AFTERNOONS_1100_1930("1100", "1930", 8),
	AFTERNOONS_1100_2330("1100", "2330", 12),
	AFTERNOONS_1500_1900("1500", "1900", 4),
	AFTERNOONS_1500_2330("1500", "2330", 8),
	MIDNIGHTS_1900_0730("1900", "0730", 12),
	MIDNIGHTS_2300_0730("2300", "0730", 8);
	
	// TODO: maybe make final?
	
	String startTime;
	String endTime;
	double shiftLength;
	
	ShiftType(String startTime, String endTime, double shiftLength) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLength = shiftLength;
		
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public double getShiftLength() {
		return shiftLength;
	}
	
}
