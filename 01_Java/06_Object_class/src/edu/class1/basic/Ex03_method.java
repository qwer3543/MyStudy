package edu.class1.basic;

public class Ex03_method {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		int sum = 0;
		int kim = 0;
		int dong = 0;
		int uk = 0;
		
		// static 메소드 호출 방법
		sum = add(num1, num2);// 메소드 실행(호출)
		System.out.println(sum);
		
	    // static 영역에서 non-static 메소드 호출 방법
		// Ex03_method ex03 = new Ex03_method();을 한번만 선언시 ex03을 호출해올수 있다
	    Ex03_method ex03 = new Ex03_method();
	    kim = ex03.sub(num1, num2);
	    System.out.println(kim);
	    
	    dong = ex03.aaa(num1, num2);
	    System.out.println(dong);
	    
	    uk = ex03.sss(num1, num2);
	    System.out.println(uk);
	}
	
	/* === 메소드 4가지 형태 ===
	  1. 리턴값 없음, 전달받는 파라미터 없음
	      void 메소드명() {}
	      
	  2. 리턴값 없음, 전달받는 파라미터 있움
	      void 메소드명(파라미터타입 변수명, ...) {}
	      
	  3. 리턴값 있음, 전달받는 파라미터 없음
	          리턴타입 메소드명() {}
	          
	  4. 리턴값 있음, 전달받는 파라미터 있움
	          리턴타입 메소드명(파라미터타입 변수명, ...) {}
	 */   
	
	// 메소드 선언(4)
		static int add(int a, int b) {
			return a + b;
		}
	
	// non-static 메소드 선언(4)
		int sub(int a, int b) {
			return a - b;
		}
		
		int aaa(int a, int b) {
			return a * b;
		}
		
		int sss(int a, int b) {
			return a / b;
		}
	
}
