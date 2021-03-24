package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Employee;


public interface EmployeRepository extends JpaRepository<Employee, String> {

}
