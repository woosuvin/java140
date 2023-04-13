package edu.java.jdbc04;

import static edu.java.jdbc.model.Blog.Entity.*;
import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JdbcMain04 {

	public static void main(String[] args) {
		// JDBC delete
		
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// 오라클 드라이버 등록.
			DriverManager.registerDriver(new OracleDriver());
			
			// 오라클 DB에 접속(Connection).
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// SQL 문장(Statement) 준비.
			String sql = String.format("delete from %s where %s = ?", 
					TBL_NAME, COL_ID);
			System.out.println(sql);
			
			// SQL 문장을 실행할 수 있는 Statement 타입 객체 생성.
			stmt = conn.prepareStatement(sql);
			
			// 제목, 내용 입력 받기
			System.out.print("삭제할 글 번호 >>> ");
			Integer id = Integer.parseInt(scanner.nextLine());
			
			// SQL 문장에서 ? 부분을 채움.
			stmt.setInt(1, id);
			
			// SQL 문장 실행.
			int result = stmt.executeUpdate();
			System.out.println(result + "개 행이 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { // 사용했던 리소스들을 생성 순서의 반대로 해제(close).
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
