package com.spring.chatclient.api.chatclient_api.model;


public class Tutorial {

	private String author;
	private String title;
	private String description;
	private String createdOn;
	

	public Tutorial() {
		
	}
	
	public Tutorial(String author, String description, String createdOn, String title) {
//		super();
		this.author = author;
		this.description = description;
		this.createdOn = createdOn;
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
}
