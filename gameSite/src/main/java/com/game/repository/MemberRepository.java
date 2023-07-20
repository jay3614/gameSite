package com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
	
	
	
}
