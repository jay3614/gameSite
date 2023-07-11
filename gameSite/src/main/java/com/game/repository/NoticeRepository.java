package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.entity.NoticeEntity;

public interface NoticeRepository extends JpaRepository<NoticeEntity, Long> {
	
	
	
}
