package com.notwebschedules.NWSWebApp.functions;

import com.notwebschedules.NWSWebApp.models.schedule.Shift;

public class ShiftFromID {

	AllShiftTypes allShiftTypes;
	
	public Shift getShift(String shiftId){
		allShiftTypes = new AllShiftTypes();
		
		Shift shift = new Shift();
		
		for (Shift s : allShiftTypes.getAllShiftTypes()) {
			if (shiftId.equals(s.getShiftId())) {
				shift = s;
			} else {
				for (Shift c : allShiftTypes.getAllCallShiftTypes()) {
					if (shiftId.equals(c.getShiftId())) {
						shift = c;
					}
				}
			} 
		}
		return shift;
	}
}
