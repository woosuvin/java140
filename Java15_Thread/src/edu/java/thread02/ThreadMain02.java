package edu.java.thread02;

/*
 * 자바는 다중 상속을 지원하지 않음.
 *   class A extends B, C { ... } -> 문법 오류.
 * 다른 클래스를 이미 상속하고 있는 클래스는 Thread도 상속할 수 없음.
 * 자바는 인터페이스 구현은 개수 제한이 없음.
 *   class A extend B implements C, D { ... } -> 가능.
 *   
 * Thread 사용 방법 2:
 * 1. Runnable 인터페이스를 구현하는 클래스를 선언(정의)
 * 2. 구현 클래스에서 Runnable 인터페이스의 run 메서드를 override 재정의 -> thread가 할 일
 * 3. Thread 생성자를 호출할 때 Runnable 구현 객체를 argument로 전달
 *    Thread(new Runnable runnable) 생성자 호출 -> thread 객체 생성
 * 4. Thread 객체의 start 메서드를 호출 -> thread 실행 -> run 메서드 자동 실행
 */

public class ThreadMain02 {

	public static void main(String[] args) {
		// (1) Runnable 인터페이스 구현 클래스
		class MyRunnable implements Runnable {
			private String name;
			
			public MyRunnable(String name) {
				this.name = name;
			}
			
			@Override // (2) run 메서드 override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(i + " - " + name);
					try {
						Thread.sleep(10); // 0.01초 쉼.
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end for
			} // end run
		} // end MyRunnable
		
		// (3) Thread 객체 생성
		Thread th1 = new Thread(new MyRunnable("안녕하세요"));
		
		// (3-1) 익명 클래스를 사용해서 Thread 객체 생성
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(i + " - 안녕");
					try {
						Thread.sleep(10); // 0.01초 쉼.
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end for
			} // end run
		}); // end Thread
		
		//  (3-2) 람다 표현식을 사용해서 Thread 객체 생성
		Thread th3 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(i + " - Lambda");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // end for
		}); // end Thread
		
		// (4) Thread 실행
		long start = System.currentTimeMillis();
		th1.start();
		th2.start();
		th3.start();
		try { // 실행된 thread가 끝날 때까지 메인 메서드는 기다림.
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("경과 시간: " + (end - start) + "ms");
		
		System.out.println("*** main 메서드 종료 ***");
	} // end main

}
