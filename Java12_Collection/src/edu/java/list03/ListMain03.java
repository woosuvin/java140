package edu.java.list03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain03 {

	public static void main(String[] args) {
		// 문자열들을 원소로 갖는 리스트 생성과 동시에 초기화.
		// Arrays.asList(...) -> argument로 전달된 값들을 원소로 갖는 리스트 객체를 생성.
		List<String> subjects = Arrays.asList("Java", "SQL", "HTML", "CSS", "JavaScript", "Servlet", "JSP", "Spring", "Python");
		System.out.println(subjects);

		// Ex 1) 리스트 subject에서 5글자 이상인 문자열들만 저장하는 리스트 만들고 출력.
		LinkedList<String> languages = new LinkedList<>(); // -> 빈 리스트 생성.
		// for - each
		for (String s : subjects) {
			if (s.length() >= 5) {
				languages.add(s);
			}
		}
		System.out.println(languages);
		
		// for
		LinkedList<String> languages2 = new LinkedList<>();
		for (int i = 0; i < subjects.size(); i++) {
			String word = subjects.get(i);
			if (word.length() >= 5) {
				languages2.add(word);
			}
		}
		System.out.println(languages2);
		
		// iterator
		LinkedList<String> languages3 = new LinkedList<>();
		Iterator<String> itr = subjects.iterator(); // subject 리스트의 원소들을 반복할 수 있는 iterator 생성.
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.length() >= 5) {
				languages3.add(s);
			}
		}
		System.out.println(languages3);
		
		// Ex 2) 리스트 subjects의 원소들의 글자수를 저장하는 리스트를 만들고 출력.
		LinkedList<Integer> wordLengths = new LinkedList<>();
		for (String s : subjects) {
			wordLengths.add(s.length());
		}
		System.out.println(wordLengths);
		
		
		// Ex 3) 정수(0, 1)를 저장하는 리스트를 생성.
		//       리스트 codes의 원소가 0이면 "Male", 1이면 "Female"을 원소로 갖는 리스트를 만들고 출력.
		List<Integer> codes = Arrays.asList(0, 1, 0, 0, 1, 1);
		System.out.println(codes);
		
		LinkedList<String> genders = new LinkedList<>();
		for (Integer c : codes) {
//			if (c == 0) {
//				genders.add("Male");
//			} else {
//				genders.add("Female");
//			}
			genders.add((c==0)? "Male" : "Female");
		}
		System.out.println(genders);
	}

}
