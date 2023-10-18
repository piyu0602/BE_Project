package com.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "userdata")
//@Data
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "joindate")
	private String joindate;
	
	@Column(name = "skills")
	private String skills;
	
	@Column(name = "tasks")
	private String tasks;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "contact")
	private String contact;

	@Column(name = "password")
	private String password;
	
	@Column(name = "address")
	private String address;
	
	
	public UserModel(String name, String password, String address, String dob, String joindate, String skills, String tasks, String experience, String contact) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.contact=contact;
		this.dob = dob;
		this.experience = experience;
		this.joindate = joindate;
		this.skills = skills;
		this.tasks =tasks;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getJoinDate() {
		return joindate;
	}
	public void setJoinDate(String joindate) {
		this.joindate = joindate;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getTasks() {
		return tasks;
	}
	public void setTasks(String tasks) {
		this.tasks = tasks;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
}
