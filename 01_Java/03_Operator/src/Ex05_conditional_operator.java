
public class Ex05_conditional_operator {

	public static void main(String[] args) {
		// ? : = 조건연산자 또는 삼항 연산자
		// 조건  ?  실행문1 : 실행문2;
		// 조건  ? true일때 실행  : false일때 실행;
		
		int num1 = 30;
		int num2 = 20;
		
		System.out.println("num1 -> " + num1);
		System.out.println("num2 -> " + num2);
		
		String k = (num1 > num2) ? "num1이 크다" : "num2이 크지 않다";
// String(문자열) k =    조건             ?  true일때 실행 : false일때 실행;
		System.out.println("num1 > num2 결과는 ?" + k);
		
		//========================================
		System.out.println("===================================");
		
		
		// 제어문 분기처리
		
		int num3 = 10;
		int num4 = 20;
		
		System.out.println("num3 -> " + num3);
		System.out.println("num4 -> " + num4);
		
		if (num3 > num4) {
			k ="num1이 크다";
		}else {
			k = "num2이 크지 않다";
		}
		
		System.out.println("num1 > num2 결과는 ?" + k);
		
		
		
		
		
		
		
		
		
		

	}

}
