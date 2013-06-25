package com.naironics.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_INFO")
public class Account {
	
	private int accountBalance;
	
	private CompoundKey compoundKey;
	
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Id	
	public CompoundKey getCompoundKey() {
		return compoundKey;
	}
	public void setCompoundKey(CompoundKey compoundKey) {
		this.compoundKey = compoundKey;
	}
	
	

}
