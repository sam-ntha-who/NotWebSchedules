package com.notwebschedules.NWSWebApp.services;

import java.net.URI;
import java.net.http.HttpRequest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.notwebschedules.NWSWebApp.models.staff.Staff;

@Service
public class StaffDatabaseService {

private RestTemplate rt = new RestTemplate();
	
	public Staff createStaff(Staff staff) {
		
		String url = "http://localhost:8081/create-new-staff";
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Staff> httpEntity = new HttpEntity<>(staff, headers); 
		
		Staff response = rt.postForObject(url, httpEntity, Staff.class);
		
		return response;
	}
	
	public Staff getSingleStaffMemberById(String employeeId) {
		String url = "http://localhost:8081/staff-profile/{employeeId}";
		Staff response = rt.getForObject(url, Staff.class, employeeId);
		return response;
	}
	
	// this one works as expected!
	public Staff[] getAllStaff() {
		String url = "http://localhost:8081/all-staff";
		
		Staff[] response = rt.getForObject(url, Staff[].class);
		
		return response;
	}
	
	public void removeStaffMember(String employeeId) {
		// may need tweaking
		String url = "http://localhost:8081/remove-staff-member/";
		
		HttpRequest httpRequest = HttpRequest.newBuilder().DELETE().uri(URI.create(url + employeeId)).build();
		
		rt.delete(httpRequest.uri());
		
	}

	
}
