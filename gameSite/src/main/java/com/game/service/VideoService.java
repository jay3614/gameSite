package com.game.service;

import java.util.List;

import com.game.dto.VideoDTO;
import com.game.entity.MemberEntity;
import com.game.entity.VideoEntity;

public interface VideoService {
	
	default VideoEntity dtoToEntity(VideoDTO dto) {
		
		MemberEntity member = MemberEntity.builder().nickname(dto.getWriter()).build();
		
		VideoEntity notice = VideoEntity.builder()
				.id(dto.getId()).title(dto.getTitle())
				.content(dto.getContent()).viewCount(dto.getViewCount())
				.writer(member).youtubeLink(dto.getYoutubeLink())
				.build();
				
		return notice;
	}
	
	default VideoDTO entityToDto(VideoEntity entity) {
		
		VideoDTO noticeDTO = VideoDTO.builder()
				.id(entity.getId()).title(entity.getTitle())
				.regDate(entity.getRegDate()).modDate(entity.getModDate())
				.content(entity.getContent()).viewCount(entity.getViewCount())
				.writer(entity.getWriter().getNickname()).youtubeLink(entity.getYoutubeLink())
				.build();
		
		return noticeDTO;
	}
	
	List<VideoDTO> get4List();
	
	List<VideoDTO> getAllList();
	
	VideoDTO read(Long id);
	
	// 게시글 작성
	Long write(VideoDTO dto);
	
	// 게시글 수정
	Long modify(VideoDTO dto);
	
	// 게시글 삭제
	void remove(Long id);
	
}
