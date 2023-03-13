package edu.java.conditional06;

import java.util.Random;

public class ConditionalMain06 {

	public static void main(String[] args) {
		// Random 타입의 변수를 선언하고 초기화.
		// java 과목 점수를 난수(0~100)로 만들어서 저장.
		// SQL 과목 점수를 난수(0~100)로 만들어서 저장.
		// HTML 과목 점수를 난수(0~100)로 만들어서 저장.
		// 합격 불합격 여부 출력.
		// 합격 조건: 세 과목 점수가 모두 40점 이상, 세 과목 평균이 60점 이상.
		
		Random random = new Random();
		
		int java = random.nextInt(101);
		System.out.println("JAVA점수: " + java);
		
		int sql = random.nextInt(101);
		System.out.println("SQL점수: " + sql);
		
		int html = random.nextInt(101);
		System.out.println("HTML점수: " + html);
		
		double avg = (java + sql + html) / 3.0;   // double avg = (double) (java + sql + html) / 3; -> casting 방법
		System.out.println("평균: " + avg);
		
		// (1)
		if (java >= 40 && sql >= 40 && html >= 40) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		if (avg >= 60.0) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// (2)
		if (java >= 40 && sql >= 40 && html >= 40 && avg >= 60.0) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// (3) 삼항연산자
		String result = (java >= 40 && sql >= 40 && html >= 40 && avg >= 60.0) ? "합격" : "불합격";
		System.out.println(result);
		
		/* 중첩 조건문
		 * if (java >= 40 && sql >= 40 && html >= 40) {
		 *     if (avg >= 60) {
		 *         합격;
		 *     } else {
		 *         불합격;
		 *     }
		 * } else {
		 *     불합격;
		 * }    
		 */
		
		
			
		}
		

	}


