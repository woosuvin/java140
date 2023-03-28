package edu.java.map01;

import java.util.HashMap;
import java.util.Set;

/*
 * Collection<E>
 * |__ List<E>, Set<E> , ... Element(원소)
 * List, Set의 공통점: 한가지 타입의 객체들을 여러개 저장할 수 있는 데이터 타입.
 * List -> 인덱스 있음. 저장하는 순서가 중요(add 호출할 때마다 인덱스 자동 증가). 중복된 값을 저장할 수 있음.
 * Set  -> 인덱스 없음. 중복된 값을 저장할 수 없음.
 * 
 * Map<K, V>
 * |__ HashMap<K, V>, TreeMap<K, V>
 * Map: 키(key)와 값(value)의 쌍으로 구성된 데이터를 저장하는 데이터 타입.
 *      (예) 1-우수빈, 2-우수빈, 3-이혜민, ... 키int 값String
 *      (1) key: 중복된 값을 가질 수 없음. 연속된 값을 가질 필요는 없음. 구별만 가능하면 됨.
 *               리스트에서 인덱스와 같은 역할(데이터를 저장/검색/수정/삭제할 때 값을 찾기 위한 용도).
 *      (2) value: 중복된 값을 가질 수 있음.
 *      (3) HashMap: 검색을 빠르게 할 수 있는 Map.
 *      (4) TreeMap: 정렬을 빠르게 할 수 있는 Map.
 */


public class MapMain01 {

	public static void main(String[] args) {
		// 정수를 key로 하고, 문자열을 value로 하는 HashMap 변수 선언, 초기화(객체 생성)
		HashMap<Integer, String> students = new HashMap<>();
		
		// put(key, value): Map에 key-value 쌍의 데이터를 저장.
		students.put(1, "강효남");
		students.put(2, "김다훈");
		students.put(3, "김도현");
		students.put(20, "김다훈");
		
		System.out.println("map size: " + students.size());
		System.out.println(students);
		
		// get(key): key에 매핑된 value를 리턴. key에 매핑된 value가 없으면 null을 리턴.
		System.out.println(students.get(3)); // -> 김도현
		System.out.println(students.get(10)); // -> null
		
		// getOrDefault(key, defaultValue): key에 매핑된 value를 리턴. key에 매핑된 value가 없으면 defaultValue를 리턴. null이 나올 수 없는 메서드.
		System.out.println(students.getOrDefault(3, "무명"));
		System.out.println(students.getOrDefault(10, "무명"));
		
		// remove(key): key에 매핑된 key-value 원소를 삭제.
		students.remove(20);
		System.out.println("map size: " + students.size());
		System.out.println(students); // -> 20번 삭제.
		System.out.println(students.remove(1)); // -> 삭제된 key의 value를 리턴. 매핑된 value가 없으면 null 리턴.
		
		// put(key, value):
		// (1) Map에 key가 존재하지 않으면 key-value 데이터를 저장.
		// (2) Map에 Key가 존재하면, key에 매핑된 value를 변경.
		students.put(2, "kim");
		System.out.println(students);
		
		// Map에서 향상된 for문장을 사용하는 방법:
		Set<Integer> keySet = students.keySet(); // (1) Map의 key들로만 이루어진 set을 만듦.
		for (Integer k : keySet ) { // (2) key들을 처음부터 끝까지 순회하면서
			System.out.println(k + " " + students.get(k)); // (3) key에 매핑된 value를 찾음.
		}
	}

}
