package com.demo.Assignment1;

public class Manager implements Employee{
	
	private String name;
	private int age;
	private float salary;
	private String designation;
	public void raiseSalary() {
		// TODO Auto-generated method stub
		
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Clerk [name=" + App.empName + ", age=" + App.empAge + ", salary=" + this.salary + ", designation=" + this.designation + "]";
	}
}
