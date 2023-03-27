package edu.java.mvc.model;

import java.time.LocalDateTime;

public class Post {
	// field
	private int pid;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdTime; // 최초 작성 시간
    private LocalDateTime modifiedTime; // 수정 시간
    
    // constructor
    public Post() {}
    
    public Post(int pid, String title, String content, String author, LocalDateTime createdTime, LocalDateTime modifiedTime) {
    	this.pid = pid;
    	this.title = title;
    	this.content = content;
    	this.author = author;
    	this.createdTime = createdTime;
    	this.modifiedTime = modifiedTime;
    }

    // method
    public int getPid() {
		return pid;
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

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Override
	public String toString() {
		return "Post(pid = " + this.pid +
				", title = " + this.title +
				", content = " + this.content +
				", author = " + this.author +
				", time = " + this.modifiedTime +
				")";
	}
    
    
}
