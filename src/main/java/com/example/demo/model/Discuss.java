package com.example.demo.model;

public class Discuss {
	String username;
	String content;
	String data;
	int favour;
	
	@Override
	public String toString() {
		return "Discuss [username=" + username + ", content=" + content + ", data=" + data + ", favour=" + favour + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getFavour() {
		return favour;
	}
	public void setFavour(int favour) {
		this.favour = favour;
	}
}
