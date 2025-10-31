package com.kh.service;

import org.springframework.stereotype.Service;

import com.kh.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
