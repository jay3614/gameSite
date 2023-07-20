package com.game.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.game.dto.EventDTO;
import com.game.dto.NoticeDTO;
import com.game.dto.VideoDTO;
import com.game.service.EventService;
import com.game.service.NoticeService;
import com.game.service.VideoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IndexController {
	
	private final EventService eventService;
	private final NoticeService noticeService;
	private final VideoService videoService;
	
	@GetMapping({"/","/index"})
	public void goIndex(Model model) {
		
		List<EventDTO> eventList = eventService.getAllList();
		List<NoticeDTO> updateList = noticeService.updateList();
		List<NoticeDTO> noticeFirst = noticeService.listFirst();
		List<NoticeDTO> noticeAfterSec = noticeService.listAfterSec();
		List<VideoDTO> videoList = videoService.getAllList();
		
		model.addAttribute("eventList", eventList);
		model.addAttribute("updateList", updateList);
		model.addAttribute("noticeFirst", noticeFirst);
		model.addAttribute("noticeAfterSec", noticeAfterSec);
		model.addAttribute("videoList", videoList);
		
		
	}
	
	
}
