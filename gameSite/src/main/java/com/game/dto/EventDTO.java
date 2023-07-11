package com.game.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EventDTO {
	
	private Long id;
	
	private LocalDateTime regDate;
	
	private LocalDateTime modDate;
	
	private String title;
	
	private String content;
	
	private String image;
	
	private Long viewCount;
}
