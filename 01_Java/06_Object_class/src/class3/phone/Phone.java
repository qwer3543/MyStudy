package class3.phone;

public class Phone {
	
	// 필드변수
	
	String name;
	String type;
	int hsize;
	int vsize;
	boolean hasLCD;
	
	//==========================================
	//                 생성자(기본)
	
	Phone () {
		name = "노트10+";
		type = "핸드폰";	
	}
	
	//=========================================
	//                 생성자(입력 받아 정의하는)
	
	Phone (String a) {
		name = a;
	}
	
	Phone (String a, String s) {
		name = a;
		type = s;
	}
	
	Phone (String a, String s,boolean d) {
		name = a;
		type = s;
		hasLCD = d;
	}
	
	//============================================
	//                 메서드
	
	// void는 return문이 아닐때 사용한다 
	// 즉 반환 하고싶은 값이 아닐때 사용한다
	void call() {
		System.out.println("전화걸기");
	}
	
	void receiveCall() {
		System.out.println("전화받기");
	}
	
	//  ========메소드(기능, 동작, 함수)=======
	
	// 정보를 받아서 값을 계산하고 출력까지 할수 있다
	// 많은 정보의 값을 동시에 계산할때 사용한다
	void sendSms(String k) {
		System.out.println("[메시지전송]" + k);
	}
	
	// return문은 정보를 받아서 값을 계산하고 정보을 저장한다
	// 정보의 양이 많아 특정 값만을 도출하고 싶을때 이용한다
	String receiveSms(String k) {
		return k;
	}
	
	//==========속성값============
	
	void check() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(hsize);
		System.out.println(vsize);
		System.out.println(hasLCD);
	}
	

}
