package com.notwebschedules.NWSWebApp.models.schedule.oncall;

public enum CallShiftType {

	DAYS_0700_1500("0700", "1500", 8, false, false, false, false),
	DAYS_0700_1500B("0700", "1500", 8, true, false, false, false),
	DAYS_0700_1500H("0700", "1500", 8, false, false, true, false),
	DAYS_0700_1500HB("0700", "1500", 8, true, false, true, false),
	DAYS_0700_1500N("0700", "1500", 8, false, false, false, true),
	DAYS_0700_1500T("0700", "1500", 8, false, true, false, false),
	AFTERNOONS_1500_1900("1500", "1900", 4, false, false, false, false),
	AFTERNOONS_1500_2300("1500", "2300", 8, false, false, false, false),
	AFTERNOONS_1500_2300B("1500", "2300", 8, true, false, false, false),
	AFTERNOONS_1500_2300H("1500", "2300", 8, false, false, true, false),
	AFTERNOONS_1500_2300HB("1500", "2300", 8, true, false, true, false),
	AFTERNOONS_1500_2300N("1500", "2300", 8, false, false, false, true),
	AFTERNOONS_1500_2300T("1500", "2300", 8, false, true, false, false),
	AFTERNOONS_1900_2300("1900", "2300", 4, false, false, false, false),
	MIDNIGHTS_2300_0700("2300", "0700", 8, false, false, false, false),
	MIDNIGHTS_2300_0700B("2300", "0700", 8, true, false, false, false),
	MIDNIGHTS_2300_0700H("2300", "0700", 8, false, false, true, false),
	MIDNIGHTS_2300_0700HB("2300", "0700", 8, true, false, true, false),
	MIDNIGHTS_2300_0700N("2300", "0700", 8, false, false, false, true),
	MIDNIGHTS_2300_0700T("2300", "0700", 8, false, true, false, false);
	
	private String startTime;
	private String endTime;
	private double shiftLength;
	private boolean backup;
	private boolean trauma;
	private boolean hearts;
	private boolean neuro;
	
	CallShiftType(String startTime, String endTime, double shiftLength, 
			boolean backup, boolean trauma, boolean hearts, boolean neuro) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLength = shiftLength;
		this.backup = backup;
		this.trauma = trauma;
		this.hearts = hearts;
		this.neuro = neuro;
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
	
	public boolean isBackup() {
		return backup;
	}
	
	public boolean isTrauma() {
		return trauma;
	}

	public boolean isHearts() {
		return hearts;
	}

	public boolean isNeuro() {
		return neuro;
	}

	
}
