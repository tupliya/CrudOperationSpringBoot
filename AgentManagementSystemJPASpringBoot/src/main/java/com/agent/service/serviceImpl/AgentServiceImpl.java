package com.agent.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agent.entity.Agent;
import com.agent.repository.AgentRepository;
import com.agent.service.AgentService;
@Repository
public class AgentServiceImpl implements AgentService {
	
	@Autowired
	AgentRepository agentRepository;

	@Override
	public Agent createAgent(Agent agent) {
		// TODO Auto-generated method stub
		return agentRepository.save(agent);
	}

	@Override
	public List<Agent> getAllAgent() {
		// TODO Auto-generated method stub
		return agentRepository.findAll();
	}

	@Override
	public void deleteAgent(int agent_id) {
		agentRepository.deleteById(agent_id);
		
	}

	@Override
	public Agent updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		Agent _agent=agentRepository.findById(agent.getAgent_id()).get();
		_agent.setAgent_id(agent.getAgent_id());
		_agent.setAgent_name(agent.getAgent_name());
		_agent.setAgent_salary(agent.getAgent_salary());
		agentRepository.save(_agent);
		return _agent;
	}

	@Override
	public Agent findAgentById(int agent_id) {
		// TODO Auto-generated method stub
		return agentRepository.findById(agent_id).get();
	}

}
