package edu.java.jdbc.model;

import java.time.LocalDateTime;

// MVC 아키텍쳐에서 Model에 해당하는 클래스.
// 데이터베이스에서 정의된 테이블의 모양을 자바 클래스로 선언하기 위해서.
// 테이블의 컬럼들을 클래스의 필드로 선언.

public class Blog { 
	
	// 테이블 이름과 컬럼 이름들을 상수로 정의.
	public interface Entity {
		String TBL_NAME = "BLOGS";
		String COL_ID = "ID";
		String COL_TITLE = "TITLE";
		String COL_CONTENT = "CONTENT";
		String COL_AUTHOR = "AUTHOR";
		String COL_CREATED_TIME = "CREATED_TIME";
		String COL_MODIFIED_TIME = "MODIFIED_TIME";
	}
	
	// field
	private Integer id; // 글 번호. primary key.
	private String title; // 글 제목. not null.
	private String content; // 글 내용. not null.
	private String author; // 글 작성자. not null.
	private LocalDateTime createdTime; // 글 최초 작성 시간.
	private LocalDateTime modifiedTime; // 글 수정 시간.
	
	// constructor
	public Blog () {}

	public Blog(Integer id, String title, String content, String author, LocalDateTime createdTime, LocalDateTime modifiedTime) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}
	
	
	// method
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreatedTIme() {
		return createdTime;
	}

	public void setCreatedTIme(LocalDateTime createdTIme) {
		this.createdTime = createdTIme;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
	@Override
	public String toString() {
		return String.format("Blog | id: %d, title: %s, content: %s, author: %s, createdTime: %s, modifiedTime: %s", 
				this.id, this.title, this.content, this.author, this.createdTime, this.modifiedTime);
	}
	
}
