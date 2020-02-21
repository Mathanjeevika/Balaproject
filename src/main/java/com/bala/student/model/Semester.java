package com.bala.student.model;

import javax.persistence.Entity;

@Entity
public class Semester extends BaseModel {
	private String semesterName;
	private String semesterCode;
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	
	

}
