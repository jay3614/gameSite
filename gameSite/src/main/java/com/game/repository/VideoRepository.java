package com.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.entity.VideoEntity;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
	
	// 공지사항 전체항목 리턴
	@Query(value = "SELECT * FROM Video_entity ORDER BY reg_date DESC", nativeQuery = true)
	List<VideoEntity> getAllList();
	
}
