package com.kh.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;

@Alias("member")
@Data
@AllArgsConstructor
public class MemberDTO {
	private String id;
	private String passwd;
	private String userName;
	private String nickName;
	
}











