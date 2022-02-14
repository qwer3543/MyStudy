package com.mystudy.ex02_extends;

// 클래스 상속(extends: 확장) 실습
// 1. Phone 클래스를 학장 하시오
public class WebPhone extends Phone{

	// 2. 생성자 정의: 2개 [phoneNo 전달받는 생성자 / type, phoneNo 전달받는 생성자]
	public WebPhone(String phoneNo) {
		super(phoneNo);
		
	}

	public WebPhone(String type, String phoneNo) {
		super(type, phoneNo);
		
	}
	//------------------------------------------
	
	// 3. 기능 : 전화 걸고, 전화 받고, 전화 정보 보기, 
	//         웹검색 할 수 있는 전화기(webSearch() : ">>WebPhone - 웹 검색" 문구 화면에 출력
	
	public void webSearch() {
		System.out.println(">>WebPhone - 웹 검색");
	}
	//------------------------------------------
	
	
	
	
	
	
	
	
}
