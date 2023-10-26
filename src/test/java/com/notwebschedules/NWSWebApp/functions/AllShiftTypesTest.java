package com.notwebschedules.NWSWebApp.functions;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import java.util.List;


import org.junit.jupiter.api.Test;

import com.notwebschedules.NWSWebApp.models.schedule.Shift;

public class AllShiftTypesTest {

	@Test
	public void populateList() {
		
		AllShiftTypes allShiftTypes = new AllShiftTypes();
		
		List<Shift> shifts = new ArrayList<>();
		
		shifts = allShiftTypes.getAllShiftTypes();
		
		assertNotEquals(0, shifts.size());
		assertEquals(11, shifts.size());
		
	}
	
	
}
