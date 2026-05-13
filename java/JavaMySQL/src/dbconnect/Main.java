package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "root";
        String password = "1234";
        
         //select, insert, update, delete 
        //실행할 sql을 작성
        // ?는 값이 들어갈 자리 (placeholder)
        String sql = "INSERT INTO member(name, email, age) values(?,?,?)";
        
        try (//MySQL 서버와 실제 연결을 생성한다.
        	Connection conn = DriverManager.getConnection(
        	url, 
        	user, 
        	password);
        	//SQL을 안전하고 효율적으로 실행하기 위한 객체 
        	PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            
            System.out.println("MySQL 연결 성공");
            //? 부분에 데이터 채우기
            pstmt.setString(1, "이영희");
            pstmt.setString(2, "yonghee@test.com");
            pstmt.setInt(3, 25);
            
            //SQL 실행
            //executeUpdate() : insert, update, delete시에 사용
            //executeQuery() : select시 사용 
            pstmt.executeUpdate();
            
            System.out.println("추가 성공");
            
        }   catch (SQLException e) {
            System.out.println("연결 실패");
            e.printStackTrace();
        } 
        
       
        
        
        
        
        
    }
}