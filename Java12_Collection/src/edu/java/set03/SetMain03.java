package edu.java.set03;

import java.util.HashSet;

public class SetMain03 {

	public static void main(String[] args) {
		// Set<E>은 중복된 값을 저장하지 않음.
		HashSet<String> set = new HashSet<>();
		set.add("hello");
		set.add("olleh");
		set.add("hello");
		
		System.out.println(set);
		
		// Score 타입을 원소로 갖는 HashSet 변수 선언, 초기화
		HashSet<Score> scores = new HashSet<>();
		
		Score score1 = new Score(100, 100, 100); // Score 객체 생성
		scores.add(score1); // Score 객체를 Set에 저장
		
		Score score2 = new Score(90, 90, 90);	
		System.out.println("s1 s2 eq? - " + score1.equals(score2));
		scores.add(score2);
		
		Score score3 = new Score(100, 100, 100); // 주솟값들은 새로 생성할 때마다 다르므로 score1과 다름.
		System.out.println("s1 s3 eq? - " + score1.equals(score3));
		scores.add(score3);
		// -> (1) equals만 override를 하고 haseCode를 override하지 않으면 score3이 Set에 추가됨.
		// -> (2) equals와 hashcode를 모두 적절하게 override하면 score3은 Set에 추가되지 않음.
		
		// equals()가 true이면 hashcode() 리턴값이 같다.
		// hashcode() 리턴값이 다르면 equals()가 false이다.
		// Set은 두 객체의 중복 여부를 검사할 때 hashcode()를 먼저 비교하고,
		// hashcode()가 같으면 equals() 메서드를 호출해서 중복여부를 검사함!
		
		System.out.println(scores);
	}

}
