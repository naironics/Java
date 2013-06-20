package com.naironics.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "PERSON_INFO")
public class PersonInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	private String personName;

	@ElementCollection(fetch=FetchType.EAGER)   // Eager Loading - returns 3
	//@ElementCollection     // Lazy Loading - returns 0
	@JoinTable(name = "PERSON_JOB", joinColumns = @JoinColumn(name = "PERSON_ID"))
	private Collection<Job> listOfJobs = new ArrayList<Job>();

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Collection<Job> getListOfJobs() {
		return listOfJobs;
	}

	public void setListOfJobs(Collection<Job> listOfJobs) {
		this.listOfJobs = listOfJobs;
	}

}
