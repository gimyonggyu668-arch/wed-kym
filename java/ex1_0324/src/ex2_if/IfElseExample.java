package ex2_if;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		//정수 하나를 입력 받아서 짝수면 "짝수", 홀수면 "홀수"를
		//출력하는 코드 작성하기
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비밀번호를 입력하시오: ");
		int con = sc.nextInt();
		int k = 1234;
		
		if(con == k) {
			System.out.println("로그인이 되었습니다.");
			
		}  else {
			System.out.println("로그인이 되지 않았습니다.");
			sc.close();		
	}
  }
}		//사용자가 입력한 비밀번호가 맞는지 확인하기
		//키보드에서 비밀번호를 입력 받는다.
		//비밀번호 : 1234
		//입력한 비밀번호와 일하면 "로그인 성공:
		//일치하지 않으면 비밀번호가 일치하지 않습니다.
		
		
		
		
		
		
		
		
		
		
		
		
