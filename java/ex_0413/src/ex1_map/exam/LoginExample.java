package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		//아이디와 비밀번호를 저장한다.
		//둘 다 String
		//아이디와 비밀번호를 입력해서 로그인을 시도할 때 
		//아이디가 존재하지 않습니다.
		//비밀번호 오류입니다.
		//로그인 성공
		Map<String, String> users = new HashMap<String, String>();
		users.put("admin", "1234");
        users.put("user1", "abcd");
        users.put("guest", "1111");
		
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	
        
        	System.out.println("아이디를 입력하십시오: ");
        	String id = sc.nextLine();
        	 if (users.containsKey(id)) {
        		 System.out.println("비밀번호를 입력하십시오: ");
        		 String password = sc.nextLine();
        		 if (users.get(id).equals(password)) {
             		System.out.println("로그인에 성공하셨습니다.");
             		break;
             	}else {
             		System.out.println("비밀번호가 오류입니다.");
             	}
             		
        	 }else {
        		 System.out.println("존재 하지않는 아이디 입니다.");
        		 
        	 }
        }
	}
}
