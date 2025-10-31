package com.kh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	List<MemberDTO> selectAllMember();
	int insertMember(MemberDTO member);
	int updateMember(MemberDTO member);
	int deleteMember(String id);
}
