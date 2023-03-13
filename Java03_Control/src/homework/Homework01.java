package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
        // 가위바위보 게임
        // 가위-0, 바위-1, 보-2

        // 컴퓨터의 가위/바위/보는 (정수) 난수로 만듦.
        Random random = new Random();
        int computer = random.nextInt(3);

        // 사용자는 콘솔창에서 키보드로 가위/바위/보에 해당하는 정수를 입력.
        System.out.println("가위/바위/보 게임");
        System.out.println("-----------------");
        System.out.println("[0] 가위");
        System.out.println("[1] 바위");
        System.out.println("[2] 보");
        System.out.println("-----------------");
        System.out.print("선택>>> ");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        // print(computer : user)
        System.out.println("computer(" + computer + ") : user(" + user + ")");

        // TODO: 누가 이겼는 지 결과를 출력하세요.
        
        
        // (1)
        if (computer == 0 && user == 0) {
        	System.out.println("무승부");
        } else if (computer == 0 && user == 1) {
        	System.out.println("User 승");
        } else if (computer == 0 && user == 2) {
        	System.out.println("Computer 승");
        } else if (computer == 1 && user == 0) {
        	System.out.println("Computer 승");
        } else if (computer == 1 && user == 1) {
        	System.out.println("무승부");        	
        } else if (computer == 1 && user == 2) { 
        	System.out.println("User 승");        	
        } else if (computer == 2 && user == 0) {
        	System.out.println("User 승");
        } else if (computer == 2 && user == 1) {
        	System.out.println("Computer 승");        	
        } else if (computer == 2 && user ==2) {
        	System.out.println("무승부");
        }
        
        
        // (2-1) 선생님 풀이
        if (user == 0) {
        	if (computer == 0) {
        		System.out.println("무승부");
        	} else if (computer == 1) {
        		System.out.println("computer 승");
        	} else {
        		System.out.println("user 승");
        	}
        } else if (user == 1) {
        	if (computer == 0) {
        		System.out.println("user 승");
        	} else if (computer == 1) {
        		System.out.println("무승부");
        	} else {
        		System.out.println("computer 승");
        	}
        } else {
        	if (computer == 0) {
        		System.out.println("computer 승");
        	} else if (computer == 1) {
        		System.out.println("user 승");
        	} else {
        		System.out.println("무승부");
        	}
        }

        // (2-2) 선생님 풀이
        if (user == computer) { // 비기는 경우
        	System.out.println("무승부");
        } else if (user == 0) { // 비기지 않고, 사용자가 가위 낸 경우
        	if (computer == 1) { // 컴퓨터 바위
        		System.out.println("computer 승");
        	} else { //컴퓨터 보
        	    System.out.println("user 승");
        	}
        } else if (user == 1) { // 비기지 않고, 사용자가 바위 낸 경우
        	if (computer == 0) { // 컴퓨터 가위
        		System.out.println("user 승");
        	} else { // 컴퓨터 보
        		System.out.println("computer 승");
        	}
        } else { // 비기지 않고, 사용자가 보 낸 경우
        	if (computer == 0) { // computer 가위
        		System.out.println("computer 승");
        	} else { // computer 바위
        		System.out.println("user 승");
        	}
        }
        
        // (2-3) 선생님 풀이
        if (user == computer) { // 비긴 경우
        	System.out.println("무승부");
        } else if ((user==0 && computer==2) || (user==1 && computer==0) || (user==2 && computer==1)) { // 사용자가 이긴 경우
        	System.out.println("user 승");
        } else { // 컴퓨터가 이긴 경우
        	System.out.println("computer 승");
        }
        
        // (2-4) 선생님 풀이
        int diff = user - computer;
        if (diff == 0) { // 비긴 경우
        	System.out.println("무승부");
        } else if (diff == -2 || diff == 1) { // 사용자 이긴 경우
        	System.out.println("user 승");
        } else { // 컴퓨터 이긴 경우
        	System.out.println("computer 승");
        }
        
        
        
        
        
        
	}

}
