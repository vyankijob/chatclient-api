package com.spring.chatclient.api.chatclient_api.controller;

import java.util.List;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.chatclient.api.chatclient_api.model.Tutorial;
import com.spring.chatclient.api.chatclient_api.service.ChatService;
import com.spring.chatclient.api.chatclient_api.service.ChatServiceImpl;

@RestController
@RequestMapping
public class ChatController {

//	private ChatClient openAiChatClient;
//	
//	public ChatController(ChatClient openAiChatClient) {
//		this.openAiChatClient = openAiChatClient;
//	}
	
	
	private ChatService chatSrevice;
	
	public ChatController(ChatService chatService) {
		this.chatSrevice = chatService;
	}
	
	@GetMapping("/chat")
	public ResponseEntity<List<Tutorial>> chat(@RequestParam(value="q", required = true) String q) {
		
		List<Tutorial> result = chatSrevice.chat(q);
		return ResponseEntity.ok(result);
	}
}
