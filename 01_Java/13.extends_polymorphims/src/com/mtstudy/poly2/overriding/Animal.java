package com.mtstudy.poly2.overriding;


public class Animal {

	String name; // 이름,명칭
	int legCnt; // 다리갯수
	
	void eat() {
		System.out.println(">> 먹는다");
	}
	
	void sleep() {
		System.out.println(">> 잠을 잔다");
	}
	
	
	// 자녀 클래스에 정이가 되어있어야 한다 자녀 클래스 쪽으로 쓸수 있음
	// 메소드 재정시 메소드 선어부를 동일 하게 사용한다
	//  단, 메소드 접근제한자의 범위를 부모와 동일하거나 넓게 정의 할수 있다
	// (접근제한을 좁게 설정할수 없다)
	void sound() {
		System.out.println(">> 울음 없음");
	}
	
	
	
	
	
	
	
}
