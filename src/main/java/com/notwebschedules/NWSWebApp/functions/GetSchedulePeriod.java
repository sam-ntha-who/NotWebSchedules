package com.notwebschedules.NWSWebApp.functions;

import java.time.chrono.Chronology;
import java.util.Calendar;

public class GetSchedulePeriod {
	
	// this needs lots of work
	
	Chronology chronology;
	static Calendar calendar;
	
	public static Calendar getCal() {
		return Calendar.getInstance();
	}
	
	public Chronology getSixWeeks() {
		chronology.dateYearDay(0, 0);
		
		return chronology;
	}
	
	
}
