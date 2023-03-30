package com.agent.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {
	@Id
	private int agent_id;
	private String agent_name;
	private int agent_salary;
	public int getAgent_id() {
		return agent_id;
	}
	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public int getAgent_salary() {
		return agent_salary;
	}
	public void setAgent_salary(int agent_salary) {
		this.agent_salary = agent_salary;
	}
	public Agent(int agent_id, String agent_name, int agent_salary) {
		super();
		this.agent_id = agent_id;
		this.agent_name = agent_name;
		this.agent_salary = agent_salary;
	}
	public Agent() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
