package edu.java.mvc.controller;

import edu.java.mvc.model.Post;

public class PostDaoImpl implements PostDao {
	private static PostDaoImpl instance = null;
	
	private PostDaoImpl() {};
	
	public static PostDaoImpl getInstance() {
		if (instance == null) {
			instance = new PostDaoImpl();
		} 
		return instance;
	}
	
	// field
	private static final int MAX_LENGTH = 3; // 배열 길이(크기)
	private Post[] posts = new Post[MAX_LENGTH]; // 포스트 객체 저장 할 배열
	private int count = 0; // 배열에 현재까지 저장된 포스트 객체의 개수.
	
	/**
	 * 포스트 배열에 새로운 포스트 객체를 저장할 수 있는 지를 리턴.
	 * @return 배열에 빈 공간이 있으면 true, 없으면 false.
	 */
	public boolean isMemoryAvailable() {
		return count < MAX_LENGTH;
	}
	
	/**
	 * 어떤 인덱스가 검색, 수정, 삭제할 때 사용 가능한 범위 안에 있는 인덱스인지를 리턴.
	 * @param index 유효한 인덱스인지 검사할 인덱스.
	 * @return 사용 가능한 인덱스는 true, 아니면 false.
	 */
	public boolean isValidIndex(int index) {
		return (index >= 0) && (index < count);
	}
	
	
	// CRUD (create, read, update, delete)
	@Override
	public int create(Post p) {
		if (isMemoryAvailable()) {
			posts[count] = p;
			count++;
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public Post[] read() {
		Post[] arr = new Post[count]; // 전체 메모리 중 저장된 포스트만 보여주는 배열
		for (int i = 0; i < arr.length; i++) {
			arr[i] = posts[i];
		}
		return arr;
	}

	@Override
	public Post read(int index) {
		if (isValidIndex(index)) {
			return posts[index];
		} else {
			return null;
		}
	}

	@Override
	public int update(int index, Post post) {
		if (!isValidIndex(index)) {
			return 0;
		} 
		posts[index] = post;
//		posts[index].setTitle(post.getTitle());
//		posts[index].setContent(post.getContent());
//		posts[index].setAuthor(post.getAuthor());
//		posts[index].setCreatedTime(post.getCreatedTime());
//		posts[index].setModifiedTime(post.getModifiedTime());
		return 1;
		
	}

	@Override
	public int delete(int index) {
		if (!isValidIndex(index)) {
			return 0;
		}
		
		for (int i = index; i < count - 1; i++) {
			posts[i] = posts[i + 1];
		}
		posts[count - 1] = null;
		count--;
		return 1;
	}
	

	
}
