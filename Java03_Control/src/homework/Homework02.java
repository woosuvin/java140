package homework;

public class Homework02 {

	public static void main(String[] args) {
        // 369 게임 출력
        /* 실행 결과
            1   2   *   4   5   *   7   8   *   10  
            11  12  *   14  15  *   17  18  *   20  
            21  22  *   24  25  *   27  28  *   *   
            *   *   *   *   *   *   *   *   *   40  
            41  42  *   44  45  *   47  48  *   50  
            51  52  *   54  55  *   57  58  *   *   
            *   *   *   *   *   *   *   *   *   70  
            71  72  *   74  75  *   77  78  *   80  
            81  82  *   84  85  *   87  88  *   *   
            *   *   *   *   *   *   *   *   *   100
         */
		
		// (1-1)
		int n;
		for (n = 1; n <= 100; n++) {
			int x = n % 10;  // 1의자리
			int y = n / 10;  // 10의자리
			
			if ((x==3 || x==6 || x==9) || (y==3 || y==6 || y==9) ) {
				System.out.print("*" + "\t");  // 숫자에 369가 들어가면 * 출력
			} else {
				System.out.print(n + "\t");  // 아니면 숫자 출력
			}
			
			if (n % 10 == 0) {
				System.out.println();  //줄바꿈
			}
				}
		
		System.out.println("-----------");
		
		// (1-2)		
		int x;
		for (x = 1; x <= 100 ; x++) {
			if ((x % 10) % 3 == 0) {  // 10, 20, 30 도 나머지 0 이므로 오류.
				System.out.print("*" + "\t");
			} else if (x / 10 == 3) {
				System.out.print("*" + "\t");
			} else if (x / 10 == 6) {
				System.out.print("*" + "\t");
			} else if (x / 10 == 9) {
				System.out.print("*" + "\t");
			} else {
				System.out.print(x + "\t");
			} 
			
			if (x % 10 == 0) {
				System.out.println();
			}					
		}
		
		System.out.println("-----------");
		
		// (2-1) 선생님 풀이
		for (n = 1; n <= 100; n++) {
			int n1 = n % 10; // n을 10으로 나눈 나머지 ->1의 자릿수
			int n10 = n / 10; // n을 10으로 나눈 몫 -> 10의 자릿수
			
			boolean condition1 = (n1 == 3) || (n1 == 6) || (n1 == 9); // 1의 자릿수가 3, 6, 9인 경우
			boolean condition2 = (n10 == 3) || (n10 == 6) || (n10 == 9); // 10의 자릿수가 3, 6, 9인 경우
			
			// 숫자를 출력할 것인지, "*"를 출력할 것인지.
			if (condition1 || condition2) {
				System.out.print("*\t"); // *
			} else { // 숫자
				System.out.print(n + "\t"); // 숫자
			}
			
			// 줄바꿈을 할것인지 아닌지. (!!!위의 if문과 별도로 분리해야됨!!!)
			if (n % 10 ==0) { // 10의 배수이면
				System.out.println();
			}
		} 
		
		System.out.println("-----별두개-----");
		
		// (2-2) 선생님 풀이
		for (n = 1; n <= 100; n++) {
			int n1 = n % 10; // n을 10으로 나눈 나머지 ->1의 자릿수
			int n10 = n / 10; // n을 10으로 나눈 몫 -> 10의 자릿수
			
			boolean condition1 = (n1 == 3) || (n1 == 6) || (n1 == 9); // 1의 자릿수가 3, 6, 9인 경우
			boolean condition2 = (n10 == 3) || (n10 == 6) || (n10 == 9); // 10의 자릿수가 3, 6, 9인 경우
			
			// 숫자를 출력할 것인지, "*"를 출력할 것인지.
			if(condition1 && condition2) {
				System.out.print("**\t"); // **
			}
			  else if (condition1 || condition2) {
				System.out.print("*\t"); // *
			} else { // 숫자
				System.out.print(n + "\t"); // 숫자
			}
			
			// 줄바꿈을 할것인지 아닌지. (!!!위의 if문과 별도로 분리해야됨!!!)
			if (n % 10 ==0) { // 10의 배수이면
				System.out.println();
			}
		} 
		
		
		
		
		
		

	}

}
