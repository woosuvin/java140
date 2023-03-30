package edu.java.file07;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private Score score;
	
	public Student () {}
	
	public Student (int id, String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public Student (int id, String name, int java, int web, int python) {
		this.id = id;
		this.name = name;
		this.score = new Score(java, web, python);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	@Override
	public String toString () { // Score 객체를 문자열로 만들어준 메서드가 있기 때문에 %s 가능.
		return String.format("Student ( ID = %d, NAME = %s, SCORE ( %s ) )", this.id, this.name, this.score);
	}
	
	
}
