package com.bala.student.model;

import javax.persistence.Entity;

@Entity
public class Year extends BaseModel {
	private String yearValue;

	public String getYearValue() {
		return yearValue;
	}

	public void setYearValue(String yearValue) {
		this.yearValue = yearValue;
	}
	
}
