package com.agent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agent.entity.Agent;

@Service
public interface AgentService {
	
	public Agent createAgent(Agent agent);
	public List<Agent> getAllAgent();
	public void deleteAgent(int agent_id);
	public Agent updateAgent(Agent agent);
	public Agent findAgentById(int agent_id);

}
