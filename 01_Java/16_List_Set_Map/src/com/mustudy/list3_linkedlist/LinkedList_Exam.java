package com.mustudy.list3_linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_Exam {

	public static void main(String[] args) {
		// LinkedList : List 속성
		LinkedList<String> list = new LinkedList<String>();
		list.add("홍길동"); // 0 번 인덱스
		list.add("홍길동"); // 1 번 인덱스
		list.add("김유신");
		System.out.println("list : " + list);
		
		System.out.println(list.get(0));
		
		String str = "홍길동,홍길동,김유신,을지문덕,홍경래,김유신,홍길동";
		
		String[] names = str.split(","); // ,기준으로 나누어 넘기기
		
		System.out.println(Arrays.toString(names)); 
		// strs 확인하기(Arrays.toString())
		
		// 배열에 있는 데이터를 리스트에 추가
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		System.out.println(list);
		
		//============================
		System.out.println("======= 실습 ========");
		// list: [홍길동, 홍길동, 김유신, 홍길동,  홍길동,  김유신,  을지문덕,  홍경래,  김유신,  홍길동]

		
		// 리스트에 있는 데이터 변경하기
		// 1. 김유신 모두 삭제
		// 2. 홍길동 -> 모두 홍길동2 수정하기
		
		// 깊은 복사
		LinkedList<String> list2 = (LinkedList) list.clone();
		
		// 1]> 뒤에서부터 확인하는 방법(추천)
		//     remove()는 값을 삭제하고 값을 삭제한 자리에 다음 인덱스 번호를
		//     불러온다 그럴때 반복에 문제가 생긴다 / 뒤에서 부터 지우면 문제가 생기지 않는다
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list2.get(i).equals("김유신")) {
				list2.remove(i);
			}
		}
		System.out.println(list2);
		
		// 2]> 앞에서 확인하는 방법 
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("홍길동")) {
				list.set(i,"홍길동2");
			}
		}
		System.out.println(list);
		
		System.out.println("=== 다른 방법 1 ===");
		
		// 데이터 확인 방법
		System.out.println("데이터의 존재여부 확인: " + list.contains("김유신"));
		
		while (list.contains("김유신")) {
			list.remove("김유신");
		}
		System.out.println(list);
		
		System.out.println("=== 다른 방법 1 ===");
		
		// 데이터의 인덱스 번호 확인
		System.out.println("데이터 위치 확인: " + list.indexOf("홍길동2"));
		
		while (true){
			int kkk = list.indexOf("홍길동2");
			if (kkk == -1) break; // 비교값 -1은 false일떼 나오는 값이다
			list.remove(kkk);
		}
		System.out.println(list);
		
	}

}
