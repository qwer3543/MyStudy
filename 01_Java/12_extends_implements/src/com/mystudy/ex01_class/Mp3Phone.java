package com.mystudy.ex01_class;

class Mp3Phone {
	
	private String type;
	private String phoneNo;
	
	public Mp3Phone(String phoneNo) {
		type = "Mp3Phone 타입";
		this.phoneNo = phoneNo;
	}
	
	public Mp3Phone(String type,String phoneNo) {
		type = "Mp3Phone 타입";
		this.phoneNo = phoneNo;
	}

	
	
	
	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void call() {
		System.out.println("전화 걸기");
	}
	
	public void receivecall() {
		System.out.println("전화 받기");
	}
	
	public void view() {
		System.out.println("타입: " + type + ", 전화번호: " + phoneNo);
	}
	
	public void playMusic() {
		System.out.println("음악 플레이");
	}

	@Override
	public String toString() {
		return "Mp3Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
