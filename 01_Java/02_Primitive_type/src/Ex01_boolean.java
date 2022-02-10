
public class Ex01_boolean{

	public static void main(String[] args) {
		
		//         (변수 명은 항상 소문자로 시작)
		
		//boolean : true(참), false(거짓) / 논리형
		
		// 타입     변수명  = 초기 값; (변수선언 + 초기값 설정)
		// int  qwer1 =  5; 
		
		// 타입       변수명; (변수 선언만 한 경우)
		// int   qwer2; (정수 형태의 저장공간 하나를 생성한다)
		 
		//===========================================
		   
		boolean k1 = true; 
		boolean k2 = false;
		
		System.out.println("k1 : " + k1);
		System.out.println("k2 : " + k2);
		
		k1 = true; //(조건이 참일경우 밑에 if문을 실행)
		if (k1) {
			System.out.println("안녕");
		}else { //(조건이 거짓일 경우  else문을 실행)
			System.out.println("Hello");
		}
		
		
		
		

	}

}
