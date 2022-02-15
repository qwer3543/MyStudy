package com.mystudy.ex06_type_casting;

public class CarTest {

	public static void main(String[] args) {


		System.out.println("=== Car 클래스 ===");
		
		Car car = new Car();
		car.type = "자동차";
		System.out.println(car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance 클래스 ===");
		
		Ambulance am = new Ambulance();
		am.type = "구급차";
		System.out.println(am.type);
		am.drive();
		am.stop();
		
		am.siren();
		
		System.out.println("=== FireEngine ===");
		
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println(fe.type);
		fe.drive(); 
		fe.stop();
		
		fe.siren();
		fe.water();
		
		System.out.println("======================");
		// 형변환
		
		Car carTemp = new Car();
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); //못씀 이유: Car 타입에는 siren()가 없다
		
		System.out.println("=== Car <- Ambulance 사이렌 울리기 X ===");
		//                 부모 클래스 <- 자녀 클래스  O
		
		// Car car2 = new Ambulance();
		carTemp = am; // Car 타입에 <- Ambulance 타입을 저장
		// Car 클래스가 Ambulance 타입을 저장했지만 Car 타입에있는 기능만을 사용할수 있다
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); //못씀 이유: Car 타입에는 siren()가 없다
		// 결론은 못쓴다 
		
		System.out.println("=== Ambulance <- Cat 사이렌 울리기 X ===");
		//                       자녀클래스 <- 부모클래스 X
		
		//((Ambulance) car).siren(); // 문법적으론 문제 없지만 동작시 작동하지 않음
		
		
		System.out.println("=== Ambulance <- Car <- Ambulance O ===");
		                    
		// 자녀 클래스 <- 부모 클래스 : X 
		// 하지만 형변환을 했들땐 가능하다
		// 즉 Car 타입에 담긴 Ambulance(carTemp)을 다시 Ambulance 타입으로 형변환
		Ambulance am2 = (Ambulance)carTemp;
		// carTemp는 Car 타입이다 그래서 이 carTemp를 (Ambulance)carTemp;로 형변환
		am2.drive();
		am2.stop();
		am2.siren(); // 사용가능
		
		// (앰뷸런스) : carTemp을 괄호을 이용해 즉시 형변환후 호출 가능
		((Ambulance)carTemp).siren();
		
		
		
		
	}

}
