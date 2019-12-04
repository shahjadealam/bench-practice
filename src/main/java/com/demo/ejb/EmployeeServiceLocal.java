package com.demo.ejb;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface EmployeeServiceLocal {

	public Employee createEmployee(String name, String surname, String title, double salary);

	public void removeEmployee(long id);

	public Employee promoteEmployee(long id, String newTitle, double newSalary);

	public Employee findEmployee(long id);

	public Collection<Employee> findAllEmployees();

}