package com.notwebschedules.NWSWebApp.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notwebschedules.NWSWebApp.functions.AllShiftTypes;
import com.notwebschedules.NWSWebApp.functions.ShiftFromID;
import com.notwebschedules.NWSWebApp.models.schedule.Shift;
import com.notwebschedules.NWSWebApp.models.schedule.SingleDaySchedule;
import com.notwebschedules.NWSWebApp.models.staff.Staff;
import com.notwebschedules.NWSWebApp.services.ScheduleDatabaseService;
import com.notwebschedules.NWSWebApp.services.StaffDatabaseService;

@Controller
public class ScheduleViewsController {
	
	@Autowired
	ScheduleDatabaseService scheduleService;
	
	@Autowired
	StaffDatabaseService staffService;
	
	AllShiftTypes allShiftTypes;
	
	ShiftFromID shiftFromID;

	@RequestMapping("/addschedule")
	public String showAddSchedule(Model model) {
		// filter by role eventually
		allShiftTypes = new AllShiftTypes();
		Staff[] staff = staffService.getAllStaff();
		List<Shift> allShifts = new ArrayList<>();
		allShifts = allShiftTypes.getAllShiftTypes();
		// need to add a field to staff for full name 
		// need to add support for inputting custom shift
		model.addAttribute("staff", staff);
		model.addAttribute("shift", allShifts);
//		model.addAttribute("shiftId");
//		model.addAttribute("employeeId");
			
		return "AddSchedule";
	}
	
	@RequestMapping("/addnewschedule")
	public String addSingleDaySchedule(Model model, @PathParam("employeeId") String employeeId, @PathParam("shiftId") String shiftId, @PathParam("date") String date) {
	
		shiftFromID = new ShiftFromID();
		Shift shift = shiftFromID.getShift(shiftId);
		
		Staff staff = staffService.getSingleStaffMemberById(employeeId);
		
		model.addAttribute("staff", staff);
		model.addAttribute("shiftId", shiftId);
		model.addAttribute("date", date);
	
		SingleDaySchedule singleDaySchedule = new SingleDaySchedule(staff, shift, date);
		
		model.addAttribute("singleDaySchedule", singleDaySchedule);
				
		scheduleService.addSingleDaySchedule(singleDaySchedule);
		
		
		return "NewSchedule";
	}
	
}
