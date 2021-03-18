package com.knet.demo.model;

import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.nio.file.Path;
import org.springframework.stereotype.Component;

// that also created by springboot
@Component
@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 4889087778273529265L;

	@Id
	private String userId;

	private String company;
	private String jobTitleName;

	private String dept;

	private String sex;

	private String firstName;

	private String lastName;
	
	public static void main(String[] args) {
	//	 Path fileName = Path.of("/tmp/password");
		
	}

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
		return userId;
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
		this.userId = name;
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
		return "Pet [name=" + userId + ", company=" + company + ", dept=" + dept + ", sex=" + sex + ", birth=" + firstName
				+ ", death=" + lastName + "]";
	}

	public String getJobTitleName() {
		return jobTitleName;
	}

	public void setJobTitleName(String jobTitleName) {
		this.jobTitleName = jobTitleName;
	}

}
