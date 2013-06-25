package com.naironics.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* Create a POJO and annotate with @XmlRootElement @XmlAccessorType and annotate 
 * all fields with @XmlElement. This will bind Object properties to XML elements

 */

@XmlRootElement(name = "booking")
@XmlAccessorType(XmlAccessType.FIELD)
public class Booking {

	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "contact")
	private String contact;
	@XmlElement(name = "start-date")
	private Date startDate;
	@XmlElement(name = "end-date")
	private Date endDate;
	@XmlElement(name = "address")
	private String address;

	public Booking() {

	}

	public Booking(String name, String contact, Date startDate, Date endDate,
			String address) {
		this.name = name;
		this.contact = contact;
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Booking [name=" + name + ", contact=" + contact
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
