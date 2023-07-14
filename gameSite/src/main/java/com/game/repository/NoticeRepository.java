package com.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.entity.NoticeEntity;

public interface NoticeRepository extends JpaRepository<NoticeEntity, Long> {
	
	// 공지사항 전체항목 리턴
	@Query(value = "SELECT * FROM Notice_entity", nativeQuery = true)
	List<NoticeEntity> getAllList();
	
	//
	@Query(value = "SELECT * FROM Notice_entity WHERE types = '업데이트' ORDER BY reg_date DESC LIMIT 1", nativeQuery = true)
	List<NoticeEntity> getUpdateList();
	
	// 공지사항 최신순 첫번째 항목 제목 및 내용 리턴
	@Query(value = "SELECT * FROM Notice_entity WHERE types = '공지' ORDER BY reg_date DESC LIMIT 1", nativeQuery = true)
	List<NoticeEntity> getListByFirst();
	
	
	// 공지사항 최신순 2~6번째 항목 제목 리턴
	@Query(value = "SELECT * FROM Notice_entity WHERE types = '공지' ORDER BY reg_date DESC LIMIT 1, 5", nativeQuery = true)
	List<NoticeEntity> getListAfterSec();
	
}
