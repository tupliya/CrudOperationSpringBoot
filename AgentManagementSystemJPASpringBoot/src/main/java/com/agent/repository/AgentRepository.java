package com.agent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agent.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Integer> {

}
