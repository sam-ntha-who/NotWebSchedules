package com.notwebschedules.NWSWebApp.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.notwebschedules.NWSWebApp.models.schedule.Shift;
import com.notwebschedules.NWSWebApp.models.schedule.ShiftType;
import com.notwebschedules.NWSWebApp.models.schedule.oncall.CallShiftType;

public class AllShiftTypes {
	
	private List<Shift> allShifts;
	private List<ShiftType> allShiftTypes;
	private List<Shift> allCallShifts;
	private List<CallShiftType> allCallShiftTypes;
	

	public List<Shift> getAllShiftTypes() {
		allShifts = new ArrayList<>();
		allShiftTypes = new ArrayList<>();
		allShiftTypes = Arrays.asList(ShiftType.values());		
		for (ShiftType s : allShiftTypes) {
			Shift sh = new Shift(s);
			allShifts.add(sh);
		}
		return allShifts; 
	}
	
	public List<Shift> getAllCallShiftTypes() {
		allCallShifts = new ArrayList<>();
		allCallShiftTypes = new ArrayList<>(); 
		allCallShiftTypes = Arrays.asList(CallShiftType.values());
		for (CallShiftType c : allCallShiftTypes) {
			Shift sh = new Shift(c);
			allCallShifts.add(sh);
		}
		return allCallShifts;
	}
	
}
