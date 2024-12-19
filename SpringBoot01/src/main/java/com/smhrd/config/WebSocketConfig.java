package com.smhrd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import lombok.RequiredArgsConstructor;

@EnableWebSocket // WebSocket 사용 시작할 것이다 
@RequiredArgsConstructor
@Configuration
public class WebSocketConfig implements WebSocketConfigurer {
	
	private final WebSocketHandler handler;

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		
		// ws://localhost:8088/chat
		registry.addHandler(handler, "/chat/{room}")
				.setAllowedOrigins("*");
				// 외부 서버에서 연결을 허용
				// 리엑트 (Express)에서 스프링으로 넘어갈 때 사용
		
	}
	
	
	
	
	
	
	
	
	

}
