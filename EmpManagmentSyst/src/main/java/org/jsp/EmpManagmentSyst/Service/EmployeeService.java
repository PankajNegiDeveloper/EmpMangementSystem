package org.jsp.EmpManagmentSyst.Service;

import java.util.List;
import java.util.Optional;

import org.jsp.EmpManagmentSyst.DAO.EmployeeDao;
import org.jsp.EmpManagmentSyst.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // This annotation is used for service class
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}

	public List<Employee> findAll() {
		return dao.findAll();
	}

	public Employee findById(int id) {
		Optional<Employee> optional = dao.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public Employee save(Employee employee) {
		return dao.saveEmployee(employee);
	}
	
	
}
