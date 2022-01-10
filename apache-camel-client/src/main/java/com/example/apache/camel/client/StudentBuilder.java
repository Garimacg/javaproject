package com.example.apache.camel.client;

import com.garima.students.GetStudentDetailsRequest;

public class StudentBuilder {

	public GetStudentDetailsRequest getStudent(int id) {

		GetStudentDetailsRequest stud = new GetStudentDetailsRequest();

		stud.setId(id);
		return stud;
	}
}
