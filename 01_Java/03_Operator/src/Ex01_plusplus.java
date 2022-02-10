
public class Ex01_plusplus {

	public static void main(String[] args) {
		//         - 증감 연산자 -
		// ++ : 값을 하나 증가시킵니다
		// -- : 값을 하나 감소시킵니다
		//사용형태: ++변수 , 변수++ / --변수 , 변수--
		
		int num = 100;
		
		++num; // => 단독일때 num = num + 1; 같은 의미
		System.out.println("++num : " + num); // 101
		
		System.out.println("===================");
		//====================================
		num = 100;
		
		num++; // => 단독일때 num = num + 1; 같은 의미
		System.out.println("num++ : " + num); // 101
		
		System.out.println("===================");
		//====================================
		
		int sum = 0;
		num = 100;
		
		
		
		sum = num++; 
		// 1) num -> sum  2)그다음 num에 1을 더한다
		// 즉 ++기호가 뒤에 붙으면 더하기를 나중에 한다
		System.out.println("sum : " + sum); // 100
		System.out.println("num : " + num); // 101
		
		System.out.println("===================");
		//====================================
		
		sum = 0;
		num = 100;
		
		sum = ++num; 
		// 1) num에 1을 더한다   2) num -> sum
		// 즉 ++기호가 앞에 붙으면 더하기를 먼저 한다
		System.out.println("sum : " + sum); // 101
		System.out.println("num : " + num); // 101
		
		System.out.println("===================");
		//====================================
		
		sum = 0;
		num = 100;
		
		sum = num++ +5;
		// 1) 먼저 num(100)값 +5 -> sum으로 보낸다(sum:105)
		// 2) num에 1을 더한다 (num:101)
		System.out.println("sum = num++ +5 -> " + "sum = " + sum); // 105
		System.out.println("sum = num++ +5 -> " + "num = " + num); // 101
		
		System.out.println("===================");
		//====================================
		
		sum = 0;
		num = 100;
		
		sum = ++num +5;
		// 1) 먼저 num(100)값에 1을 더한다 그리고 +5 -> sum으로 보낸다(sum:106)
		// 2) num(num:101) 5을 더하기 전인 101로 머문다
		System.out.println("sum = ++num +5 -> " + "sum = " + sum); // 106
		System.out.println("sum = ++num +5 -> " + "num = " + num); // 101
		
		System.out.println("===================");
		//====================================
		
		//       -- 위와 같다
		
		
		
		

	}

}
