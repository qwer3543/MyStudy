package com.mystudy.set1_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet_Lotto {

	public static void main(String[] args) {
		// 응용: (int) (Math.random() * 45 + 1)
		
		// 실습: Set 을 이용한 로또 만들기 : 1~45 랜덤숫자 6개를 Set에 저장
		// 1. 로또번호 6개를 추첨해서 Set 에 저장하고 화면에 출력
		// 2. 출력은 오름차순으로 EX] 5, 8, 10, 25, 33, 41
		
		TreeSet<Integer> num = new TreeSet<>(); // TreeSet 정렬해서 데이터를 저장한다
		
		while (num.size() < 6) {
			num.add((int) (Math.random() * 45 + 1));
		}
		
		System.out.println(num);
		
		// 정렬 해줘야 하는 경우 
//		ArrayList<Integer> lottoList = new ArrayList<Integer>(num) ;
//		
//		Collections.sort(lottoList);
//		
//		System.out.println(lottoList);
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
