package app;

import service.MemberService;
import member.Member;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("나이 입력하세요 : ");
		int age = sc.nextInt();
		
		Member ac = new Member(name, age); //member에서 넣어줄 객체를 위해 생성자를 만듬
		
		
		MemberService ab = new MemberService();//member에 들어간 정보를 꺼내기 위해 생성자 호출
		
		ab.register(ac);
		ab.checkAdult(ac);
		
		
		
		
	}
}
