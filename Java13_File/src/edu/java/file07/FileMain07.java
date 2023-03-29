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
		int java = random.nextInt(101);
		int web = random.nextInt(101);
		int python = random.nextInt(101);
		
		ArrayList<Score> scores = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			Score s = new Score(java, web, python); 
			scores.add(s);
		}
		
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			Student n = new Student(i, "name_" + i, scores.get(i));
			students.add(n);
		}
		
		System.out.println(students.size());
		System.out.println(students.get(3033));
		
		// 3. 리스트를 student.dat 파일에 직렬화해서 씀
		String file = "data/student.dat";
		
		try (FileOutputStream out = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);) {
			oout.writeObject(students);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 4. 파일에서 데이터를 읽어서 역직렬화 -> 읽은 데이터 확인
		try (FileInputStream in = new FileInputStream(file);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream oin = new ObjectInputStream(bin);) {
			
			ArrayList<Student> result = (ArrayList<Student>) oin.readObject();
			System.out.println(result.size());
			System.out.println(result.get(3033));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
