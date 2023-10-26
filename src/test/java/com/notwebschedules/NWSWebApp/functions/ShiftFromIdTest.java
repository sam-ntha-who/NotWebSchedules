package com.notwebschedules.NWSWebApp.functions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.notwebschedules.NWSWebApp.models.schedule.Shift;
import com.notwebschedules.NWSWebApp.models.schedule.ShiftType;

public class ShiftFromIdTest {

	ShiftFromID shiftFromID;
	AllShiftTypes allShiftTypes;
	Shift shift;
	
	@Test
	public void getShiftFromIDTest() {
		shiftFromID = new ShiftFromID();
		String shiftId = "11-2330";
		Shift newShift = new Shift(ShiftType.AFTERNOONS_1100_2330);
		assertEquals(shiftId, newShift.getShiftId());
	}
	
//	@Test
//	public void createNewShiftFromShiftIDTest() {
//		String shiftId = "11-2330";	
//		shiftFromID = new ShiftFromID();
//		Shift shift = shiftFromID.getShift(shiftId);
//		Shift newShift = new Shift(shift);
//		
//		assertEquals(shiftId, newShift.getShiftId());
//	}
//	
}
