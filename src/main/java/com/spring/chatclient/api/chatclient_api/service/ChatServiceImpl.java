package com.spring.chatclient.api.chatclient_api.service;

import java.util.List;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import com.spring.chatclient.api.chatclient_api.model.Tutorial;

@Service
public class ChatServiceImpl implements ChatService {

	private ChatClient openAiChatClient;
	
	public ChatServiceImpl(ChatClient openAiChatClient) {
		this.openAiChatClient = openAiChatClient;
	}
	
	@Override
	public List<Tutorial> chat(String q) {
		String string = "tell me about mars planet";
		return openAiChatClient
				.prompt(q)
				.call()
				.entity(new ParameterizedTypeReference<List<Tutorial>>() {
					
				});
	}
}
