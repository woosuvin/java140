package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;

public class FileMain07 {

	public static void main(String[] args) {
		// TODO 
		// 1. ArrayList<Student> 객체 생성
		// 2. 1,000,000개의 Student 객체를 리스트에 저장 (random 사용)
		
		Random random = new Random();
		
//		내 풀이		
//		ArrayList<Score> scores = new ArrayList<>();
//		for (int i = 0; i < 1_000_000; i++) {
//			Score s = new Score(random.nextInt(101), random.nextInt(101), random.nextInt(101)); 
//			scores.add(s);
//		}
//		
//		ArrayList<Student> students = new ArrayList<>();
//		for (int i = 0; i < 1_000_000; i++) {
//			Student n = new Student(i, "name_" + i, scores.get(i));
//			students.add(n);
//		}
		
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			Score score = new Score(random.nextInt(101), random.nextInt(101), random.nextInt(101));
			Student student = new Student(i, "NAME_" + i, score);
			students.add(student);
		}
		
		
		// 3. 리스트를 student.dat 파일에 직렬화해서 씀
		String file = "data/student.dat";
		
		try (FileOutputStream out = new FileOutputStream(file); // 파일에 데이터를 쓸 수 있는 통로
				BufferedOutputStream bout = new BufferedOutputStream(out); // 메모리에 데이터를 쓸 수 있는 통로
				ObjectOutputStream oout = new ObjectOutputStream(bout);) { // object를 직렬화해서 쓸 수 있는 통로
			
			long start = System.currentTimeMillis();
			
			oout.writeObject(students); // students 리스트를 쓰겠다. 직렬화(serialize). write 하려는 객체의 모든 필드들이 직렬화 되어야 함.
			
			long end = System.currentTimeMillis();
			System.out.println("write time: " + (end - start) + "ms");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 4. 파일에서 데이터를 읽어서 역직렬화 -> 읽은 데이터 확인
		try (FileInputStream in = new FileInputStream(file); // file에서 읽는다.
				BufferedInputStream bin = new BufferedInputStream(in); // file을 메모리에서 읽어들이기 위한 통로
				ObjectInputStream oin = new ObjectInputStream(bin);) { 
			
			long start = System.currentTimeMillis();
			
			ArrayList<Student> result = (ArrayList<Student>) oin.readObject(); // file에 있는 내용을 읽어들여서 result에 저장하겠다.
			
			long end = System.currentTimeMillis();
			System.out.println("read time: " + (end - start) + "ms");
			
			// 데이터 확인
			int index = random.nextInt(1_000_000);
			System.out.println(students.size());
			System.out.println(students.get(index));
			
			System.out.println(result.size());
			System.out.println(result.get(index));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}

}
