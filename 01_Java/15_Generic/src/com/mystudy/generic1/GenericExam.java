package com.mystudy.generic1;
// 그냥 박스
class Box {
	Object obj; // 필드변수
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
}

// 제너릭 적용된 박스
class BoxG<T>{
	T obj;
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
}


public class GenericExam {

	public static void main(String[] args) {
		// 제네릭(Generic): 컬렉션이 어떤 캑체들로 이루어져있는지 표시하는 객체타입을 의미
		// 형태: <객체자료형>, <>
		// API -> <T>: 객체자료형, <E>: 하나의 요소(즉 객체 하나)
		//          Map 형식: <K, V> K는 key(키), V는 value(값)
		
		Box box = new Box();
		box.setObj("문자열 String");
		box.setObj(100);
		box.setObj(new Integer(999));
		box.setObj(new Box());
		System.out.println(box.getObj());
		
		System.out.println("=== 제너릭 적용된 BoxG 사용 ===");
		int num = 100;
		String str = "홍길동";
		BoxG<String> boxg = new BoxG<String>();
		boxg.setObj("문자열 String");
		boxg.setObj(new String("홍길동"));
		//boxg.setObj(new String(num); // 타입이 맞지 않으면 컴파일 오류
		
		System.out.println(boxg.getObj());
		System.out.println("============");
		
		BoxG<Integer> boxg2 = new BoxG<>();
		boxg2.setObj(1234); // Integer <- int : 자동 형변환
		boxg2.setObj(new Integer(10000));
		
		System.out.println(boxg2.getObj());
		
		
	}

}
