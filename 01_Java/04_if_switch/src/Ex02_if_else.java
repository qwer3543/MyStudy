
public class Ex02_if_else {

	public static void main(String[] args) {
		// if 문 3종류
		
		// 1] if (조건) {}
		// 2] if (조건){} else{}
		// 3] if (조건){} else if(조건){} ...
		//===================================
		
		// 1] if (조건) {}
		int k1 = 30;
		int k2 = 50;
		System.out.println("k1= " + k1 + " k2= " + k2 );
		
		if (k1 > k2) {
			System.out.println("k1이 k2보다 크다");
		}
		if (k1 <= k2) {
			System.out.println("k1이 k2보다 작거나 같다");
		}
		
		//=====================================
		System.out.println("=======================================");
		
		// 2] if (조건){} else{}
		
		int k3 = 60;
		int k4 = 50;
		
		System.out.println("k3= " + k3 + " k4= " + k4 );
		
		if (k3 > k4) {
			System.out.println("k3이 k4보다 크다");
		} else {
			System.out.println("k3이 k4보다 작다");
		}
		
		//=====================================
	    System.out.println("=======================================");
		
		// 3] if (조건){} else if(조건){} ...
	    
	    int qwer = 100;

		System.out.println("점수 : " + qwer);

		if (qwer >= 90 && qwer <= 100) {
			System.out.println("평가완료 => 수");
		}else if (qwer >= 80 && qwer <= 89) {
			System.out.println("평가완료 => 우");
		}else if (qwer >= 70 && qwer <= 79) {
			System.out.println("평가완료 => 미");
		}else if (qwer >= 60 && qwer <= 69) {
			System.out.println("평가완료 => 양");
		}else if (qwer >= 0  && qwer <= 59) {
			System.out.println("평가완료 => 가");
		}else { System.out.println("잘못 입력 하셨습니다");}
	    
		//=====================================
	    System.out.println("=======================================");
	    
	    
	    
	    
	    
	}

}
