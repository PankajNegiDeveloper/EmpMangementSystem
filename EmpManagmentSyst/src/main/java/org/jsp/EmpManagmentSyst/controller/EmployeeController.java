package org.jsp.EmpManagmentSyst.controller;

import java.util.List;
import org.jsp.EmpManagmentSyst.Entity.Employee;
import org.jsp.EmpManagmentSyst.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/employees") 
	public Employee saveEmployee(@RequestBody Employee employee) {

//		repository.save(employee);
		return service.saveEmployee(employee);
	}

	@GetMapping("/findemployees") 
	
	public List<Employee> findAllEmployee() {
		List<Employee> el = service.findAll();
		return el;
	}
	
	@GetMapping("/findemployees/{id}")
	public Employee findEmployeesById(@PathVariable int id) {
		 return service.findById(id);
	}
	
	@PutMapping("/updateemployees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.save(employee);
	}
}
