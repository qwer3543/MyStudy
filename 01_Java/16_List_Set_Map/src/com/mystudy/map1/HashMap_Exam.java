package com.mystudy.map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Exam {

	public static void main(String[] args) {
		// Map<K, V> 인터페이스 : 키(key)-값(value) 쌍으로 데이터 저장 관리
		// - 특징 : 순서가 없다
		// - 키(key) : 중복 안됨(중복값 없이 유일한 데이터)
		// - 값(value) : 중복 데이터 저장 가능
		//-----------------------------------
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println("===== 입력 =====");
		// 입력
		map.put("홍길동", 100);
		map.put("김유신", new Integer(95));
		map.put("강감찬", 88);
		System.out.println(map.put("계백", 88));
		// 키값이 같은 데이터 입력시 기존 데이터가 사라지고 새로운 데이터 입력
		// 리턴값 : 이전 데이터(value)
		System.out.println(map.put("홍길동", 77)); //동일데이터 있으면 수정처리
		System.out.println(map);
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("일지매", 92);
		map2.put("전우치", 85);
		
		System.out.println(map2);
		
		map2.remove("일지매"); // 데이터 삭제
		map2.remove("전우치", 88); // 조건 2가지면 key - value가 일치해야 삭제함
		map2.remove("전우치", 85); // 조건 2가지면 key - value가 일치해야 삭제함
		
		System.out.println(map2);
		
		System.out.println("===== 조회, 검색 =====");
		
		System.out.println(map.isEmpty()); // 값이 비어있다면 true, 아니면 false
		System.out.println(map2.isEmpty());
		
		System.out.println(map.containsKey("을지문덕")); // Key 값에 "을지문덕" 값이 있으면 true, 아니면 false
		System.out.println(map.containsValue(88)); // value 값에 88 값이 있으면 true, 아니면 false
		
		System.out.println("===== 데이터 수정 =====");
		// {홍길동=77, 김유신=95, 계백=88, 강감찬=88}
		System.out.println(map);
		System.out.println(map.replace("홍길동", 99)); // 홍길동을 찾고 찾으면 99로 바꾼다(리턴값은 이전 데이터)
		System.out.println(map.replace("을지문덕", 99)); // 없는 조건을 실행하면 null을 리턴하고 끝난다(변동 없음)
		System.out.println(map);
		
		System.out.println("===== 전체 데이터 조회 key 값 =====");
		
		Set<String> keySet = map.keySet(); // map의 key 값만 넘긴다
		System.out.println(keySet);
		
		for (String key : keySet) {
			System.out.println(key + "-" + map.get(key));
		}
		
		System.out.println("===== 전체 데이터 조회 value 값 =====");
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		for (Integer value : values) {
			System.out.println(value);
		}
		
		System.out.println("=== 점수 합계 ===");
		int sum = 0;
		for (Integer value : values) {
			sum += value;
		}
		System.out.println(sum);
		System.out.println(map.size());
		
		System.out.println("=== entrySet() 사용 (key 값, value 값 동시 조회) ===");
		//---------------------- 1
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		//---------------------- 2
		Iterator<Entry<String, Integer>> ite = entrySet.iterator();
		while (ite.hasNext()) {
			Entry<String, Integer> entry = ite.next();
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
