package edu.java.class07;

public class Student {
	// field
	int stuNo; // 학생 번호(학번)
	String name; // 학생 이름
	Score score; // 학생의 시험 점수 (java, sql, html)
	
	// constructor
	// (1) 기본 생성자
	public Student() {}
	
	// (2) stuNo, name, score를 초기화 할 수 있는 생성자
	public Student(int stuNo, String name, Score score) {
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
	}
	
	public Student(int stuNo, String name, int java, int sql, int html) {
		this.stuNo = stuNo;
		this.name = name;
		this.score = new Score(java, sql, html);
	}
	
	// method
	// printStudent - 학번, 이름, 세 과목 점수, 총점, 평균을 출력하는 메서드
	public void printStudent() {
		System.out.println("--- 학생 정보 ---");
		System.out.println("학번: " + stuNo);
		System.out.println("이름: " + name);
//		System.out.printf("java: %d, sql: %d, html: %d \n", score.java, score.sql, score.html);
		if (this.score != null) { // score가 null이 아니면5
			score.printScore();
			System.out.println("총점: " + score.getTotal());
			System.out.println("평균: " + score.getAverage());
		} else {
			System.out.println("점수 없음");
		}
		System.out.println("-----------------");
	}
	
	
	
}
