
public class Ex08_for_gugudan {

	public static void main(String[] args) {
		
		// 구구단 중 2단 ~ 4단 출력 (세로 방향 으로)
		// 2*1=2
		// 2*2=4
		// ...
		// 2*9=18
		//==============================
		
		int dan = 2;
		
		for (int k = 1;k <= 9;k++) {
			
			System.out.println((dan +" * " + k + " = ") + (dan*k));
		}
		dan++;
		
		System.out.println("==============" + dan + "==============");
		
		for (int k = 1;k <= 9;k++) {
			
			System.out.println((dan +" * " + k + " = ") + (dan*k));
		}
		dan++;
		
		System.out.println("==============" + dan + "==============");
		
		for (int k = 1;k <= 9;k++) {
			
			System.out.println((dan +" * " + k + " = ") + (dan*k));
		}
		dan++;
		
		// 한번에 하기
		
		System.out.println("============== 2 ~ 9단 까지==============");
		
		System.out.println("시작");
	
		dan = 2;
		
		for (int m = 2; m <= 9; m++) {
			
			System.out.println("==============" + dan + "==============");
			
			for (int k = 1;k <= 9;k++) {
				
				System.out.println((dan +" * " + k + " = ") + (dan*k));
			}
			
			dan++;
		}
		
		
		
		
		

	}

}
