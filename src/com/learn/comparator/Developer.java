package com.learn.comparator;

public class Developer {

	private String devName;
	private Double salary;
	private Integer age;
	
	public Developer(String devName, Double salary, Integer age) {
		this.devName = devName;
		this.salary = salary;
		this.age = age;
	}
	
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Developer  [Name =" + this.getDevName() + ", Salary = " + this.getSalary() + ", Age = " + this.getAge() +" ]";
	}
	
	
}
