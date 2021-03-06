package edu.class2.car;

public class CarMain {

	public static void main(String[] args) {
		
		// Car 클래스를 이용해서 Car 타입의 객체(인스턴스)생성
		Car car1 = new Car();
		
		System.out.println("자동차 이름: " + car1.name);
		System.out.println("모델명: " + car1.model);
		System.out.println("색상명: " + car1.color);
		System.out.println("차량길이: " + car1.car_lenght);
		System.out.println("차량폭: " + car1.car_width);
		System.out.println("에어백 유무: " + car1.hasAirbag);
		
		System.out.println("======================");
		
		//car1.color = "검정"; // 값을 변경(final 값은 불가능)
		//System.out.println("색상명: " + car1.color);
		
		car1.name = "첫 차";
		System.out.println("자동차 이름: " + car1.name);
		
		car1.hasAirbag = true;
		System.out.println("에어백 유무: " + car1.hasAirbag);
		
		System.out.println("=======================");
		
		car1.run(50);
		car1.stop();
		car1.back();
		
		System.out.println("============ car2 ==========");
		
		//Car car2 = new Car();
		
		Car car2 = new Car("패밀리카", "제네시스", "검정색");
		
		car2.dispInfo();
		
		//car1.dispInfo();
		
		car2.run(80);
		car2.back();
		car2.stop();
		
		
		
	}

}
