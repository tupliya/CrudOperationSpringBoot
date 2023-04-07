package com.course.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "tid")
	@JsonIgnoreProperties("course")
	Teachers teachers;
	
	public Teachers getTeachers() {
		return teachers;
	}
	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Course() {
		//super();
		// TODO Auto-generated constructor stub
	}
	

}
