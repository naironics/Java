package com.naironics.dto;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

@Entity
@Table(name = "NEW_EMPLOYEE_INFO")
public class Employee {

	private int empId;
	private String empName;
	private String empEmailAddress;
	private String empPassword;
	private boolean isPermanent;
	private Calendar empJoinDate;
	private Date empLoginTime;

	@Id
	@TableGenerator(name = "empid", table = "emppktb", pkColumnName = "empkey", pkColumnValue = "empValue", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "empid")
	@Column(name = "EmployeeId")
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Column(nullable = false)
	public String getEmpEmailAddress() {
		return empEmailAddress;
	}

	public void setEmpEmailAddress(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}

	@Transient
	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public Calendar getEmpJoinDate() {
		return empJoinDate;
	}

	public void setEmpJoinDate(Calendar empJoinDate) {
		this.empJoinDate = empJoinDate;
	}

	public Date getEmpLoginTime() {
		return empLoginTime;
	}

	public void setEmpLoginTime(Date empLoginTime) {
		this.empLoginTime = empLoginTime;
	}

}
