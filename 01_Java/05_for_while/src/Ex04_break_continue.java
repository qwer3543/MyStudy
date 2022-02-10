
public class Ex04_break_continue {

	public static void main(String[] args) {
		// break 문
		// break 문은 루프 내에서 사용하여 해당 반복문을 완전히 종료시킨 뒤, 
		// 반복문을 빠져나감.

		// continue 문
		// continue 문은 루프 내에서 사용하여 해당 루프의 나머지 부분을 건너뛰고,
		// 바로 다음 조건식의 판단으로 넘어가게 해줍니다.
		// 보통 반복문 내에서 특정 조건에 대한 예외 처리를 하고자 할 때 자주 사용됩니다.
		
		System.out.println("========if문========");
		
		// = 1 ~ 10까지 출력중 8은 출력하지 말 것 
		
		for ( int q = 1 ; q <= 10 ; q++ ) {
			if (q != 8) {
				System.out.print(q + " "); // print는 가로로 출력한다
			}
		}
		
		System.out.println(); // println는 세로로 줄바꿈 해준다
		
		System.out.println("========continue문========");
		
		for ( int q = 1 ; q <= 10 ; q++ ) {
			if (q == 8) {
				
				continue;
			}
			
			System.out.print(q + " "); // print는 가로로 출력한다
			
		}
		
		//  \n -> 줄바꿈
		System.out.println("\n========break문========");
		
		// 1 ~ 10 출력중 8을 만나면 처리 중단 
		
		for ( int q = 1 ; q <= 10 ; q++ ) {
			if (q == 8) {
				break;
			}
			
			System.out.print(q + " "); // print는 가로로 출력한다
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
