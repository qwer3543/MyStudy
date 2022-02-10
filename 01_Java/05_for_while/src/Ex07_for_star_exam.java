
public class Ex07_for_star_exam {

	public static void main(String[] args) {
		
		// 문제1 ---------------------
		//***** 
		//****  
		//***   
		//**
		//*
		
		int starCnt = 5;
		for (int i = 1; i <= 5; i++) {
			for (int k = starCnt; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();                    
			starCnt--;
		}

		System.out.println("============================");
		
		// 문제2 -------------------
		//    *  
		//   **  
		//  ***  
		// ****  
		//*****  
		
		starCnt = 4;
		int qwe = 1;
		for (int i = 1; i <= 5; i++) {
			for (int k = starCnt; k > 0; k--) {
				System.out.print(" ");
			}
			for (int ss = 1;ss <= qwe; ss++) {
				System.out.print("*");
			}
			System.out.println();
			starCnt--;
			qwe++;
		}	
		
		System.out.println("============================");
		
		// 문제3 -------------------
		//*****  
		// ****  
		//  ***  
		//   **  
		//    *  
		
		starCnt = 5;
		 qwe = 1;
		for (int i = 1; i <= 5; i++) {
			for (int k = starCnt; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
			
			if(qwe == 5) break;
			
			for (int ss = 1;ss <= qwe; ss++) {
				System.out.print(" ");
			}
			starCnt--;
			qwe++;
		}
		
		System.out.println("======================");
		
		// 문제4 --------------------
		//1        
		//1 2      
		//1 2 3    
		//1 2 3 4 
		
		int cnt = 1;
		for (int line = 1; line <= 4; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print(cnt +" ");
				cnt++;
			}
			cnt = 1;
			System.out.println();
		}
		
		System.out.println("======================");
		
		// 문제5 --------------------
		//1 
		//2 3
		//4 5 6
		//7 8 9 10
		
		int cnt1 = 1;
		for (int line = 1; line <= 4; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print(cnt1 +" ");
				cnt1++;
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		
		
		
		
	}

}
