package com.game;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.game.entity.MemberEntity;
import com.game.entity.VideoEntity;
import com.game.repository.MemberRepository;
import com.game.repository.VideoRepository;

@SpringBootTest
public class VideoRepositoryTests {
	
	@Autowired
	private VideoRepository videoRepository;
	private MemberRepository memberRepository;
	
	// 스트림 이용해서 Member 테이블에 100개의 데이터를 한 번에 insert
	@Test
	public void insertDummies() {
		
		MemberEntity member = MemberEntity.builder().id("wjdduddn12@gmail.com").nickname("망냥냥").build();
		
		VideoEntity video = VideoEntity.builder()
				.title("최고의 플레이 영상").content("제 인생 컨트롤 보고 가세요.")
				.youtubeLink("https://youtu.be/RDomi8zePtc").favorate(0)
				.viewCount(0).writer(member)
				.build();
		
		videoRepository.save(video);
	}
	
	
}
