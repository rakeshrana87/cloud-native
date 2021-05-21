package demo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.repository.EmployeRepository;


@RestController
@RequestMapping(value = "/api/v2/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	private final EmployeRepository employeeRepository;
	
	@Autowired
	private  demo.model.Employee employee;
	
	public EmployeeController(final EmployeRepository petRepository) {
		super();
		this.employeeRepository = petRepository;
	}

	@PostMapping
	public void create(@RequestBody demo.repository.EmployeePojo employeePojo) {
		LOGGER.info("Crete method called with data : {}", employeePojo);
		
		employee.setFirstName(employeePojo.getFirstName());
		employee.setLastName(employeePojo.getLastName());;
		employee.setName(employeePojo.getUserId());
		employee.setSex(employeePojo.getSex());
		employee.setDept(employeePojo.getDept());
		employee.setCompany(employeePojo.getCompany());

		LOGGER.info("Crete method called with data : {}", employeePojo);
		employeeRepository.save(employee);
	}

	@GetMapping
	
	public List<demo.model.Employee> view() {
		LOGGER.info("View method called");
		
		return employeeRepository.findAll();
	}

}
