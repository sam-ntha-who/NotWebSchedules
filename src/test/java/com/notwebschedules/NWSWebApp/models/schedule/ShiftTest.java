package com.notwebschedules.NWSWebApp.models.schedule;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.notwebschedules.NWSWebApp.models.schedule.CustomShift;
import com.notwebschedules.NWSWebApp.models.schedule.Shift;
import com.notwebschedules.NWSWebApp.models.schedule.ShiftType;
import com.notwebschedules.NWSWebApp.models.schedule.oncall.CallShiftType;
import com.notwebschedules.NWSWebApp.models.schedule.oncall.CustomOnCallShift;

public class ShiftTest {

	Shift shift;
	ShiftType shiftType;
	CustomShift customShift;
	CallShiftType callShiftType;
	CustomOnCallShift customOnCallShift;
	
	@Test 
	public void getShiftIdFromOriginalShift() {
		ShiftType newShift = ShiftType.AFTERNOONS_1100_2330;
		
		assertEquals("11-2330", newShift.getShiftId());
	}
	
	@Test
	public void getShiftId() {		
		
		ShiftType newShift = ShiftType.AFTERNOONS_1100_2330;
		Shift shift = new Shift(newShift);
		String newShiftId = shift.getShiftId();
		
		assertEquals("11-2330", newShiftId);
	}
}
