
public class Ex09_for_gugudan2 {

	public static void main(String[] args) {
		
		// 구구단 출력(가로로 출력하기)
		// 2*1=2	3*1=3	...	9*1=9
		// 2*2=4	3*2=6	... 9*2=18
		// .
		// .
		// .
		// 2*9=18	3*9=27	... 9*9=81
		
		// "\t" (탭을 의미함)
		
		System.out.println("========= 구구단 1 ~ 9단 =========");
		
		int k1 = 2;
		int k2 = 1;
		
		for (int s = 1; s <= 9; s++) {
			for (int m = 1; m <= 8; m++) {
			
				System.out.print((k1 + "*" + k2 + "= ") + (k1*k2) + "\t");
				k1++;
			}
			k1 = 2;
			k2++;
			System.out.println();	
		}
		
		System.out.println("==========================================");
		
	}

}
