package com.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.entity.NoticeEntity;

public interface NoticeRepository extends JpaRepository<NoticeEntity, Long> {
	
	@Query(value = "SELECT * FROM Notice_entity", nativeQuery = true)
	List<NoticeEntity> getAllList();
	
}
