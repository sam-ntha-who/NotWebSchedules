package com.notwebschedules.NWSWebApp.models.schedule;

public enum ShiftType {

	DAYS_0700_1100("0700", "1100", 4, "7-1100"),
	DAYS_0700_1530("0700", "1530", 8, "7-1530"), 
	DAYS_0700_1930("0700", "1930", 12, "7-1930"),
	DAYS_0900_1300("0900", "1300", 4, "9-1300"),
	DAYS_0900_1730("0900", "1730", 8, "9-1730"),
	AFTERNOONS_1100_1930("1100", "1930", 8, "11-1930"),
	AFTERNOONS_1100_2330("1100", "2330", 12, "11-2330"),
	AFTERNOONS_1500_1900("1500", "1900", 4, "15-1900"),
	AFTERNOONS_1500_2330("1500", "2330", 8, "15-2330"),
	MIDNIGHTS_1900_0730("1900", "0730", 12, "19-0730"),
	MIDNIGHTS_2300_0730("2300", "0730", 8, "23-0730");
	
	// TODO: maybe make final?
	
	String startTime;
	String endTime;
	double shiftLength;
	String shiftId;
	
	ShiftType(String startTime, String endTime, double shiftLength, String shiftId) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLength = shiftLength;
		this.shiftId = shiftId;
		
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
	
	public String getShiftId() {
		return shiftId;
	}
}
