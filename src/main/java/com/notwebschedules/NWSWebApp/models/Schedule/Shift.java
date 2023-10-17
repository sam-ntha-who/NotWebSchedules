package com.notwebschedules.NWSWebApp.models.schedule;

import com.notwebschedules.NWSWebApp.models.schedule.oncall.CallShiftType;
import com.notwebschedules.NWSWebApp.models.schedule.oncall.CustomOnCallShift;

public class Shift {

	private String startTime;
	private String endTime;
	private double shiftLength;
	private boolean backup;
	private boolean trauma;
	private boolean hearts;
	private boolean neuro;
	
	ShiftType shiftType;
	CustomShift customShift;
	CallShiftType callShiftType;
	CustomOnCallShift customOnCallShift;
	
	
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
	
	public Shift(CallShiftType callShiftType) {
		this.startTime = this.callShiftType.getStartTime();
		this.endTime = this.callShiftType.getEndTime();
		this.shiftLength = this.callShiftType.getShiftLength();
		this.backup = this.callShiftType.isBackup();
		this.trauma = this.callShiftType.isTrauma();
		this.hearts = this.callShiftType.isHearts();
		this.neuro = this.callShiftType.isNeuro();
	}
	
	public Shift(CustomOnCallShift customOnCallShift) {
		this.startTime = this.callShiftType.getStartTime();
		this.endTime = this.callShiftType.getEndTime();
		this.shiftLength = this.callShiftType.getShiftLength();
		this.backup = this.callShiftType.isBackup();
		this.trauma = this.callShiftType.isTrauma();
		this.hearts = this.callShiftType.isHearts();
		this.neuro = this.callShiftType.isNeuro();
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
	
	public double getShiftLength() {
		return shiftLength;
	}
	
	public void setShiftLength(double shiftLength) {
		this.shiftLength = shiftLength;
	}
	
	public boolean isBackup() {
		return backup;
	}

	public void setBackup(boolean backup) {
		this.backup = backup;
	}

	public boolean isTrauma() {
		return trauma;
	}

	public void setTrauma(boolean trauma) {
		this.trauma = trauma;
	}

	public boolean isHearts() {
		return hearts;
	}

	public void setHearts(boolean hearts) {
		this.hearts = hearts;
	}

	public boolean isNeuro() {
		return neuro;
	}

	public void setNeuro(boolean neuro) {
		this.neuro = neuro;
	}

	public ShiftType getShiftType() {
		return shiftType;
	}

	public void setShiftType(ShiftType shiftType) {
		this.shiftType = shiftType;
	}

	public CustomShift getCustomShift() {
		return customShift;
	}

	public void setCustomShift(CustomShift customShift) {
		this.customShift = customShift;
	}

	public CallShiftType getCallShiftType() {
		return callShiftType;
	}

	public void setCallShiftType(CallShiftType callShiftType) {
		this.callShiftType = callShiftType;
	}

	public CustomOnCallShift getCustomOnCallShift() {
		return customOnCallShift;
	}

	public void setCustomOnCallShift(CustomOnCallShift customOnCallShift) {
		this.customOnCallShift = customOnCallShift;
	}
	
}
