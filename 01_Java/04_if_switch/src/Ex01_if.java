
public class Ex01_if {

	public static void main(String[] args) {
		/*
		 * 제어문-분기문(비교문) : if문
		 * 
		 * if (조건문){
		 * 
		 * 실행할 문장들(조건이 참일때);
		 * 
		 * }
		 */
		int num1 = 10;
		int num2 = 20;

		if (num1 < num2) {
			System.out.println("num1이 num2보다 작다");
		} else {

		}

		System.out.println("작업 끝1");

		System.out.println("=============================");
		// ===================================================

		boolean k1 = num1 < num2;

		if (k1) {
			System.out.println("num1이 num2보다 작다");
		}

		System.out.println("작업 끝2");

		System.out.println("=============================");
		// ===================================================

		// 점수 평가 과정 출력: 수, 우, 미, 양, 가
		/*
		 * 90 ~ 100 : 수 80 ~ 89 : 우 70 ~ 79 : 미 60 ~ 69 : 양 0 ~ 59 : 가
		 */

		System.out.println("================ 성적 처리===================");

		int qwer = 100;

		System.out.println("점수 : " + qwer);

		if (qwer >= 90 && qwer <= 100) {
			System.out.println("평가완료 => 수");
		}
		if (qwer >= 80 && qwer <= 89) {
			System.out.println("평가완료 => 우");
		}
		if (qwer >= 70 && qwer <= 79) {
			System.out.println("평가완료 => 미");
		}
		if (qwer >= 60 && qwer <= 69) {
			System.out.println("평가완료 => 양");
		}
		if (qwer >= 0  && qwer <= 59) {
			System.out.println("평가완료 => 가");
		}
		System.out.println("잘못 입력 하셨습니다");

		System.out.println("=============================");
		// ===================================================
		
			
		
		
		
		

	}

}
