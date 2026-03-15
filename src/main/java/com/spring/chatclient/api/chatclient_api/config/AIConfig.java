package com.spring.chatclient.api.chatclient_api.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {

	@Bean
	public ChatClient openAiChatClient(OpenAiChatModel model) {
		return ChatClient.builder(model).build();
	}
	
	
}
