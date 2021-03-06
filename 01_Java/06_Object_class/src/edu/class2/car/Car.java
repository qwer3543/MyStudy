package edu.class2.car;

/*  자동차 클래스
 *  속성(변수): 차량명, 모델명, 차량색상
 *  기능: 가고, 서고, 뒤로가고, 차량정보 확인
 */
public class Car {
	
	// 필드변수(속성)
	
	String name = "마이카"; // 차량명
	String model; // 모델명
	String color; // 차량색상
	
	// final 제한자: 변수의 값이 할당되면 더이상 변경할 수 없음
	// final 붙은 변수: 상수화된 변수
	final int car_lenght = 350; // 차량의 길이
	final int car_width = 200; // 차량의 폭(너비)
	
	boolean hasAirbag; // 에어빽의 존재여부
	
	// 생성자: 리턴타입 없음
	// 1. 클래스이름 () { } - 기본 생성자
	// 2. 클래스이름(매개변수,...) { }
	// 주의: 명시적으로 생성자 선언시 기본생성자 만들어 주지 않음
	Car() { 
		model = "드림카";
		color = "무지개색";
				
	}
	
	Car(String n,String m,String c) {
		name = n;
		model = m;
		color = c;
	}
	
	
	// 메소드(기능, 동작, 함수) 
	void run(int speed) {
		System.out.println(">>> 앞으로 " + speed + "속도로 이동");
	}
	
	void stop() {
		System.out.println(">>> 멈추기");
	}
	
	void back() {
		System.out.println(">>> 뒤로가기");
	}
	
	// 자동차 속성값 확인
	
	void dispInfo() {
		System.out.println("---자동차 정보---");
		
		System.out.println("자동차 이름: " + name);
		System.out.println("모델명: " + model);
		System.out.println("색상명: " + color);
		System.out.println("차량길이: " + car_lenght);
		System.out.println("차량폭: " + car_width);
		System.out.println("에어백 유무: " + hasAirbag);
	}
	
	
	
	
	
}
