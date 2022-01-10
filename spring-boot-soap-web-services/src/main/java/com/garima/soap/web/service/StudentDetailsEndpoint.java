package com.garima.soap.web.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.garima.students.GetStudentDetailsRequest;
import com.garima.students.GetStudentDetailsResponse;
import com.garima.students.StudentDetails;

@Endpoint
public class StudentDetailsEndpoint {

	@PayloadRoot(namespace = "http://garima.com/students", localPart = "GetStudentDetailsRequest")
	@ResponsePayload
	public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) {
		GetStudentDetailsResponse response = new GetStudentDetailsResponse();
		
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setId(request.getId());
		studentDetails.setName("Jitendra");
		studentDetails.setPassportNumber("J1234567");
//		studentDetails.setESRNumber("ESRNumber-1");
		try{Thread.sleep(70000);}catch(Exception e) {e.printStackTrace();}
		response.setStudentDetails(studentDetails);
		
		return response;
	}

}