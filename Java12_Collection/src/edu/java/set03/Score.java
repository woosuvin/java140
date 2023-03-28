package edu.java.set03;

import java.util.Objects;

public class Score {
	private int java;
	private int sql;
	private int web;
	
	public Score(int java, int sql, int web) {
		this.java = java;
		this.sql = sql;
		this.web = web;
	}
	
	@Override
	public String toString() {
		return String.format("Score ( java= %d, sql = %d, web = %d )", this.java, this.sql, this.web);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Score) { //obj가 Score타입의 객체라면
			Score other = (Score) obj;
			result = (this.java == other.java) && (this.sql == other.sql) && (this.web == other.web);
			return result;
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.java, this.sql, this.web); // java sql web을 가지고 hashcode를 만들어 달라. 괄호 안의 값이 같으면 hashcode()값이 같도록 override 한 것.
		// -> 각 점수를 비교했을 때 값이 같으면 hashcode가 같다.
//		return java + sql + web; -> 세 점수를 더한 값이 같으면 hashcode가 같다
	}
	
}
