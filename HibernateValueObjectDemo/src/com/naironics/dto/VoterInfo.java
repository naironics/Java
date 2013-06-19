package com.naironics.dto;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "VOTER_INFO")
public class VoterInfo {
	@Id
	@GeneratedValue
	private int voterId;
	private String voterName;
	private int voterAge;
	@Embedded
	private Address voterAddress;
	private String voterPhoneNumber;
	private String voterSex;
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public int getVoterAge() {
		return voterAge;
	}
	public void setVoterAge(int voterAge) {
		this.voterAge = voterAge;
	}
	public Address getVoterAddress() {
		return voterAddress;
	}
	public void setVoterAddress(Address voterAddress) {
		this.voterAddress = voterAddress;
	}
	public String getVoterPhoneNumber() {
		return voterPhoneNumber;
	}
	public void setVoterPhoneNumber(String voterPhoneNumber) {
		this.voterPhoneNumber = voterPhoneNumber;
	}
	public String getVoterSex() {
		return voterSex;
	}
	public void setVoterSex(String voterSex) {
		this.voterSex = voterSex;
	}
	
}
