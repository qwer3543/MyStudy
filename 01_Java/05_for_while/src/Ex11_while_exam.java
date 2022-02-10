
public class Ex11_while_exam {

	public static void main(String[] args) {
		
		// while문 사용하여 처리하기
		
		// 1] 1 ~ 10 까지의 합을 구하고 출력
		
		int num = 1;
		int k = 0;
		
		while (num <= 10) {
			
			k += num;
			num++;
		}
		
		System.out.println(k);
		
		System.out.println("===========================");
		
		// 2] ****
		//    ****
		//    ****
		//    ****
		//    ****
		
		
		int w = 1;
		int p = 1;
		
		while (w <= 5) {
			w++;
			p = 1;
			while (p <= 4) {
				p++;
				System.out.print("*");
			}
			System.out.println();
			
	
		}
		
		System.out.println("===========================");
		
		// 3] *
		//    **
		//    ***
		//    ****
		//    *****
		
		String a = "*";
		String d = "*";
		int s = 1;
		
		while (s <= 5) {
			System.out.println(a);
			a = a+d;
			s++;
		}		
		
		System.out.println("===========================");
		

	}
	
	
	
	

}
