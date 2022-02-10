
public class Ex03_switch {

	public static void main(String[] args) {
		
		// switch case문: 동등비교문
		
		/*     switch (조건값){
		 *     case 비교값1 :
		 *         실행할 문장(들);
		 *         break;
		 *     case 비교값2 :
		 *         실행할 문장(들);
		 *         break; 
		 *     case 비교값3 :
		 *         실행할 문장(들);
		 *         break; 
		 *     default :
		 *         실행할 문장(들);     
		 *  }
		 *      
		 */
		
		// 1] switch의 결과값을 case의 값과 비교하여 
		//    같은 값을 가지고 있는 위치부터 명령들을 실행한다 (정수 또는 문자)
		// 2] case의 값들은 상수(변수가 아닌 것)만를 사용하여 중복 선언되어서는 안된다.
		// 3] case의 값이 맞는 경우 명령들을 수행하지만 break 명령어를 
		//    만나면 switch문을 종료한다.
		// 4] case 값이 하나도 일치하지 않으면 default의 명령을 실행한다.
		
		int k = 12;
		
		System.out.println("달력 " + k + "월");
		
		switch (k) {
		case 1:
			System.out.println("31일까지 있습니다"); break;
		case 2:
			System.out.println("28일 까지 있습니다"); break;
		case 3:
			System.out.println("31일까지 있습니다"); break;
		case 4:
			System.out.println("30일까지 있습니다"); break;
		case 5:
			System.out.println("31일까지 있습니다"); break;
		case 6:
			System.out.println("30일까지 있습니다"); break;
		case 7:
			System.out.println("31일까지 있습니다"); break;
		case 8:
			System.out.println("31일까지 있습니다"); break;
		case 9:
			System.out.println("30일까지 있습니다"); break;
		case 10:
			System.out.println("31일까지 있습니다"); break;
		case 11:
			System.out.println("30일까지 있습니다"); break;
		case 12:
			System.out.println("31일까지 있습니다"); break;
		default:
			System.out.println("X"); break;
		
		}
		
		// 줄여 쓰기
		
		System.out.println("===========줄여 쓰기===========");
		
		switch (k) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일까지 있습니다"); break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있습니다"); break;
		case 2:
			System.out.println("28일 까지 있습니다"); break;
		default:
			System.out.println("X"); break;
		}
		
		//========================================
		System.out.println("============================");
		
		// 실습] 추첨 결과에 따라 상품을 지급합니다
		// 1등. 냉장고, 2등. 김치냉장고, 3등. 세탁기, 4등. 청소기
		// 등수안에 없으면(꽝인경우). 휴지
		
		String q1 = "1등";
		
		System.out.println("추첨 결과는 " + q1 + "입니다 축하합니다.");
		
		switch (q1) {
		case "1등":
			System.out.println("경품은 냉장고 입니다."); break;
		case "2등":
			System.out.println("경품은 김치냉장고 입니다."); break;
		case "3등":
			System.out.println("경품은 세탁기 입니다."); break;
		case "4등":
			System.out.println("경품은 청소기 입니다."); break;
		default:
			System.out.println("경품은 휴지 입니다."); break;
		}

		//========================================
		System.out.println("============================");
				
		// 다른 방법
		
		String q2 = ""; 
		
        System.out.println("추첨 결과는 " + q1 + "입니다 축하합니다.");
		
		switch (q1) {
		case "1등":
			q2 = "냉장고"; break;
		case "2등":
			q2 = "김치냉장고"; break;
		case "3등":
			q2 = "세탁기"; break;
		case "4등":
			q2 = "청소기"; break;
		default:
			q2 = "휴지"; break;
		}
		
		System.out.println("경품은 "+ q2 +" 입니다.");
		
	}
}
