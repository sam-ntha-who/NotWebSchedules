package com.notwebschedules.NWSWebApp.models.schedule;

import com.notwebschedules.NWSWebApp.models.staff.Staff;

public class SingleDaySchedule {
	
	Staff staff;
	Shift shift;
	String date;
	
	public SingleDaySchedule() {
		
	}
	
	public SingleDaySchedule(Staff staff, Shift shift, String date) {
		this.staff = staff;
		this.shift = shift;
		this.date = date;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

		
}
