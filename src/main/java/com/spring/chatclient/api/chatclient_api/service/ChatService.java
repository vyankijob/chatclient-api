package com.spring.chatclient.api.chatclient_api.service;

import java.util.List;

import com.spring.chatclient.api.chatclient_api.model.Tutorial;

public interface ChatService {

	public List<Tutorial> chat(String query);
}
