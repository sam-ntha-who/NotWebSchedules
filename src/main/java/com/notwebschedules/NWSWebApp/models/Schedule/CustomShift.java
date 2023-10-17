package com.notwebschedules.NWSWebApp.models.schedule;

public class CustomShift {

	private String startTime;
	private String endTime;
	private double shiftLenght;
	
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
	public double getShiftLenght() {
		return shiftLenght;
	}
	public void setShiftLenght(double shiftLenght) {
		this.shiftLenght = shiftLenght;
	}
	
	public CustomShift(String startTime, String endTime, double shiftLenght) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLenght = shiftLenght;
	}
	
}
