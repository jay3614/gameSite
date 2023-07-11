package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.entity.EventEntity;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
	
	
	
}
