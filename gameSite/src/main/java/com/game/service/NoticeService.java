package com.game.service;

import java.util.List;

import com.game.dto.NoticeDTO;
import com.game.entity.NoticeEntity;

public interface NoticeService {
	
	default NoticeEntity dtoToEntity(NoticeDTO dto) {
		
		NoticeEntity notice = NoticeEntity.builder()
				.id(dto.getId()).title(dto.getTitle())
				.content(dto.getContent()).viewCount(dto.getViewCount())
				.types(dto.getTypes()).build();
		return notice;
	}
	
	default NoticeDTO entityToDto(NoticeEntity entity) {
		
		NoticeDTO noticeDTO = NoticeDTO.builder()
				.id(entity.getId()).title(entity.getTitle())
				.regDate(entity.getRegDate()).modDate(entity.getModDate())
				.content(entity.getContent()).viewCount(entity.getViewCount())
				.types(entity.getTypes()).build();
		
		return noticeDTO;
	}
	
	// 공지사항 목록 전체 리턴
	List<NoticeDTO> getAllList();
	
	// 공지사항 중 업데이트 항목의 최신순 리턴
	List<NoticeDTO> updateList();
	
	// 공지사항 최신순 첫 번째 항목 제목 리턴
	List<NoticeDTO> listFirst();
	
	// 공지사항 최신순 두번재 항목 이후 제목 5개 리턴
	List<NoticeDTO> listAfterSec();
	
	// id번호에 따른 공지사항 세부내용 리턴
	NoticeDTO read(Long id);
	
	// 공지사항 작성
	Long write(NoticeDTO dto);
	
	// 공지사항 수정
	Long modify(NoticeDTO dto);
	
	// 공지사항 삭제
	void remove(Long id);
	
}
