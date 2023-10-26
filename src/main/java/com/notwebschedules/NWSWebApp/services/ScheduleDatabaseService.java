package com.notwebschedules.NWSWebApp.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.notwebschedules.NWSWebApp.models.schedule.SingleDaySchedule;

@Service
public class ScheduleDatabaseService {

	private RestTemplate rt = new RestTemplate();

	public SingleDaySchedule addSingleDaySchedule(SingleDaySchedule singleDaySchedule) {

		String url = "http://localhost:8081/create-one-day-schedule";

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<SingleDaySchedule> httpEntity = new HttpEntity<SingleDaySchedule>(singleDaySchedule, headers);

		SingleDaySchedule response = rt.postForObject(url, httpEntity, SingleDaySchedule.class);

		return response;

	}

}
