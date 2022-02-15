package com.mtstudy.poly1.extrnds;

public class CarTest {

	public static void main(String[] args) {


		System.out.println("=== Car 클래스 ===");
		
		Car car = new Car();
		car.type = "자동차.Car";
		System.out.println(car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance 클래스 ===");
		
		Ambulance am = new Ambulance();
		am.type = "구급차.Ambulance";
		System.out.println(am.type);
		am.drive();
		am.stop();
		
		am.siren();
		
		System.out.println("=== FireEngine ===");
		
		FireEngine fe = new FireEngine();
		fe.type = "소방차.FireEngine";
		System.out.println(fe.type);
		fe.drive(); 
		fe.stop();
		
		fe.siren();
		fe.water();
		
		System.out.println("======================");
		
		Car carTemp = car; // Car <- Car
		carTemp = am; // Car <- Ambulance
		carTemp = fe; // Car <- FireEngine
		
		// instanceof : 타입 확인 가능
		System.out.println("자동차 타입 : " +carTemp.type);
		if (carTemp instanceof Object) {
			System.out.println(">>=== Object 타입이다");
		}
		
		if (carTemp instanceof Car) {
			System.out.println(">>=== Car 타입이다");
			carTemp.drive(); 
			carTemp.stop();
		}
		
		if (carTemp instanceof Ambulance) {
			System.out.println(">>=== Ambulance 타입이다");
			carTemp.drive(); 
			carTemp.stop();
			((Ambulance) carTemp).siren(); // 자동 형변환
		}
		
		if (carTemp instanceof FireEngine) {
			System.out.println(">>=== FireEngine 타입이다");
			carTemp.drive(); 
			carTemp.stop();
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
		
		System.out.println("=== Car 타입 객체 전달시 (타입체크) ===");
		typeCheck(car); // Car
		
		System.out.println("=== Ambulance 타입 객체 전달시 (타입체크) ===");
		typeCheck(am); // Ambulance
		
		System.out.println("=== FireEngine 타입 객체 전달시 (타입체크) ===");
		typeCheck(fe); // FireEngine
		
		
		System.out.println(">> the end <<");
	}
	
	static void typeCheck(Car carTemp) {
		System.out.println("=== Car 타입 입니다");
		carTemp.drive(); 
		carTemp.stop();
		
		// instanceof : 객체의 타입 확인
		if (carTemp instanceof Ambulance) {
			System.out.println(">>=== Ambulance 타입입니다");
			((Ambulance) carTemp).siren();
		}
		
		if (carTemp instanceof FireEngine) {
			System.out.println(">>=== FireEngine 타입입니다");
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
	}
	
	
	
	
	
	
	

}
