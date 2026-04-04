package ex2_while;

import java.util.Scanner;

public class DoWhileExample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요:");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("q"));
		
		//----------------------------------------
		//사용자가 비밀번호를 입력한다.
		//비밀번호가 1234와 같을 때 까지 계속 입력받는다.
		//단 5번 틀리면 "접속 차단 출력 후 종료
		//성공하면 로그인 성공
		String password;
		int count = 0;
		
		do {
			System.out.println("비밀번호 입력: ");
			password = sc.nextLine();
			count++;
			
			if(password.equals("1234")) {
				System.out.println("로그인 성공");
			
			}else if(count == 5) {
				System.out.println("접속 차단");
			}
		}while(password.equals("1234") && count < 5);
		 	
		
		
		
		//정수를 입력 받는다.
		//입력받은 수를 뒤집어서 출력하세요.
		//1234를 출력 받으면
		//4321이 나오게끔
		//복습**
		
		System.out.println("정수를 입력하시오: ");
		int num = sc.nextInt();
		
		int result = 0;
		do {
			result = result * 10;
			int de = num % 10;
			result += de;
			num -= result;
		}while(num != 0);
		System.out.println(result);
		
		
		
		
		
		
		
		//int original; //선생님 답안
		//int reverse = 0;
		//System.out.println("정수 입력:");
	
		//original = sc.nextInt();
		//do {
			//reverse = reverse * 10 + original % 10;
		//	original /= 10;
		//}while(original != 0);
		//System.out.println("뒤집은 수 :" + reverse);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
