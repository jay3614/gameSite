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
public class VideoDTO {
	
	private Long id;
	
	private String title;
	
	private String content;
	
	private String youtubeLink;
	
	private int favorate;
	
	private long viewCount;
	
	private String writer;
	
	private LocalDateTime regDate;
	
	private LocalDateTime modDate;
	
}
