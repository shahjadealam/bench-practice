package com.demo.mycollection;

public class Employee { //implements Comparable<Employee> {

	private String name;
	private Integer age;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		return this.getCity().compareTo(o.getCity());
//	}

}
