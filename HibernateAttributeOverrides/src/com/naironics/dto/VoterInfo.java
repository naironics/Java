package com.naironics.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "NEW_VOTER_INFO")
public class VoterInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int voterId;
	private String voterName;
	private int voterAge;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="HOME_STREET")),
	@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
	@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
	@AttributeOverride(name="zipcode",column=@Column(name="HOME_ZIP_CODE"))})
	private Address voterHomeAddress;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="OFFICE_STREET")),
	@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
	@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
	@AttributeOverride(name="zipcode",column=@Column(name="OFFICE_ZIP_CODE"))})
	private Address voterOfficeAddress;
	
	//another Address object without attribute overrides
	private Address voterNativeAddress;
	
	public Address getVoterNativeAddress() {
		return voterNativeAddress;
	}
	public void setVoterNativeAddress(Address voterNativeAddress) {
		this.voterNativeAddress = voterNativeAddress;
	}
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
	public Address getVoterHomeAddress() {
		return voterHomeAddress;
	}
	public void setVoterHomeAddress(Address voterHomeAddress) {
		this.voterHomeAddress = voterHomeAddress;
	}
	public Address getVoterOfficeAddress() {
		return voterOfficeAddress;
	}
	public void setVoterOfficeAddress(Address voterOfficeAddress) {
		this.voterOfficeAddress = voterOfficeAddress;
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
