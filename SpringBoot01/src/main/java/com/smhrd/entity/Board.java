package com.smhrd.entity;

import lombok.Data;

@Data
public class Board {

	private String title;
	
	private String writer;
	
	private String content;
	
	private String img;
	
	private String indate;
	// Date (String 대신) 사용가능
	
	private int count;
	
	private int idx;
	
	
		
}
