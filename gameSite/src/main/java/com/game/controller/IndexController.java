package com.game.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.game.dto.EventDTO;
import com.game.service.EventService;
import com.game.service.NoticeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IndexController {
	
	private final EventService eventService;
	private final NoticeService noticeService;
	
	@GetMapping({"/","/index"})
	public void goIndex(Model model) {
		
		List<EventDTO> eventList = eventService.getAllList();
		
		model.addAttribute("eventList", eventList);
		
		
	}
	
	
}
