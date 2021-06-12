package com.app.entity;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private String city;
	
	
	public Employee() {
		super();
	}


	public Employee(int empId, String name, double salary, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
