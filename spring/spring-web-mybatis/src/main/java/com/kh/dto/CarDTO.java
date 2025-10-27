package com.kh.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("car")
@Data
public class CarDTO {
	private String id;
	private String cname;
	private int myear;
	private int price;
	private String mno;
	
}
