package com.naironics.dto;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class School {

	private int schoolId;
	private String schoolName;
	
	@Embedded
	private SchoolDetail details;
	
	@Id
	@GeneratedValue
	public int getSchoolId() {
		return schoolId;
	}

	public SchoolDetail getDetails() {
		return details;
	}

	public void setDetails(SchoolDetail details) {
		this.details = details;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
