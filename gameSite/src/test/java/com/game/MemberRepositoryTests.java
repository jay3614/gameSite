package com.game;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.game.entity.MemberEntity;
import com.game.repository.MemberRepository;



@SpringBootTest
public class MemberRepositoryTests {

	@Autowired
	private MemberRepository memberRepository;
	
	// 스트림 이용해서 Member 테이블에 100개의 데이터를 한 번에 insert
	@Test
	public void insertDummies() {
		
		MemberEntity member = MemberEntity.builder()
				.id("wjdduddn12@gmail.com").password("1234")
				.name("정영우").nickname("망냥냥")
				.phoneNumber("010-1234-1234").ssn("960202-1******")
				.gender("남성").cash(0)
				.build();
		
		memberRepository.save(member);
	}
	
	
	
	
	
	
	
	
}
