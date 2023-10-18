package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projectdata")
public class ProjectModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long proj_id;
	
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
	
	@Column(name = "team")
	private String team;
	
	
	public ProjectModel(String name, String description, String enddate, String status, String startdate, String progress, String team) {
		super();
		this.name = name;
		this.description = description;
		this.enddate = enddate;
		this.status=status;
		this.progress = progress;
		this.team = team;
		this.startdate = startdate;
		
	}

	
	public long getProj_id() {
		return proj_id;
	}


	public void setProj_id(long proj_id) {
		this.proj_id = proj_id;
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


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}

}


