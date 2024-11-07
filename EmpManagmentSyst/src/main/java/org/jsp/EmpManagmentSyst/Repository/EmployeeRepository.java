package org.jsp.EmpManagmentSyst.Repository;

import org.jsp.EmpManagmentSyst.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
