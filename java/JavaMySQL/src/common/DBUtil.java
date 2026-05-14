package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    // DB 접속 정보
    private static String url = "jdbc:mysql://localhost:3306/java_db";
    private static String user = "root";
    private static String password = "1234"; // 실제 비밀번호로 수정 확인!
	public static Connection get;
    // 데이터베이스 연결 객체를 반환하는 메서드
    public static Connection getConnection() {
        try {
            // 1. 연결 성공 시 Connection 객체를 바로 반환
            return DriverManager.getConnection(url, user, password);     
        } catch (Exception e) {
            // 2. 실패 시 에러 내용을 출력
            System.out.println("DB 연결 중 오류 발생!");
            e.printStackTrace();
        }        
        // 3. catch 블록을 타게 되면(실패하면) null을 반환
        return null;
    }
}