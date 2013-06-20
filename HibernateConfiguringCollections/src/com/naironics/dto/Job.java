package com.naironics.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Job {

	@Column(name = "JOB_TITLE")
	private String jobTitle;
	@Column(name = "JOB_COMPANY")
	private String jobCompany;
	@Column(name = "JOB_SALARY")
	private double jobSalary;
	@Column(name = "JOB_LOCATION")
	private String jobLocation;

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobCompany() {
		return jobCompany;
	}

	public void setJobCompany(String jobCompany) {
		this.jobCompany = jobCompany;
	}

	public double getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(double jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

}
