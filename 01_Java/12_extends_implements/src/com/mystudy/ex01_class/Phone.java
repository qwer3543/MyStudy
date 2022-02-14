package com.mystudy.ex01_class;





class Phone {
	
	// 필드(속성)============
	
	private String type; // 전화기 형태
	private String phoneNo; // 전화번호
	
	
	
	
	
	// 생성자===============
	
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}
	
	
	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}

	
	// 메소드===============

	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	
	// 전화 걸기 기능
	public void call() {
		System.out.println(">> 전화 걸기");
	}
		
	// 전화 받기 기능
	public void receivecall() {
		System.out.println(">> 전화 받기");
	}
		
	// 전화 정보 보기 기능
		
	public void view() {
		System.out.println("타입: " + type + ", 전화번호: " + phoneNo);
	}
		
	
	
	
	
	
	
	
	
}
