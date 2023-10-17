package com.notwebschedules.NWSWebApp.models.staffInfo;

public class Staff {

	private String employeeId;
	private String firstName;
	private String lastName;
	private Role role;
	private String phoneNumber;
	private String secondaryPhone;

	public Staff() {
		
	}
	
	public Staff(String firstName, String lastName, Role role, String phoneNumber, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.phoneNumber = phoneNumber;
		this.employeeId = id;
	}
	
	public Staff(String firstName, String lastName, Role role, String phoneNumber, String secondaryPhone, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.phoneNumber = phoneNumber;
		this.secondaryPhone = secondaryPhone;
		this.employeeId = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String id) {
		this.employeeId = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
