
package ex1_operator;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("사각형의 가로 길이: ");
		//double result1 = sc.nextDouble();
		//System.out.print("사각형의 세로 길이: ");
		//double result2 = sc.nextDouble();
		
		//double result3 = (result1 * result2) / 2.0;
		//System.out.print("답: " + result3);
		
		
		//사각형의 가로와 세로의 길이를 입력받아
		//넓이와 둘레 구하기
		
		//학생은 하루에 일정한 금액의 용돈을 받는다.
		//하루에 받는 용돈 : money
		//날짜 수 : dey
		//총 받은 용돈에서 사용한 금액 used를 뺀 남은 돈을
		//출력하는 코드 작성하기
		// 각 값들은 키보드에서 입력받는다.
		
		//System.out.print("하루 받은 용돈: ");
		//int money = sc.nextInt();
		
		//System.out.print("몇 일: ");
		//int day = sc.nextInt();
		
		//System.out.print(" 쓴 돈: ");
		//int used = sc.nextInt();

		//int result1 = money * day;
		
		//int result2 = result1 - used;
		//int result2 = (money*day)-used;
		//System.out.println("현재 남은 잔액: " + result2);
		
		
		//국어,영어,수학에 대한 점수를 키보드에서 입력받는다.
		//1.세 과목에 대한 합계 출력하기
		//2.평균 출력하기 (합계/3.0)
		//3.세 과목의 점수가 각각 60점 이상이고, 평균이 60점 이상일 때 합격 
		//아니면 불합격 처리
		
		System.out.print("국어 점수: ");
		int k = sc.nextInt();
		
		System.out.print("수학 점수: ");

		int m = sc.nextInt();
		
		System.out.print("영어 점수: ");
		int e = sc.nextInt();
		
		
		
		
		double result = (e + m + k) / 3.0;
		System.out.println("평균: " + result);
		
		String isPass = (e >= 60 && m >= 60 && k >= 60) ? "합격입니다." : "불합격입니다.";
		System.out.println("합격여부: " + isPass);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
