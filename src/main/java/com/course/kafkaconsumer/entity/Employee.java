package com.course.kafkaconsumer.entity;


public class Employee {

	private String employeeId;
	private String name;
	private int age;

	public Employee(String employeeId, String name, int age) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
	}

	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

}
