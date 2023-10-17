package com.notwebschedules.NWSWebApp.models.Schedule;

public class Shift {

	private double startTime;
	private double endTime;
	private double shiftLength;
	
	ShiftType shiftType;
	CustomShift customShift;
	
	public Shift(CustomShift customShift) {
		this.startTime = this.customShift.getStartTime();
		this.endTime = this.customShift.getEndTime();
		this.shiftLength = this.customShift.getShiftLenght();
		this.customShift = customShift;
	}
	
	public Shift(ShiftType shiftType) {
		this.startTime = this.shiftType.getStartTime();
		this.endTime = this.shiftType.getStartTime();
		this.shiftLength = this.shiftType.getShiftLength();
		this.shiftType = shiftType;
	}
	
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
	public double getShiftLength() {
		return shiftLength;
	}
	public void setShiftLength(double shiftLength) {
		this.shiftLength = shiftLength;
	}
	
}
