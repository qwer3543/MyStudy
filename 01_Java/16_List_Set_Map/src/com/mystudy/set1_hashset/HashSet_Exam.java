package com.mystudy.set1_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Exam {

	public static void main(String[] args) {
		// HashSet: Set 인터페이스를 구현한 구현체(클래스)
		// 순서가 없고, 중복데이터 허용안함(동일데이터는 하나만 저장)
		// Set 에서 동일 데이터 여부 확인 hashCode(), equals() 값 확인
		// 1. 해시코드 값 확인: hashCode()
		// 2. equals() 메소드 결과값이 모두 일치하면 동일 데이터 처리
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김유신");
		
		set.add("홍길동"); // 중복 안됨
		set.add(new String("홍길동")); // new 써도 안됨
		
		System.out.println(set);
		
		System.out.println("홍길동".hashCode()); // 같은 해쉬 코드로 뜸
		System.out.println(new String("홍길동").hashCode()); // 위와 같음
		System.out.println(set.size()); // 크기 확인 가능
		System.out.println(set.contains("홍길동")); // 정보 유무 확인 가능
		
		System.out.println("=======================");
		
		set.add("을지문덕");
		set.add("홍경래");
		
		System.out.println(set); // 확인 결과 들어가는 순서는 뒤죽 박죽이다
		
		System.out.println("========== set 전체 데이터 조회 1 ==========");
		
		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println("========== set 전체 데이터 조회 2 ==========");
		
		Iterator<String> ite = set.iterator();
		
		while (ite.hasNext()) {
			String name = ite.next();
			System.out.println(name);
		}
		
		//-------------------------------------------------------------
		System.out.println("========== 실습 ==========");
		// 실습: 수정(변경)]> 김유신 => 강감찬 (김유신을 삭제 후 강감찬 입력)
		      
		set.remove("김유신"); // 지우고
		set.add("강감찬"); // 추가함
		
		System.out.println(set);
		
		// 김우신 => 강감찬 (김우신이라는 데이터는 없다 이때 위와 같이 코드를 짜면 강감찬이 그냥 추가 될수 있다)
		
		if (set.contains("김유신")) {
			set.remove("김유신");
			set.add("강감찬");
		} else {
			System.out.println(">> 데이터 없음");
		}
		System.out.println(set);
		
		if (set.remove("홍길동")) {
			System.out.println(">> 제거 성공");
		} else {
			System.out.println(">> 제거 실패");
		}
		System.out.println(set);
		
		
		
		

	}

}


