package com.knet.demo.repository;


import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class EmployeePojo implements Serializable {

	private String userId;
		private String company;

		private String dept;

		private String sex;

		private String firstName;

		private String lastName;
		private String jobTitleName;


		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getUserId() {
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
			return "Employee [name=" + userId + ", company=" + company + ", dept=" + dept + ", sex=" + sex + ", birth=" + firstName
					+ ", death=" + lastName + "]";
		}

		public String getJobTitleName() {
			return jobTitleName;
		}

		public void setJobTitleName(String jobTitleName) {
			this.jobTitleName = jobTitleName;
		}

	}



