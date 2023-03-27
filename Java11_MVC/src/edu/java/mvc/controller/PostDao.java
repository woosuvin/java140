package edu.java.mvc.controller;

import edu.java.mvc.model.Post;

public interface PostDao {
	/**
	 * 새 포스트 저장 기능. 포스트 객체를 배열에 저장
	 * @param p 배열에 저장할 포스트 객제.
	 * @return 배열에 저장 성공하면 1, 실패하면 0.
	 */
	int create(Post p); // 리턴타입 int, argument Post
	
	/**
	 * 포스트 전체 보기 기능. 저장된 포스트 개수 크기의 연락처 배열을 리턴.
	 * @return 포스트 배열(Post[])
	 */
	Post[] read();
	
	/**
	 * 인덱스로 검색. argument로 전달받은 인덱스 위치에 있는 연락처 객체를 리턴.
	 * @param index 검색할 인덱스. 0 이상의 정수.
	 * @return 해당 인덱스의 포스트(Post 타입) 객체 또는 null.
	 */
	Post read(int index);
	
	/**
	 * 인덱스 수정 기능
	 * @param index 수정할 포스트 인덱스. 0 이상 ~ 저장된 포스트 개수보다 작은 정수.
	 * @param post 수정할 포스트 정보를 가진 객체.
	 * @return 수정 성공하면 1, 실패하면 0.
	 */
	int update(int index, Post post);
	
	/**
	 * 포스트 삭제 기능.
	 * @param index 삭제할 포스트의 인덱스. 0 이상 ~ 저장된 포스트 개수보다 작은 정수.
	 * @return 삭제 성공하면 1, 실패하면 0.
	 */
	int delete(int index);
}
