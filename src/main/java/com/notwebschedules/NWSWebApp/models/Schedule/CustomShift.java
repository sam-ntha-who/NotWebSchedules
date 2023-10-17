package com.notwebschedules.NWSWebApp.models.Schedule;

public class CustomShift {

	private double startTime;
	private double endTime;
	private double shiftLenght;
	
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public double getShiftLenght() {
		return shiftLenght;
	}
	public void setShiftLenght(double shiftLenght) {
		this.shiftLenght = shiftLenght;
	}
	
	public CustomShift(double startTime, double endTime, double shiftLenght) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLenght = shiftLenght;
	}
	
}
