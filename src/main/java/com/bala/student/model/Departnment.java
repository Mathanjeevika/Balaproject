package com.bala.student.model;

import javax.persistence.Entity;

@Entity
public class Departnment extends BaseModel {
	private String departnmentName;
	private String departnmentCode;
	private Integer courseDuration;

	public String getDepartnmentName() {
		return departnmentName;
	}

	public void setDepartnmentName(String departnmentName) {
		this.departnmentName = departnmentName;
	}

	public String getDepartnmentCode() {
		return departnmentCode;
	}

	public void setDepartnmentCode(String departnmentCode) {
		this.departnmentCode = departnmentCode;
	}

	public Integer getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}

}
