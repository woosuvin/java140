package edu.java.mvc.view;

import java.time.LocalDateTime;
import java.util.Scanner;

import javax.naming.directory.ModificationItem;

import edu.java.mvc.controller.PostDaoImpl;
import edu.java.mvc.menu.Menu;
import edu.java.mvc.model.Post;

public class PostMain {
	
	private Scanner scanner = new Scanner(System.in);
	private PostDaoImpl dao = PostDaoImpl.getInstance();
	
	public static void main(String[] args) {
		System.out.println("*** 포스팅 프로그램 ***");
		
		PostMain app = new PostMain();
		
		boolean run = true;
		while(run) {
			int n = app.showMainMenu();
			Menu menu = Menu.getValue(n);
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case CREATE_POST:
				app.insertNewPost();
				break;
			case ALL_POST:
				app.selectAllPost();
				break;
			case SELECT_POST:
				app.selectPost();
				break;
			case UPDATE_POST:
				app.updatePost();
				break;
			case DELETE_POST:
				app.deletePost();
				break;
			default:
				System.out.print("다시 입력하세요 >>> ");
			}
		}
		
		
		
	}
	
	private int showMainMenu() {
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("[0]종료 [1]새 포스트 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택 >>> ");
		int n = inputNumber();
		return n;
	}
	
	private int inputNumber() {
		while(true) {
			try {
				int n = Integer.parseInt(scanner.nextLine());
				return n;
			} catch (NumberFormatException e) {
				System.out.print("다시 입력하세요 >>> ");
			}
		}
	}
	
	// 1
	private void insertNewPost() {
		System.out.println("\n--- 새 포스트 저장 ---");
		
		if (!dao.isMemoryAvailable()) {
			System.out.println("! 저장 공간 부족 !");
			return;
		}
		System.out.print("제목 >>> ");
		String title = scanner.nextLine();
		System.out.print("내용 >>> ");
		String content = scanner.nextLine();
		System.out.print("글쓴이 >>> ");
		String author = scanner.nextLine();
		LocalDateTime createdTime = LocalDateTime.now();
		LocalDateTime modifiedTime = LocalDateTime.now(); // 어쩌지
		
		Post post = new Post(0, title, content, author, createdTime, modifiedTime);
		
		int result = dao.create(post);
		if (result == 1) {
			System.out.println("! 저장 성공 !");
		} else {
			System.out.println("! 저장 실패 !");
		}
	}
	
	// 2
	private void selectAllPost() {
		System.out.println("\n--- 포스트 전체 목록 ---");
		Post[] posts = dao.read();
		
		for (Post p : posts) {
			System.out.println(p);
		}
	}
	
	// 3
	private void selectPost() {
		System.out.println("\n--- 포스트 검색 ---");
		System.out.print("검색할 포스트 인덱스 입력 >>> ");
		int index = inputNumber();
		
		Post post = dao.read(index);
		
		if (post != null) {
			System.out.println(post);
		} else {
			System.out.println("! 해당 인덱스에는 저장된 포스트가 없습니다 !");
		}
	}
	
	// 4
	private void updatePost() {
		System.out.println("\n--- 포스트 수정 ---");
		System.out.print("수정할 포스트 인덱스 입력 >>> ");
		int index = inputNumber();
		
		if (!dao.isValidIndex(index)) {
			System.out.println("! 해당 인덱스에는 저장된 포스트가 없습니다 !");
			return; // 메서드 종료
		}
		Post before = dao.read(index);
		System.out.println("수정 전 > " + before);
		
		System.out.print("제목 >>> ");
		String title = scanner.nextLine();
		System.out.print("내용 >>> ");
		String content = scanner.nextLine();
		System.out.print("글쓴이 >>> ");
		String author = scanner.nextLine();
		LocalDateTime modifiedTime = LocalDateTime.now();
		LocalDateTime createdTime = null;
		
		Post after = new Post(0, title, content, author, createdTime, modifiedTime);
		int result = dao.update(index, after);
		if (result == 1) {
			System.out.println("! 업데이트 성공 !");
		} else {
			System.out.println("! 업데이트 실패 !");
		}
	}
	
	private void deletePost() {
		System.out.println("\n--- 포스트 삭제 ---");
		System.out.print("삭제할 포스트 인덱스 입력 >>> ");
		int index = inputNumber();
		
		if(!dao.isValidIndex(index)) {
			System.out.println("! 해당 인덱스에는 저장된 포스트가 없습니다 !");
			return;
		}
		
		int result = dao.delete(index);
		if(result == 1) {
			System.out.println("! 삭제 성공 !");
		} else {
			System.out.println("! 삭제 실패 !");
		}
	}
	

}
