package com.bala.student.model;

import javax.persistence.Entity;

@Entity
public class Exam extends BaseModel {
	private String examName;
	private Year yearId;
	private Departnment departnment;
	private Semester semester;
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public Year getYearId() {
		return yearId;
	}
	public void setYearId(Year yearId) {
		this.yearId = yearId;
	}
	public Departnment getDepartnment() {
		return departnment;
	}
	public void setDepartnment(Departnment departnment) {
		this.departnment = departnment;
	}
	public Semester getSemester() {
		return semester;
	}
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	
	
}
