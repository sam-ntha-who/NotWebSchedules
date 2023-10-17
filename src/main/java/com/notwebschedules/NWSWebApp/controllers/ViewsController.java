package com.notwebschedules.NWSWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.notwebschedules.NWSWebApp.models.StaffInfo.Role;
import com.notwebschedules.NWSWebApp.models.StaffInfo.Staff;
import com.notwebschedules.NWSWebApp.services.StaffDatabaseService;

@Controller
public class ViewsController {

	@Autowired
	StaffDatabaseService staffService;	
	
	// RequestMapping because they are all requests duh
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/addstaff")
	public String showAddStaff() {
		return "AddStaff";
	}
	
	@RequestMapping("/addnewstaff")
	public String addStaff(Model model, @RequestParam String firstName, @RequestParam String lastName, 
			@RequestParam Role role, @RequestParam String phoneNumber, @RequestParam(required=false) String secondaryPhone, @RequestParam String employeeId) {
		// need to fix secondary phone!!
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("employeeId", employeeId);
		model.addAttribute("phoneNumber", phoneNumber);
		model.addAttribute("secondaryPhone", secondaryPhone);
		model.addAttribute("role", role);
		
		Staff staff = new Staff();
		staff.setFirstName(firstName);
		staff.setLastName(lastName);
		staff.setEmployeeId(employeeId);
		staff.setRole(role);
		staff.setPhoneNumber(phoneNumber);
		
		if (secondaryPhone != null) {
			staff.setSecondaryPhone(secondaryPhone);
		}
		
		
		model.addAttribute("staff", staff);
		
		staffService.createStaff(staff);
		
		return "AddStaff";
	}
	
	@RequestMapping("/newstaffmember")
	public String showNewStaffMember(Model model, @RequestParam String firstName, @RequestParam String lastName, 
			@RequestParam Role role, @RequestParam String phoneNumber, @RequestParam(required=false) String secondaryPhone, @RequestParam String employeeId) {
		// add to new staff creator

		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("employeeId", employeeId);
		model.addAttribute("phoneNumber", phoneNumber);
		model.addAttribute("secondaryPhone", secondaryPhone);
		model.addAttribute("role", role);
		return "NewStaffMember";
	}
	// this one works as expected!
	@RequestMapping("/allstaff")
	public String showAllStaffMembers(Model model) {
		Staff[] allStaff = staffService.getAllStaff();
		model.addAttribute("staff", allStaff);
		return "AllStaff";
	}
	@RequestMapping("/remove") 
	public String removeStaff() {
		return "RemoveStaffMember";
	}
	
	
	@RequestMapping("/removestaff")
	public String removeStaffById(Model model, String employeeId) {
		
		model.addAttribute("employeeId", employeeId);
		// add option to ask if you're sure as well as confirmation that person is deleted
//		Staff staffToRemove = staffService.getSingleStaffMemberById(employeeId);
//		model.addAttribute("staff", staffToRemove);
		
		staffService.removeStaffMember(employeeId);
	
		return "Removed";
		
	}
	
}
