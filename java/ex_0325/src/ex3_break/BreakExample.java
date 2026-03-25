package ex3_break;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		//1~45난수 뽑기
		
		//int rand = (int)(Math.random()*45)+1;
		
		Scanner sc = new Scanner(System.in);
		//int answer;
		
		//while(true) {
		//	System.out.println("정답:");
			//answer = sc.nextInt();
			//입력받은 answer랑 난수랑 일치하면
			//반복문을 빠져나가게 해줘
			
			//if(answer == rand) {
		//		break;
				
				
		//	}
	//	}
		
		//updown게임을 for문을 이용해서 만들기
		//기회는 10번
		//중간에 정답을 맞추면 반복문 종료하고 "정답입니다."출력하기
		//입력한 값이 정답보다 작으면 "up"
		//입력한 값이 정답보다 크면 "down"
		//10번만에 못맞추면 "정답을 맞추지 못했습니다."
		
		System.out.println("-램덤 숫자 업 다운 Game- ");
		
		
		int rand = (int)(Math.random()*50)+1;
		int answer;
		
		
		boolean isrand = true;
		
		for(int i = 9; i > -1; i--) {
			System.out.println("숫자를 입력하시오:");
			answer = sc.nextInt();
			if(answer == rand) {
				System.out.println("정답입니다.");
				break;
			}else if(answer > rand) {
				System.out.println("보다 down");
			}else if(answer < rand) {
				System.out.println("보다 up.");
				
			if(!isrand) {
				System.out.println("정답을 맞추지 못했습니다.");
			}
			
			
				} 
			System.out.println("프로그램 종료까지 남은 횟수" + i);	
			
			}
		
		
		outer:for(int i = 1; i <=5; i++) {
			for(int j = 1; j<=5; j++) {
				if(j == 3) {
					System.out.println(i+""+j);
					break outer;
				}
			}
		}
		
		
		
		
		
		
		
		
		
				
		}
}


