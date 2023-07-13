package com.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.entity.EventEntity;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
	
	@Query(value = "SELECT * FROM Event_entity", nativeQuery = true)
	List<EventEntity> getAllList();
	
}
