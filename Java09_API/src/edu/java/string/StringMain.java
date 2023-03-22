package edu.java.string;

public class StringMain {

	public static void main(String[] args) {
		// Ex 1. 아래의 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
		// (1) 
		String ssn = "991231-1234567";
		char ch = ssn.charAt(7);
		System.out.println(ch);
		
		// (2)
		String[] array = ssn.split("-"); // ssn 문자열을 "-"구분자를 사용해서 나눔.
		System.out.println(array[0]); // 9912321
		System.out.println(array[1]); // 1234567
		System.out.println(array[1].charAt(0)); // array[1]의 0번째 위치의 문자.
		
		// Ex 2. 아래의 문자열 배열에서 "홍길동" 문자열이 처음 등장하는 인덱스를 출력.
		//       만약에 "홍길동" 문자열이 배열에 없으면, -1을 출력.
		String[] names = {"오쌤", "John", "홍길동", "Jane", "허균", "홍길동"};
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("홍길동")) {
				index = i;
				break;
			} 
		} 
		System.out.println("홍길동 인덱스: " + index);
		
//		for (int i = 0; i < names.length; i++) {
//			String s = names[i];
//			if (s.equals("홍길동")) {
//				System.out.println(i);
//			} else {
//				System.out.println(-1);
//			}
//		}
		
		// Ex 3. 아래의 문자열 배열에서 5글자 이상인 문자열들을 찾아서 출력. 492p
		String[] languages = {"Java", "SQL", "HTML", "CSS","JavaScript", "Python"};
		// (1)
		for (String s : languages) {
			int length = s.length();
			if (length >= 5) {
				System.out.print(s + " ");
			}
		}
		System.out.println();
		
		// (2) 
		for (String s : languages) {
			if (s.length() >= 5) {
				System.out.print(s + " ");
			}
		}
		System.out.println();
		
		// Ex 4. 아래의 문자열 배열에서 대소문자 구별 없이"est"가 포함된 문자열들을 찾아서 출력. 반복문. 메서드2. 구글링
		String[] tests = {"TEST", "test", "TeSt", "tEST", "테스트"};
		// (1)
		for (String t : tests) {
			String low = t.toLowerCase();
			if (low.contains("est")) {
				System.out.print(t + " ");
			}
		} 
		System.out.println();
		
		// (2)
		for (String t : tests) {
			if (t.toLowerCase().contains("est")) {
				System.out.print(t + " "); 
			}
		}
		System.out.println();
		
		// (오답)
//		for (String t : tests) {
//			if (t.contains("est")) {
//				System.out.println(t);
//			}
//		}
		
		// Ex 5. 아래의 "YYYY-MM-DD" 형식의 날짜 문자열에서 연/월/일 정보를 각각의 int 타입 변수에 저장하고 출력. 
		String date = "2023-03-22";
		String[] dateString = date.split("-");
		
		int year = Integer.parseInt(dateString[0]);
		int month = Integer.parseInt(dateString[1]);
		int day = Integer.parseInt(dateString[2]);
		
		System.out.println("year: " + year);
		System.out.println("month: " + month);
		System.out.println("day: " + day);
		
//		String year = date.substring(0, 4);
//		System.out.println(year);
//		String month = date.substring(5, 7);
//		System.out.println(month);
//		String day = date.substring(8, 10);
//		System.out.println(day);
		
		
	}

}
