package edu.java.map02;

import java.util.Set;
import java.util.TreeMap;

public class MapMain02 {

	public static void main(String[] args) {
		// 문자열을 key로 하고 정수를 value로 하는 TreeMap을 선언, 초기화(객체 생성)
		TreeMap<String, Integer> menu = new TreeMap<>();
		
		menu.put("묵은지참치김밥", 3000);
		menu.put("치즈김밥", 2500);
		menu.put("돈까스김밥", 2000);
		menu.put("라면", 4000);
		
		System.out.println(menu); // key의 오름차순으로 정렬
		
		System.out.println(menu.get("치즈김밥")); // -> 2500
		System.out.println(menu.get("김밥")); // -> null
		System.out.println(menu.getOrDefault("떡볶이", 0)); // -> 0
		
		// TreeMap은 정렬 알고리즘이 적용된 Map이기 때문에, 오름차순/내림차순 키 집합을 제공.
		Set<String> keySet = menu.keySet();
		for (String k : keySet) {
			System.out.println(k + ": " + menu.get(k));
		}
		System.out.println("--------------");
		
		Set<String> descKeySet = menu.descendingKeySet();
		for (String k : descKeySet) {
			System.out.println(k + ": " + menu.get(k));
		}
		
		
	}

}
