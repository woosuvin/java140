package edu.java.thread01;

/*
 * Thread 사용 방법 1:
 * 1. Thread를 상속하는 클래스를 선언(정의)
 * 2. Thread를 상속하는 클래스에서 run() 메서드를 override -> thread가 할 일.
 * 3. Thread를 상속하는 클래스의 객체 생성
 * 4. 생성된 객체에서 start() 메서드를 호출
 *    (주의) override 한 run() 메서드를 직접 호출하면 thread가 실행되지 않음.
 *    start() 메서드 호출 -> thread 초기화(메모리 할당, ...) -> run() 메서드 실행.
 */

public class ThreadMain01 {

	public static void main(String[] args) {
		// local (inner) class (지역 클래스)
		class MyThread extends Thread { // (1) Thread를 상속하는 클래스를 선언(정의)
			// field
			private String name;
			
			// constructor
			public MyThread(String name) {
				this.name = name;
			}
			
			// method
			@Override // (2) run() 메서드를 override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i + " - " + name);
					try {
						sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				} // end for
			} // end run
		} // end MyThread
		
		// (3) Thread를 상속하는 클래스의 객체 생성
		MyThread th1 = new MyThread("스레드");
		MyThread th2 = new MyThread("오쌤");
		
		// (4) Thread 실행 -> start() 메서드 호출
		long start = System.currentTimeMillis();
		th1.start();
		th2.start();
		try { // Thread가 종료할 때까지 main thread는 기다리겠다(밑의 코드를 진행하지 않겠다)
			th1.join(); 
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("경과 시간: " + (end - start) + "ms");
		
		System.out.println("*** main 메서드 종료 ***");
	} // end main

}
