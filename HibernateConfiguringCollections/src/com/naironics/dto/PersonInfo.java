package com.naironics.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
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

	@ElementCollection
	@JoinTable(name = "PERSON_JOB", joinColumns = @JoinColumn(name = "PERSON_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name = "JOB_ID") }, generator = "hilo-gen", type = @Type(type = "long"))
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
