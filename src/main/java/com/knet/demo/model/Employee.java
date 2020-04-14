package com.knet.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

// that also created by springboot
@Component
@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 4889087778273529265L;

	@Id
	private String employeeId;

	private String company;

	private String dept;

	private String sex;

	private String firstName;

	private String lastName;

	public Employee() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getCompany() {
		return company;
	}

	public String getSex() {
		return sex;
	}

	public String getDept() {
		return dept;
	}

	public void setFirstName(String birth) {
		this.firstName = birth;
	}

	public void setLastName(String death) {
		this.lastName = death;
	}

	public void setName(String name) {
		this.employeeId = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Pet [name=" + employeeId + ", company=" + company + ", dept=" + dept + ", sex=" + sex + ", birth=" + firstName
				+ ", death=" + lastName + "]";
	}

}
