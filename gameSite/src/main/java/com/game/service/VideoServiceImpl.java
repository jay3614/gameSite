package com.game.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.game.dto.VideoDTO;
import com.game.entity.MemberEntity;
import com.game.entity.VideoEntity;
import com.game.repository.NoticeRepository;
import com.game.repository.VideoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {

	private final VideoRepository videoRepository;
	
	@Override
	public List<VideoDTO> get4List() {
		
		
		
		return null;
	}

	@Override
	public List<VideoDTO> getAllList() {
		
		List<VideoDTO> result = videoRepository.getAllList().stream()
				.map(en -> entityToDto(en)).collect(Collectors.toList());;
		
		return result;
	}

	@Override
	public VideoDTO read(Long id) {
		
		
		
		return null;
	}

	@Override
	public Long write(VideoDTO dto) {
		
		
		
		return null;
	}

	@Override
	public Long modify(VideoDTO dto) {
		
		
		
		return null;
	}

	@Override
	public void remove(Long id) {
		
		
		
		
	}
	
	
}
