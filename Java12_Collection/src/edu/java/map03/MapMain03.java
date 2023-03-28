package edu.java.map03;

import java.util.HashMap;
import java.util.TreeMap;

public class MapMain03 {

	public static void main(String[] args) {
		// 단어 개수 세기(word counting):
        // 문자열에 등장하는 단어를 key로 하고, 그 단어의 등장 횟수를 value로 하는 Map을 만들고 출력하세요.
        // 결과> {하늘=3, 땅=2, sky=2}
        String sentence = "하늘 땅 하늘 땅 하늘 sky sky";
        String[] array = sentence.split(" ");
        
        TreeMap<String, Integer> words = new TreeMap<>();
        
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//        	if (array[i].equals("하늘")) {
//        		words.put("하늘", count);
//        		count++;
//        	} 
//        	else if (array[i].equals("땅")) {
//        		words.put("땅", count);
//        		count++;
//        	} 
//        	else if (array[i].equals("sky")) {
//        		words.put("sky", count);
//        		count++;
//        	}	
//        }
        
//        TreeMap<Integer, String> words = new TreeMap<>();
//        for (int i = 0; i < array.length; i++) {
//        	words.put(i, array[i]);
//        }
//        System.out.println(words);
        
        
        
        
        // 문자열을 공백을 기준으로 자름.
        String[] arr = sentence.split(" ");
        
        // 단어(key)-빈도수(value) 저장하는 Map 변수를 선언, 초기화(객체 생성).
        HashMap<String, Integer> wordCounts = new HashMap<>();
        
        for (String x : arr) { // 배열의 첫번째 원소부터 마지막 원소까지 순서대로 반복하면서
        	Integer count = wordCounts.get(x); // 배열의 단어x에 매핑된 값(빈도수)를 찾음.
        	if (count == null) { // 단어에 매핑된 빈도수가 없을 때
        		wordCounts.put(x, 1);
        	} else { // 단어에 매핑된 빈도수가 있을 때
        		wordCounts.put(x, count + 1);
        	}
        	System.out.println(wordCounts);
        }
        
        HashMap<String, Integer> wordCounts2 = new HashMap<>();
        for (String x : arr) {
        	Integer count = wordCounts2.getOrDefault(x, 0); // x라는 key값이 있으면 count, 없으면(Map에 아무것도 없으면) 0 리턴.
        	wordCounts2.put(x, count + 1);
        }
        System.out.println(wordCounts2);
        
        
	}

}
