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
	private String shiftId;
	
	private ShiftType shiftType;
	private CustomShift customShift;
	private CallShiftType callShiftType;
	private CustomOnCallShift customOnCallShift;
	
	public Shift() {
		
	}
	
//	public Shift(Shift shift) {
//		this.startTime = shift.getStartTime();
//		this.endTime = shift.getEndTime();
//		this.shiftLength = shift.getShiftLength();
//		this.backup = shift.isBackup();
//		this.trauma = shift.isTrauma();
//		this.hearts = shift.isHearts();
//		this.neuro = shift.isNeuro();
//		this.shiftId = shift.getShiftId();
//	}
	
	public Shift(CustomShift customShift) {
		this.startTime = customShift.getStartTime();
		this.endTime = customShift.getEndTime();
		this.shiftLength = customShift.getShiftLength();
		this.shiftId = customShift.getShiftId();
	}

	public Shift(ShiftType shiftType) {
		this.startTime = shiftType.getStartTime();
		this.endTime = shiftType.getEndTime();
		this.shiftLength = shiftType.getShiftLength();
		this.shiftId = shiftType.getShiftId();
	}
	
	public Shift(CallShiftType callShiftType) {
		this.startTime = callShiftType.getStartTime();
		this.endTime = callShiftType.getEndTime();
		this.shiftLength = callShiftType.getShiftLength();
		this.backup = callShiftType.isBackup();
		this.trauma = callShiftType.isTrauma();
		this.hearts = callShiftType.isHearts();
		this.neuro = callShiftType.isNeuro();
		this.shiftId = callShiftType.getShiftId();
	}
	
	public Shift(CustomOnCallShift customOnCallShift) {
		this.startTime = customOnCallShift.getStartTime();
		this.endTime = customOnCallShift.getEndTime();
		this.shiftLength = customOnCallShift.getShiftLength();
		this.backup = customOnCallShift.isBackup();
		this.trauma = customOnCallShift.isTrauma();
		this.hearts = customOnCallShift.isHearts();
		this.neuro = customOnCallShift.isNeuro();
		this.shiftId = customOnCallShift.getShiftId();
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
	
	
	public String getShiftId() {
		return shiftId;
	}

	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}
	
}
