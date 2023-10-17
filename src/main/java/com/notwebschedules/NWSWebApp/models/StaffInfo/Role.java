package com.notwebschedules.NWSWebApp.models.staffInfo;

import com.notwebschedules.NWSWebApp.exceptions.RoleNotFoundException;

public enum Role {

	RN("RN"),
	ST("ST"),
	TSA("TSA"),
	CRNA("CRNA"),
	PA("PA"),
	MDA("MDA"),
	AIDE("AIDE");
	
	private String supportedRoles;
	
	
	Role(String supportedRoles) {
		this.setSupportedRoles(supportedRoles);
	}
	
	public static Role fromString(String value) {
		for (Role role : Role.values()) {
			if (role.toString().equalsIgnoreCase(value)) {
				return role;
			}
		}
		
		throw new RoleNotFoundException(value);
	}

	public String getSupportedRoles() {
		return supportedRoles;
	}

	public void setSupportedRoles(String supportedRoles) {
		this.supportedRoles = supportedRoles;
	}
	
}
