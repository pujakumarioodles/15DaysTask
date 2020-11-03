package com.example.demo.model;

public class User {
	
	private int id;
	private String name;
	private String emailid;
	private String password;
	private int salary;
	
	
	public User(int id, String name, String emailid, String password, int salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.salary = salary;
		this.role = role;
	}
	private String role;
	
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password + ", salary="
				+ salary + ", role=" + role + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
