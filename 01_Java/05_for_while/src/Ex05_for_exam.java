
public class Ex05_for_exam {
	
	public static void main(String[] args) {
		
		// 1 ~ 10까지의 숫자중 짝수 출력
		// 2로 나누어서 나머지가 0인 숫자는 2의 배수
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println("2의 배수: " + i);
			}
		}
		
		System.out.println("========================");
		
		// 1] 1 ~ 10까지 숫자 중 3의 배수인 숫자를 출력
		
		for (int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println("3의 배수: " + i);
			}
		}
		
		System.out.println("========================");
		
		// 2] 900 ~ 1000까지 숫자 중 17의 배수인 숫자를 출력
		
		for (int i = 900; i <= 1000; i++) {
			if(i % 17 == 0) {
				System.out.println("17의 배수: " + i);
			}
		}
		
		System.out.println("========================");
		
		// 3] 2000 ~ 3000 까지 숫자 중 19의 배수인 숫자를 출력
		
		for (int i = 2000; i <= 3000; i++) {
			if(i % 19 == 0) {
				System.out.println("19의 배수: " + i);
			}
		}
		
		System.out.println("========================");
		
		
		
		
		
		
		
		
		
	}

}
