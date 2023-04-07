package com.course.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Teachers {
	@Id
	private int  tid;
	private String tname;
	@OneToMany(mappedBy = "teachers", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	//@JsonIgnoreProperties("teachers")
	List<Course> course;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Teachers(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Teachers() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	

}
