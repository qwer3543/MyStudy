package com.mystudy.ex05_interface;

// 상수화시킨 변수: publoc static final 변수
// 추상 메소드: public abstract 메소드
//---------------------------------------
// 자바8 에서 추가된 요소
// public default 메소드: public default 메소드() {}
// public static 메소드: public static 메소드() {}
public interface I_Phone {

	//public static final boolean SUCCESS_CALL = true;
	boolean SUCCESS_CALL = true; // 위와 같은 뜻
	
	// 인터페이스 선언 메소드는 기본적으로 public abstract 메소드 이다
	// 아래 명령어들은 전부다 public abstract 이 작성 되어 있다
	public abstract void view();
	abstract void call();
	public void receiveCall();
	void sendSMS();
	void receiveSMS();
	
	
	// public default 메소드 [선택적 공유 기능]
	default void changeNo(String phoneNo) {
		// 구현이 필요없다면 구현 생량가능, 공통적으로 사용하는 기능이 있다면 구현해도 됨
	}
	
	
	// public static 메소드
	static void staticMethod() {
		System.out.println("I_Phone 인터페이스의 static 메소드");
	}
	
}
