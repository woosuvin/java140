package edu.java.conditional03;

import java.util.Scanner;

public class ConditionalMain03 {

	public static void main(String[] args) {
		/* 간단한 성적 처리 프로그램:
		 * Scanner를 사용해서 세 과목(java, sql, html)의 점수를 입력받고 변수에 저장.
		 * 세 과목의 총점을 계산하고 출력.
		 * 세 과목의 평균을 계산하고 출력.
		 * 학점(A, B, C, D, F)를 출력.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Java>>> ");		
		int x = sc.nextInt();
		System.out.println("Java= " + x);
		
		System.out.println("Sql>>> ");		
		int y = sc.nextInt();
		System.out.println("Sql= " + y);
		
		System.out.println("Html>> ");
		int z = sc.nextInt();
		System.out.println("Html= " + z);
		
		int result = x + y + z;
		System.out.println("총점= " + result);
	    double avg = (x + y+ z)/3.0;
		System.out.println("평균= " + avg);
		
		if (avg > 90) {
			System.out.println("학점= A");
		} else if(avg > 80) {
			System.out.println("학점= B");
		} else if(avg > 70) {
			System.out.println("학점= C");
		} else if(avg > 60) {
			System.out.println("학점= D");
		} else {
			System.out.println("학점= F");
		}
		
		
		
		
		
			
		} 
		
	}


