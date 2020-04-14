package com.knet.demo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knet.demo.repository.EmployeRepository;

@RestController
@RequestMapping(value = "/api/v2/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	private final EmployeRepository petRepository;
	
	@Autowired
	private  com.knet.demo.model.Employee employee;
	
	public EmployeeController(final EmployeRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@PostMapping
	public void create(@RequestBody com.knet.demo.repository.EmployeePojo employeePojo) {
		LOGGER.info("Crete method called with data : {}", employeePojo);
		
		employeePojo.setFirstName(employeePojo.getFirstName());
		employeePojo.setLastName(employeePojo.getLastName());;
		employeePojo.setName(employeePojo.getEmployeeId());;
		employeePojo.setSex(employeePojo.getSex());
		employeePojo.setDept(employeePojo.getDept());
		employeePojo.setCompany(employeePojo.getCompany());

		LOGGER.info("Crete method called with data : {}", employeePojo);
		petRepository.save(employee);
	}

	@GetMapping
	public List<com.knet.demo.model.Employee> view() {
		LOGGER.info("View method called");
		return petRepository.findAll();
	}

}
