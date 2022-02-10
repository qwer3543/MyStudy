
public class Ex06_for_star {

	public static void main(String[] args) {
		// ***** 화면출력
		System.out.println("*****");
		System.out.println("------------------");
		
		System.out.print("*****");
		System.out.println(); //줄바꿈 역할
		
		System.out.println("------------------");
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		System.out.println(); //줄바꿈 역할
		
		System.out.println("---- 반복문 print * 찍기 반복 ---");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println(); //줄바꿈 역할
		
		System.out.println("=========================");
		/* 문제 : 별 다섯개를 한줄에 찍기 + 3줄 출력
		*****
		*****
		*****
		--------------------*/
		System.out.print("*****");
		System.out.println();
		
		System.out.print("*****");
		System.out.println();
		
		System.out.print("*****");
		System.out.println();
		
		System.out.println("---for문 1번 적용----");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("=== for문 중첩 사용 =======");
		for (int line = 1; line <= 3; line++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//=======================================
		System.out.println("==================");
		for (int i = 1; i <= 3; i++) {
			System.out.print("*****");
			System.out.println();
		}
		
		
		System.out.println("---------------");
		for (int i = 1; i <= 3; i++) {
			for (int star = 1; star <= 5; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		//===================================
		System.out.println("==== 삼각형 * 찍기 =======");
		/* 화면(콘솔창)에 삼각형 모양을 출력
		*
		**
		***
		****
		*****
		==================== */
		//System.out.print("*");
		
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("==============");
		int cnt = 1;
		for (int line = 1; line <=5; line++) {
			for (int star = 1; star <= cnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			cnt++;
		}	
		System.out.println("==================");	
		/* 화면(콘솔창)에 삼각형 모양을 출력
		*      1라인 : * 1개 + 줄바꿈
		**     2라인 : * 2개
		***    3라인 : * 3개
		****   4라인 : * 4개 
		*****  5라인 : * 5개
		==================== */	
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}








