package com.kh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kh.dto.MemberDTO;
import com.kh.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}

	public List<MemberDTO> selectAllMember() {
		return mapper.selectAllMember();
	}

	public int insertMember(MemberDTO member) {
		return mapper.insertMember(member);
	}

	public int updateMember(MemberDTO member) {
		return mapper.updateMember(member);
	}

	public int deleteMember(String id) {
		return mapper.deleteMember(id);
	}
	
	
}
