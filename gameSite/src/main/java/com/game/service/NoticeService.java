package com.game.service;

import java.util.List;

import com.game.dto.NoticeDTO;
import com.game.entity.NoticeEntity;

public interface NoticeService {
	
	default NoticeEntity dtoToEntity(NoticeDTO dto) {
		
		NoticeEntity notice = NoticeEntity.builder()
				.id(dto.getId()).title(dto.getTitle())
				.content(dto.getContent()).viewCount(dto.getViewCount())
				.build();
		return notice;
	}
	
	default NoticeDTO entityToDto(NoticeEntity entity) {
		
		NoticeDTO noticeDTO = NoticeDTO.builder()
				.id(entity.getId()).title(entity.getTitle())
				.content(entity.getContent()).viewCount(entity.getViewCount())
				.build();
		
		return noticeDTO;
	}
	
	// 공지사항 목록 전체 리턴
	List<NoticeDTO> getAllList();
	
	// id번호에 따른 공지사항 세부내용 리턴
	NoticeDTO read(Long id);
	
	// 공지사항 작성
	Long write(NoticeDTO dto);
	
	// 공지사항 수정
	Long modify(NoticeDTO dto);
	
	// 공지사항 삭제
	void remove(Long id);
	
}
