
public class Ex05_int {

	public static void main(String[] args) {
		//정수형 int: 4byte 범위(-2147483648 ~ 2147483647)
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int num1 = 70000;
		int num2 = 30000;
		
		int sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2+" = " + sum);
		
		System.out.println(num1 + " - " + num2+" = " + (num1 - num2));
		
		System.out.println(num1 + " - " + num2+" = " + (num1 * num2));
		
		System.out.println(num1 + " - " + num2+" = " + (num1 / num2));
		
		System.out.println(num1 + " - " + num2+" = " + (num1 % num2));
		// % -> 나눈 나머지 값을 나타냄
		
		
		// 나누기 할때 0으로 나누는 경우가 있을수 있다(100/0)
		// 오류 목록 중 Exception(예외 발생 이라는 뜻)
		int k1 = 0;
		
		System.out.println(num1 / k1); 
		//실행할땐 문제는 없지만 실행 후 오류가 발생한다 
		//-> 프로그램이 종료 된다
		
		
		
	}

}
