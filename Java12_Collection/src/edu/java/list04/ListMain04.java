package edu.java.list04;

import java.util.ArrayList;

public class ListMain04 {
	
	public static void main(String[] args) {
		// User 타입을 저장하는 ArrayList 타입 변수 선언, 객체 생성.
		
		ArrayList<User> users = new ArrayList<>();
	
		// 3개의 user 객체를 ArrayList에 저장.
		users.add(new User("aaa", "aaa")); // -> 바로 생성자 호출한 것.
		users.add(new User("bbb", "bbb"));
		users.add(new User("ccc", "ccc"));
		
//		User user1 = new User("aaa", "aaa");
//		users.add(user1);
//		User user2 = new User("bbb", "bbb");
//		users.add(user2);
//		User user3 = new User("ccc", "ccc");
//		users.add(user3);		
		
		// ArrayList 내용 출력.
		System.out.println(users);
//		System.out.println(users.get(0).getId() + users.get(0).getPassword()); -> toString을 override 하지 않으면 이렇게 해야됨.
		
		// 리스트 users에서 인덱스 0번 위치의 원소 삭제
		users.remove(0);
		System.out.println(users);
		
		// id가 "ccc"인 첫번째 User 객체를 리스트에서 삭제
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals("ccc")) {
				users.remove(i);
				break; // -> 첫번째만 삭제해야 하므로 break
			}
		}
		System.out.println(users);
		
	}
	
	


}
