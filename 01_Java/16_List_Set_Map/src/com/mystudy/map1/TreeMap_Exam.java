package com.mystudy.map1;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMap_Exam {

	public static void main(String[] args) {
		// Map<K, V> 인터페이스 : 키(key)-값(value) 쌍으로 데이터 저장 관리
		// - 특징 : 순서가 없다
		// - 키(key) : 중복 안됨(중복값 없이 유일한 데이터)
		// - 값(value) : 중복 데이터 저장 가능
		//-----------------------------------
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		// 입력
		map.put("홍길동", 100);
		map.put("김유신", new Integer(95));
		map.put("강감찬", 88);
		System.out.println(map.put("계백", 88));
		// 키값이 같은 데이터 입력시 기존 데이터가 사라지고 새로운 데이터 입력
		// 리턴값 : 기존 데이터(value)
		System.out.println(map.put("홍길동", 77)); //동일데이터 있으면 수정처리
		System.out.println(map);
		
		System.out.println("-------");
		TreeMap<String, Integer> map2 = new TreeMap<>();
		map2.put("전우치", 85);
		map2.put("일지매", 92);
		System.out.println(map2);
		
		// 삭제
		map2.remove("일지매"); //데이터 삭제
		map2.remove("전우치", 88); //key-value 일치하는 경우 삭제
		map2.remove("전우치"); 
		System.out.println(map2);
		System.out.println("---");
		
		System.out.println("map.isEmpty(): " + map.isEmpty());
		System.out.println("map2.isEmpty(): " + map2.isEmpty());
		
		// 데이터 조회(검색)
		System.out.println("map.get(\"홍길동\"): " + map.get("홍길동"));
		System.out.println("map.containsKey(\"을지문덕\"): " 
				+ map.containsKey("을지문덕"));
		System.out.println("map.containsValue(88): " 
				+ map.containsValue(88));
		//-------------------------------
		
		//데이터 수정
		System.out.println("--------");
		//{홍길동=77, 김유신=95, 계백=88, 강감찬=88}
		System.out.println("map : " + map);
		System.out.println("map.replace(\"홍길동\", 99): "
				+ map.replace("홍길동", 99));
		System.out.println("map.replace(\"을지문덕\", 99): "
				+ map.replace("을지문덕", 99));
		System.out.println("map : " + map);
		
		System.out.println("====== Map 전체 데이터 조회 ====");
		System.out.println("==== keySet() 사용 =====");
		Set<String> keySet = map.keySet();
		System.out.println("keySet() : " + keySet);
		
		for (String key : keySet) {
			System.out.println(key + "-" + map.get(key));
		}
		System.out.println("-----");
		//(개인적) iterator() 사용방식
		
		System.out.println("==== values() 사용 =====");
		Collection<Integer> values = map.values();
		System.out.println("values: " + values);
		
		for (Integer value : values) {
			System.out.println("점수: " + value);
		}
		System.out.println("--- 점수합계 ---");
		int sum = 0;
		for (Integer value : values) {
			sum += value;
		}
		System.out.println("::: 점수합계 : " + sum);
		System.out.println("map.size(): " + map.size());
		System.out.println();
		
		System.out.println("===== entrySet() 사용 ======");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("entrySet: " + entrySet);
		
		//(개인적)개선된 for문 형태로 
		
		Iterator<Entry<String, Integer>> ite = entrySet.iterator();
		while (ite.hasNext()) {
			Entry<String, Integer> entry = ite.next();
			System.out.println("key: " + entry.getKey() + 
					"value: " + entry.getValue());
		}
		
		
	}

}






