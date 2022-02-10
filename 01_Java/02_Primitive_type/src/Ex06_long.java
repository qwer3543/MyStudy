
public class Ex06_long {

	public static void main(String[] args) {
		//정수형 long: 8byte 
		//범위: -9223372036854775808 ~ 9223372036854775807
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println("=================================");
		long k1 = 200000000000L; 
		// int타입을 넘어설 경우 마지막에 L(long)을 붙여준다 [접미어]
		
		long k2 = 200000000000L;
		long sum = k1 + k2;
		
		System.out.println(k1 + " + " + k2+ " = " + sum);
		
		//==============================================
		System.out.println("=================================");
		
		byte q1 = 10;
		short w1 = 3000;
		int e1 = 300000000;
		long r1 = 70000000000000L;
		
		q1 = (byte) w1; // 값의 오류가 나올수 있다
		System.out.println(q1); // 정보 오류
		
		r1 = e1 ; // long  <-  int 
		System.out.println(r1); 
		
		
		
		
		

	}

}
