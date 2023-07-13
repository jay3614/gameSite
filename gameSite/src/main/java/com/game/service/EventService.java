package com.game.service;

import java.util.List;

import com.game.dto.EventDTO;
import com.game.entity.EventEntity;

public interface EventService {
	
	default EventEntity dtoToEntity(EventDTO dto) {
		
		EventEntity notice = EventEntity.builder()
				.id(dto.getId()).title(dto.getTitle())
				.content(dto.getContent()).viewCount(dto.getViewCount())
				.image(dto.getImage()).build();
		return notice;
	}
	
	default EventDTO entityToDto(EventEntity entity) {
		
		EventDTO noticeDTO = EventDTO.builder()
				.id(entity.getId()).title(entity.getTitle())
				.content(entity.getContent()).viewCount(entity.getViewCount())
				.image(entity.getImage()).build();
		
		return noticeDTO;
	}
	
	// 공지사항 목록 전체 리턴
	List<EventDTO> getAllList();
	
	// id번호에 따른 공지사항 세부내용 리턴
	EventDTO read(Long id);
	
	// 공지사항 작성
	Long write(EventDTO dto);
	
	// 공지사항 수정
	Long modify(EventDTO dto);
	
	// 공지사항 삭제
	void remove(Long id);
	
}
