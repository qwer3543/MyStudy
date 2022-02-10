
public class Ex07_flost {

	public static void main(String[] args) {
		// 실수형 float: 4byte 범위: 1.4E-45 ~ 3.4028235E38
		//정확도: 소수점6번째 까지 정확
		//float f1 = 3.4; // 기본적으로 오른쪽은 버블 타입
		float f1 = 3.4f; // 숫자 끝에 f로 float 처리를 한다
		float f2 = 3.2f;
		
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println(f1 + f2);
		//결과 6.6000004 소수점 6째 자리까지 완벽 
		//7째 자리부터 이상함 -> 나중엔 소수점 자리 수 잘라서 사용해야함
		System.out.println("=================================");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		
		
		
		
		
		
		

	}

}
