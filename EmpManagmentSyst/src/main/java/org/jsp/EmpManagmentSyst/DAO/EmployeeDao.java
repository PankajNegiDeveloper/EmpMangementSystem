package org.jsp.EmpManagmentSyst.DAO;

import java.util.List;
import java.util.Optional;

import org.jsp.EmpManagmentSyst.Entity.Employee;
import org.jsp.EmpManagmentSyst.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //annotation for EmployeeDao class
public class EmployeeDao {

	@Autowired
	EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> findAll() {
		return repository.findAll();
	}

	public Optional<Employee> findById(int id) {
		return repository.findById(id);
	}

	public Employee save(Employee employee) {
		return repository.save(employee);	
	}
}
