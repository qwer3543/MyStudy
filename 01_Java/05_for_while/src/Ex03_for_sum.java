
public class Ex03_for_sum {

	public static void main(String[] args) {
		
		// 1~ 10 까지의 합계(1+2+3+....+10 => 55가 나와야함)
		int k = 0;
		for ( int q = 0 ; q <= 10 ; q++ ) {
			k = k + q;
		}
		System.out.println(k);
		
		System.out.println("=================================");
		
		// 1 ~ 10까지의 숫자중에 짝수을 찾아서 출력(2,4,6,8,10)
		
		for ( int w = 1 ; w <= 10 ; w++ ) {
			if (w % 2 == 0) { // 짝수냐?
				System.out.println(w);
			}
		}
		
		System.out.println("=================================");
		
		// 1 ~ 10까지의 숫자중에 홀수을 찾아서 출력(1,3,5,7,9)
		
		for ( int e = 1 ; e <= 10 ; e++ ) {
			if (e % 2 != 0) { // 짝수가 아니냐?
				System.out.println(e);
			}
		}
		
		System.out.println("=================================");
		
		//
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
