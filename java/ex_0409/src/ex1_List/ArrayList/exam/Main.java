package ex1_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		List<UserInfo> u = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTurn;
		
		for(int i = 0; i < 3; i++) {
		    System.out.println("아이디 입력: ");
		    String name = sc.next();
		    System.out.println("비밀번호 입력: ");
		    int password = sc.nextInt();

		    // 1. 중복 체크를 위한 깃발(Flag)
		    boolean isDuplicate = false;

		    // 2. 이미 저장된 리스트(u)를 샅샅이 뒤짐
		    for(UserInfo existing : u) {
		        if(existing.getUser().equals(name)) {
		            isDuplicate = true;
		            break; // 중복을 찾았으니 더 돌 필요 없음
		        }
		    }

		    if(isDuplicate) {
		        System.out.println("이미 있는 아이디입니다. 다시 입력하세요.");
		        i--; // 중복이면 횟수를 까서 다시 입력받게 함 (시험 단골 로직)
		        continue; 
		    }

		    // 3. 중복이 아닐 때만 객체를 만들고 리스트에 추가
		    UserInfo user = new UserInfo();
		    user.setUser(name);
		    user.setPa(password);
		    u.add(user);

		    // 4. 전체 리스트 출력
		    System.out.println("=== 현재 사용자 명단 ===");
		    for(UserInfo na : u) {
		        System.out.println("ID: " + na.getUser() + ", PW: " + na.getPa());
		    }
		    System.out.println("----------");
		}
	}
}