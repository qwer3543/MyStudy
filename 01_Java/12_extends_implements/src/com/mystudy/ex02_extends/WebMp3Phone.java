package com.mystudy.ex02_extends;

public class WebMp3Phone extends Mp3Phone{

	
	public WebMp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
		
	}

	public WebMp3Phone(String phoneNo) {
		super("WebMp3Phone",phoneNo);
		
	}
	
	public void webSearch() {
		System.out.println(">>WebPhone - 웹 검색");
	}
	
	
}
