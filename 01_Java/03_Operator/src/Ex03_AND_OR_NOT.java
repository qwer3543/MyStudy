
public class Ex03_AND_OR_NOT {

	public static void main(String[] args) {
		// 논리 연산자: &&(AND) , ||(OR) , !(NOT)
		// 논리 연산자(&&, ||)의 좌, 우에는 true, false 값만 있어야함
		
		int num1 = 10;
		int num2 = 20;
		
		boolean t1 = true;
		boolean f1 = false;
		
		System.out.println();
		
		System.out.println("true && true ->" + (true && true));
		System.out.println("true && false ->" + (true && false));
		System.out.println("false && false ->" + (false && false));
		System.out.println("false && true ->" + (false && true));
		
		System.out.println("==========================");
		//=====================================
		
		System.out.println("t1 && f1 ->" + (t1 && f1));
		
		System.out.println("==========================");
		//=====================================
		
		//int num1 = 10;
		//int num2 = 20;
		
		// (num1 < num2) && t1 : ?
		
		boolean result = (num1 < num2) && t1;
		// (num1 < num2) 값은 true이다 이걸 t1 값과 &&(AND 비교한다) 
		System.out.println("(num1 < num2) &&(비교한다) t1 ->" + ((num1 < num2) && t1) );
		
		System.out.println("==========================");
		//=====================================
		
		
		System.out.println("true || true ->" + (true || true));
		System.out.println("true || false ->" + (true || false));
		System.out.println("false || false ->" + (false || false));
		System.out.println("false || true ->" + (false || true));
		
		System.out.println("==========================");
		//=====================================
		
		System.out.println("false || true ->" + (false || true));
		
		System.out.println("==========================");
		//=====================================
		
		boolean result1 = (num1 < num2) || t1;
		System.out.println("(num1 < num2) ||(비교한다) t1 ->" + ((num1 < num2) || t1) );
		
		System.out.println("========    !    ============");
		//=====================================
		
		boolean result2 = !((num1 < num2) || t1);
		System.out.println("!(num1 < num2) ||(비교한다) t1 ->" + !((num1 < num2) || t1) );
		
		
		
		
		
		
	}

}
