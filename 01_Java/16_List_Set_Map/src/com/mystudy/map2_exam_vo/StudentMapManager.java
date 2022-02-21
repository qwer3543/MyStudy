package com.mystudy.map2_exam_vo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class StudentMapManager {

	public static void main(String[] args) {
		/*(실습) Map 데이터 다루기
		 사용클래스명 : StudentVO, StudentMapManager - main() 메소드
		1. 3명의 학생데이터(성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		   ---------------------
		  */
		StudentVO k1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO k2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO k3 = new StudentVO("김유신", 90, 87, 77);
		//2. Map<String, StudentVO> 타입의 변수(map)에 저장하고
		
		Map<String, StudentVO> map = new HashMap<String, StudentVO>();
		
		map.put("홍길동", k1);
		map.put("이순신", k2);
		map.put("김유신", k3);
		
		System.out.println(map.get("홍길동").name + "\t" +map.get("홍길동").kor +
						  "\t" +map.get("홍길동").eng + "\t" +map.get("홍길동").math +
						  "\t" +map.get("홍길동").tot + "\t" +map.get("홍길동").avg);
		/*3. map에 있는 데이터를 사용해서 화면출력
		   성명    국어   영어  수학    총점     평균
		   --------------------------
		   홍길동   100  90  81  270  90.33
		   ...
		   -----------------------------
		   */
	
		//4. 저장된 map에 있는 김유신 학생의 국어 점수를 95점으로 수정
	
		
		
		
		//5. "김유신" 학생의 성적만 화면 출력
		//5-2. "김유신" 학생의 성명, 총점, 평균 화면 출력
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
