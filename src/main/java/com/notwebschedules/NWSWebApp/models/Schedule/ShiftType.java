package com.notwebschedules.NWSWebApp.models.Schedule;

public enum ShiftType {

	DAYS_0700_1100(7.0, 11.0, 4),
	DAYS_0700_1530(7.0, 15.5, 8), 
	DAYS_0700_1930(7.0, 19.5, 12),
	DAYS_0900_1300(9.0, 13.0, 4),
	DAYS_0900_1730(9.0, 17.5, 8),
	AFTERNOONS_1100_1930(11.0, 19.5, 8),
	AFTERNOONS_1100_2330(11.0, 23.5, 12),
	AFTERNOONS_1500_1900(15.0, 19.0, 4),
	AFTERNOONS_1500_2330(15.0, 23.5, 8),
	MIDNIGHTS_1900_0730(19.0, 7.5, 12),
	MIDNIGHTS_2300_0730(23.0, 7.5, 8);
	
	// TODO: maybe make final?
	
	double startTime;
	double endTime;
	double shiftLength;
	
	ShiftType(double startTime, double endTime, double shiftLength) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLength = shiftLength;
		
	}

	public double getStartTime() {
		return startTime;
	}

	public double getEndTime() {
		return endTime;
	}

	public double getShiftLength() {
		return shiftLength;
	}
	
}
