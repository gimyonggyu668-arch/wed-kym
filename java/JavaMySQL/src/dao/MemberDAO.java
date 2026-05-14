package dao;

import java.sql.Connection;          // 추가 필요
import java.sql.PreparedStatement;   // 추가 필요
import java.sql.ResultSet;           // 추가 필요
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBUtil;
import dto.MemberDTO;

public class MemberDAO {
   
   // 리스트를 메서드 밖(멤버 변수)에 두면 호출할 때마다 데이터가 누적될 수 있습니다.
   // 조회할 때마다 새로운 결과를 보여주고 싶다면 메서드 안으로 옮기는 것이 좋습니다.
   private List<MemberDTO> list = new ArrayList<>();

   public void findAll() {
      String sql = "select * from member";
      
      // 기존 list 비우기 (조회 시마다 데이터 중복 방지)
      list.clear();

      try (
         Connection conn = DBUtil.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
      ) {
         
         while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            int age = rs.getInt("age");
            
            list.add(new MemberDTO(id, name, email, age));
         }
         
         // 데이터가 없는 경우를 위한 처리
         if (list.isEmpty()) {
            System.out.println("조회된 회원 정보가 없습니다.");
         } else {
            list.forEach(x -> {
               System.out.println("ID : " + x.getId());
               System.out.println("이름 : " + x.getName());
               System.out.println("이메일 : " + x.getEmail());
               System.out.println("나이 : " + x.getAge());
               System.out.println("------------------");
            });
         }
         
      } catch (Exception e) {
         // 예외 발생 시 원인을 파악할 수 있도록 stackTrace를 출력하는 것이 좋습니다.
         e.printStackTrace();
      }
   }
      
   //추가
   public void insertMember(MemberDTO dto) {
	   String sql = "INSERT INTO member(name,email,age) values(?,?,?)";
	   //매개변수를 통해 넘겨받은 dto를 member 테이블에 추가하기
	   try (
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			  	){	 
		   	pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setInt(3, dto.getAge());
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "행 추가 완료");
	   } catch (Exception e) {
		   
   //수정
	
   
   //삭제
	  }
   }
}