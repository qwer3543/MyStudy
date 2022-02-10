
public class Ex03_byte {

	public static void main(String[] args) {
		
		// 정수형: 정수 숫자 저장 (256개(-128~127) 데이터 저장)
		
		byte k1 = 100;
		byte k2 = 29;
		
		System.out.println("k1 : " + k1);
		System.out.println("k2 : " + k2);
		
		byte k3 = (byte) (k1 + k2); 
		// byte 타입 값을 초과 하여 실행 오류 그래서 (byte)을 해준다
		System.out.println("k1 + k2: " + k3);
		// 출력 값은 129가 나와야 한다 하지만 byte범위 값을 벗어나
		// 정확한 값을 출력하지 못한다
		
		System.out.println("======================");
		// Byte.MIN_VALUE, Byte.MAX_VALUE 변수의 첫 글자를 대문자로 기입
		// 후 최소값은 .MIN_VALUE 최대값은.MAX_VALUE
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);
		
		
		

	}

}
