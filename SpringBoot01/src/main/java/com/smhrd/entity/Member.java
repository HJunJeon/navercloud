package com.smhrd.entity;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor // 기본 생성
@RequiredArgsConstructor
@AllArgsConstructor // 모든 필드를 초기화하는 생성자
@Data
public class Member {
	
	// DTO (Data Transfer Object) 
	// 계층간 데이터 전송을 위해 사용되는 객체
	// 여러 데이터를 담을 바구니
	@NonNull
	private String email;
	
	private String pw;
	
	private String tel;
	
	private String address;

	

}
