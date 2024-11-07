package org.jsp.EmpManagmentSyst.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {

	@Id
	@GeneratedValue
	
	    private int id;
		private String name;
		private String email;
		private long phone;
		private double salary;
}
