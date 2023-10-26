package com.notwebschedules.NWSWebApp.models.schedule;

public class CustomShift {

	private String startTime;
	private String endTime;
	private double shiftLength;
	private String shiftId;
	
	public double getShiftLength() {
		return shiftLength;
	}
	public void setShiftLength(double shiftLength) {
		this.shiftLength = shiftLength;
	}
	public String getShiftId() {
		return shiftId;
	}
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public CustomShift(String startTime, String endTime, double shiftLength, String shiftId) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLength = shiftLength;
		this.shiftId = shiftId;
	}
	
}
