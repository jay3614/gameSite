package com.game.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.game.dto.EventDTO;
import com.game.repository.EventRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
	
	private final EventRepository eventRepository;
	
	@Override
	public List<EventDTO> getAllList() {
		
		List<EventDTO> result = eventRepository.getAllList().stream().map(event -> entityToDto(event)).collect(Collectors.toList());
		
		return result;
	}

	@Override
	public EventDTO read(Long id) {
		
		
		
		return null;
	}

	@Override
	public Long write(EventDTO dto) {
		
		
		
		return null;
	}

	@Override
	public Long modify(EventDTO dto) {
		
		
		
		return null;
	}

	@Override
	public void remove(Long id) {
		
		
		
	}
	
}
