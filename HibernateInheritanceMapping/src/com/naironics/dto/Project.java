package com.naironics.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)   // The default and Worst Strategy among three 
@Inheritance(strategy=InheritanceType.JOINED)        // Best strategy among three , no data is repeated in tables
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) // Second best strategy, but data is repeated in tables
public class Project {

	private int projectId;
	private String projectName;

	@Id
	@GeneratedValue
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
