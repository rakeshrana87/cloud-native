package com.knet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knet.demo.model.Employee;

public interface EmployeRepository extends JpaRepository<Employee, String> {

}
