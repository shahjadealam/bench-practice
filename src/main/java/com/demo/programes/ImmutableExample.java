package com.demo.programes;

 final class ImmutableExample {
public static void main(String[] args) {
	Student student = new Student("Shahjade", 101);
	System.out.println(student.getName());
	
	
	Student student2 = new Student("Himanshu", 101);
	System.out.println(student2.getName());
}
	
}

 final class Student
{
	 final String name;
	 final int id;

	
	public String getName() {
		return name;
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}
		
	}

