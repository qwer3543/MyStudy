
public class Ex10_while {

	public static void main(String[] args) {
		// 반복문: while, do ~ while
		// ======= 사용형태 ========
		
		//  반복인자의 선언 및 초기값 설정;
		//  while (실행 조건문) {
		//
		//        반복인자 값의 증감설정(선택형);
		//        실행문들;                [증감설정 둘중 하나만 선택]
		//        반복인자 값의 증감설정(선택형);
		//
		//  }
		
		
		// 1 ~ 10까지 출력(while문으로만)
		
		System.out.println("=================while================");
		
		int k = 1;
		
		while (k <= 10) {
			System.out.print(k + " ");
			k++;
		}
		
		System.out.println();
		
		System.out.println("=================break================");
		
		// break문: 한단계 밖으로만 나간다
		
		int num = 1;
		
		while (true) {
			if (num >= 10) break;
			System.out.print(num + " ");
			num++;
		}
		
		System.out.println();
		
		outFor:
			for (int out = 1; out <=3; out++) {
				for (int in = 1; in <=2; in++) {
					System.out.println("out : " + out + ", in : " + in);
					if (out == 2) break outFor; // outFor문은 for문을 한번에 
				}                               // 나간다는 뜻이다
			}
		
		System.out.println("================continue=================");
		
		num = 0;
		
		while (num < 10) {
			
			num++;
			if (num % 2 ==0) continue;
			System.out.print(num + " ");
			
		}
		
		System.out.println();
		
		System.out.println("=================for continue================");
		
		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) continue;
			System.out.print(m + " ");
		}
		
		System.out.println();
		
		System.out.println("=================do while================");
		
		// 무조건 한번은 실행후 검사
		
		int k1 = 1;
		
		do {
			System.out.print(k1 + " ");
			k1++;
		} while (k1 <= 10);
		
		
		
		
		
		
		
		
		
	}

}
