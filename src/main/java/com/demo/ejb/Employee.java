package com.demo.ejb;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	private String title;
	private Double salary;
	private Date created;

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getSurname() {

		return surname;
	}

	public void setSurname(String surname) {

		this.surname = surname;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public Double getSalary() {

		return salary;
	}

	public void setSalary(Double salary) {

		this.salary = salary;
	}

	public Date getCreated() {

		return created;
	}

	public void setCreated(Date created) {

		this.created = created;
	}

	@Override
	public String toString() {

		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname

				+ ", title=" + title + ", salary=" + salary + ", created=" + created + "]";
	}

}