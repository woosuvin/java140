package edu.java.class07;

public class ClassMain07 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 Score 객체 생성.
		Score score1 = new Score();
		score1.java = 86;
		score1.sql = 79;
		score1.html = 56;
		
		// 기본 생성자를 사용해서 Student 객체를 생성.
		Student student1 = new Student(2017162026, "우수빈", score1);
		student1.printStudent();
		
		
		// argument를 갖는 생성자를 호출해서 Score 객체를 생성.
		Score score2 = new Score(51, 75, 90);
		score2.printScore();
		System.out.println("score2 총점: " + score2.getTotal());
		System.out.println("score2 평균: " + score2.getAverage());
		
		
		Student student2 = new Student(1, "우수빈", score2);
		student2.printStudent();
		
		
		Student student3 = new Student(2, "우수빈", null);
		student3.printStudent();
		
		Student student4 = new Student(3, "우수빈", 100, 100, 100);
		student4.printStudent();
		
		
		
		String emptyString = "   ";
		System.out.println("길이: " + emptyString.length());
    	// String nullString = null;
		// System.out.println("길이: " + nullString.length());
		// -> NullPointerException 발생
		// null : 생성된 객체가 없다.
		// 데이터 타입의 기본값: 
		// (1) boolean - false, (2) 정수 - 0, (3) 실수 - 0.0, (4) 참조(클래스)타입 - null

		

	}

}
