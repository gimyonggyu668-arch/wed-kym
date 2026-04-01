package ex2_if;

import java.util.Scanner;

public class IfElseTfExample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오:");
		int score = sc.nextInt();
		
		//점수가 100~90점 "A"
		//89~80점 "B"
		//79~70점 "C"
		//69~60점 "D"
		//59~0점 "F"
		
		//0보다 작은수가 들어왔을 때도 다시 입력해주세요 출력하기
		  
	
		
		if(score > 100 || score < 0) {
			System.out.println("다시 입력해주세요");
		}   else if (score >= 90) { // 커다란 조건은 앞에 쓰는게 좋다 
			System.out.println("A등급입니다.");
		}  	else if(score >= 80) {
			System.out.println("B등급입니다.");
		}	else if(score >= 70) {
			System.out.println("C등급입니다.");
		}	else if(score >= 60) {
			System.out.println("D등급입니다.");
		}	else if(score <= 59) {
			System.out.println("F등급입니다.");
		}	else {
			System.out.println("다시 입력해주세요");
		}
//		else {
		  //			System.out.println("F등급입니다.");
//		}
			
		
		
		
		
	}
}
