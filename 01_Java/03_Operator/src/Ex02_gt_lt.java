
public class Ex02_gt_lt {

	public static void main(String[] args) {
		//비교 연산자: > , < , >= , <= , == , !=
		//비교 연산자의 결과 값: true , false
		
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num1 > num2 -> " + (num1 > num2));
		System.out.println("num1 < num2 -> " + (num1 < num2));
		
		System.out.println("=========================");
		//==============================
		
		int num3 = 20;
		int num4 = 20;
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num3 >= num4 -> " + (num3 >= num4));
		System.out.println("num3 <= num4 -> " + (num3 <= num4));
		
		System.out.println("=========================");
		//==============================
		
		int num5 = 20;
		int num6 = 70;
		System.out.println("num5 : " + num5);
		System.out.println("num6 : " + num6);
		System.out.println("num5 == num6 -> " + (num5 == num6));
		System.out.println("num5 != num6 -> " + (num5 != num6));
		
		System.out.println("=========================");
		//==============================
		
		// ! : 부정 처리
		// !true -> false을 의미 , !false -> true을 의미
		boolean power = true; // power가 참이다
		System.out.println("power : " + power);
		
		power = !power; // power가 거짓이다 [true -> false]
		System.out.println("power : " + power);
		
		power = !power; //power가 참이다 [false -> true]
		System.out.println("power : " + power);
		
		System.out.println("=========================");
		//==============================
		
		power = true;
		
		if (power) { // 참일 때 
			System.out.println("전원 ON");
		}
		if (!power) { // 참이 아닐 때
			System.out.println("전원 OFF");
		}
		//결과는: 전원ON
		

	}

}
