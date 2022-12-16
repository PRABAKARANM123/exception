package com.example.demo.entiry;

public class Employee {
    private Integer id;	
	private String name;	
	private Integer age;
	private String location;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer id, String name, Integer age, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
