package com.notwebschedules.NWSWebApp.models.Schedule;

import com.notwebschedules.NWSWebApp.models.StaffInfo.Staff;

public class SingleDaySchedule {

	Staff staff;
	Shift shift;

	public SingleDaySchedule(Staff staff, Shift shift) {
		this.staff = staff;
		this.shift = shift;
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
	
}
