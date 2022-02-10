
public class Ex04_short {

	public static void main(String[] args) {
		// 정수형 short : 2byte(갯수: 65536, -32768 ~ 32767)
		
		// 표현 범위 확인하기
		
		short k1 = 20000;
		short k2 = 30000;
		
		System.out.println("ki : " + k1);
		System.out.println("k2 : " + k2);
		
		short sum = (short)(k1 + k2);
		
		System.out.println("k1 + k2 : " + sum);
		
		int sumInt = (k1 + k2);
		System.out.println("int 타입 k1 + k2 : " + sumInt);
		
		
		
		
		

	}

}
