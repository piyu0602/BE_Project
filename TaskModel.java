package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TaskModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long task_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "startdate")
	private String startdate;
	
	@Column(name = "enddate")
	private String enddate;
	
	@Column(name = "status")
	private String status;

	@Column(name = "progress")
	private String progress;
	
	public TaskModel(String name, String description, String enddate, String status, String startdate, String progress, String team) {
		super();
		this.name = name;
		this.description = description;
		this.enddate = enddate;
		this.status=status;
		this.progress = progress;
		this.startdate = startdate;
		
	}
	
	public long getTask_id() {
		return task_id;
	}



	public void setTask_id(long task_id) {
		this.task_id = task_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getStartdate() {
		return startdate;
	}



	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}



	public String getEnddate() {
		return enddate;
	}



	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getProgress() {
		return progress;
	}



	public void setProgress(String progress) {
		this.progress = progress;
	}



	
}
