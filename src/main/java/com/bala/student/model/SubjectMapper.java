package com.bala.student.model;

import javax.persistence.Entity;

@Entity
public class SubjectMapper extends BaseModel {

	private Exam exam;
	private Subject subject;

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
