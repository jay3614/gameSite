package com.game.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.game.dto.NoticeDTO;
import com.game.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService {
	
	private final NoticeRepository noticeRepository;
	
	@Override
	public List<NoticeDTO> getAllList() {
		
		List<NoticeDTO> result = noticeRepository.getAllList().stream().map(notice -> entityToDto(notice)).collect(Collectors.toList());
		
		return result;
	}

	@Override
	public NoticeDTO read(Long id) {
		
		
		
		return null;
	}

	@Override
	public Long write(NoticeDTO dto) {
		
		
		
		return null;
	}

	@Override
	public Long modify(NoticeDTO dto) {
		
		
		
		return null;
	}

	@Override
	public void remove(Long id) {
		
		
		
	}
	
	
	
	
}
