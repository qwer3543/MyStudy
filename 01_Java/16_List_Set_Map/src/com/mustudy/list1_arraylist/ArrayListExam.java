package com.mustudy.list1_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {

	public static void main(String[] args) {
		// ArrayList : Array(배열)의 속성을 가진 List(목록)
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println("list1.size() : " + list1.size());
		
		//입력(C) : 맨 뒤에 추가
		list1.add(new Integer(5)); // Integer 저장
		list1.add(1); //int -> Integer 자동형변환 되어 입력됨
		list1.add(5);
		list1.add(6);
		list1.add(7);
		System.out.println(list1.toString());
		
		System.out.println("------------- 입력 --------------");
		
		//입력(C) : 지정된 특정 위치에 데이터 추가
		list1.add(0, 100); //인덱스 위치에 데이터 추가 후 값을 밀어낸다
		System.out.println("0번 인덱스에 100 add : " + list1.toString());
		
		System.out.println("----------- 수정 ------------");
		
		//수정(U) : 지정된 위치의 데이터 수정(변경)
		list1.set(0, 999); //인덱스 위치의 데이터를 수정(변경)
		System.out.println("0번 인덱스에 999 set : " + list1.toString());
		
		System.out.println("list1 size : " + list1.size());
		
		//--------------------------
		
		System.out.println("------------ 조회,검색 --------------");
		
		//조회,검색(R) : 특정 위치의 데이터 읽기(조회, 검색, 확인, 선택)
		int firstData = list1.get(0);
		System.out.println("list1.get(0) : " + firstData);
		System.out.println(list1);
		
		System.out.println("------------- 삭제 --------------");
		//삭제(D) : 특정 위치 데이터 삭제
		//0번 인덱스 데이터 삭제요청 후 returnValue변수로 삭제 요청한 값 옴기기
		int returnValue = list1.remove(0);
		System.out.println(list1);
		System.out.println("list1.remove(0) return : " + returnValue);
		
		//list1.remove(5); // 숫자5 데이터 삭제요청 후 삭제 했다면 true, 값이 없어서 삭제 못했다면 false
		boolean removeSuccess = list1.remove(new Integer(10));
		System.out.println(list1);
		System.out.println("remove return : " + removeSuccess);
		
		System.out.println("----------- 순서 뒤집기 ------------");
		
		// 순서 뒤집기
		System.out.println("reverse 전 : " + list1);
		Collections.reverse(list1);
		System.out.println("reverse 후 : " + list1);
		
		System.out.println("=========== 범위 지정하여 출력하기 ============");
		
		// 범위 지정하여 출력하기
		System.out.println(list1.subList(1, 4));
		
		System.out.println("=========== 범위 지정하여 복사하기 ============");
		
		// 범위 지정하여 복사하기
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
		System.out.println("list2 : " + list2);
		
		System.out.println("--- 오름차순 ----");
		// 오름차순
		Collections.sort(list2);
		System.out.println("Collections.sort(list2) 후 : " + list2);
		
		System.out.println("--- 내림차순 ----");
		// sort() 오름차순으로 정렬후 -> reverse() 순서 뒤집기 => 내림차순이 된다
		
		Collections.sort(list2); // 오름차순으로 정렬
		Collections.reverse(list2); // 순서 뒤집기
		System.out.println("내림차순 : " + list2);
		
		System.out.println("=========== for ===========");
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(i + " : " + list2.get(i));
		}
		
		System.out.println("=========== for ============");
		
		int k = 0;
		for (Integer num : list2) {
			System.out.println(k++ + " : " + num);
		}
		
		System.out.println("========== 특정 데이터의 존제 여부 확인 ==========");
		// 특정 데이터의 존제 여부 확인
		
		System.out.println(list2.contains(5)); 
		
		
		
		
	}

}








