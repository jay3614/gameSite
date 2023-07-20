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
public class MemberDTO {
	
	private String id;
	
	private String nickname;
	
	private String password;
	
	private String name;
	
	private String phoneNumber;
	
	private String gender;
	
	private String ssn;
	
	private int cash;
	
}
