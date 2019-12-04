package com.demo.ejb;

import java.util.Collection;
import java.util.Date;

import javax.annotation.Resource;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class EmployeeService implements EmployeeServiceLocal {

	@PersistenceContext(unitName = "TutorialPU")
	EntityManager entityManager;

	@Resource
	UserTransaction tx;

	public EmployeeService() {
	}

	public Employee createEmployee(String name, String surname, String title, double salary) {

		Employee employee = new Employee();

		employee.setName(name);

		employee.setSurname(surname);

		employee.setTitle(title);

		employee.setSalary(salary);

		employee.setCreated(new Date());

		try {

			try {

				tx.begin();

				entityManager.persist(employee);

			} finally {

				tx.commit();

			}

		} catch (Exception e) {

// handle all the tx.begin()/commit() exceptions

			throw new EJBException(e);

		}

		return employee;
	}

	public void removeEmployee(long id) {

		Employee employee = findEmployee(id);

		if (employee != null) {

			try {

				try {

					tx.begin();

					entityManager.remove(employee);

				} finally {

					tx.commit();

				}

			} catch (Exception e) {

				// handle all the tx.begin()/commit() exceptions

				throw new EJBException(e);

			}

		}
	}

	public Employee promoteEmployee(long id, String newTitle, double newSalary) {

		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {

			employee.setTitle(newTitle);

			employee.setSalary(newSalary);

			try {

				try {

					tx.begin();

					entityManager.merge(employee);

				} finally {

					tx.commit();

				}

			} catch (Exception e) {

				// handle all the tx.begin()/commit() exceptions

				throw new EJBException(e);

			}

		}

		return employee;
	}

	public Employee findEmployee(long id) {

		return entityManager.find(Employee.class, id);
	}

	public Collection<Employee> findAllEmployees() {

		Query query = entityManager.createQuery("SELECT e FROM Employee e");

		return (Collection<Employee>) query.getResultList();
	}

}