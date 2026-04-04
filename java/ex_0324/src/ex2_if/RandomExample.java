package ex2_if;

import java.util.Scanner;

public class RandomExample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Math 클래스
		//random() 메서드
		//- 0.0 <= ~ 1.0 사이의 double 타입 난수를 하나 뽑아주는 기능
		//static 키워드가 붙어있으면 객체 생성없이 호출 가능
		
		//int num = (int)(Math.random()*6) + 1;// 1<= x < 7;
		
		//어떤 주사위 눈이 나왔는지 출력하기 
		//1이 나왔습니다.
		//...
		//6이 나왔습니다.
		int num = 3;
		if(num == 1) {
			System.out.println("1이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2가 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3이 나왔습니다.");
		} else if(num == 4 ) {
			System.out.println("4가 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5가 나왔습니다.");
		} else if(num == 6) {
			System.out.println("6이 나왔습니다.");
		}
		
		///////////////////////////////////////////////
		
		//구매 금액에 따라 활인률이 적용된 금액 구하기
		//10만원 이상 구매시 20% 할인
		//5만원 이상 구매시 10%할인
		//키보드에서 금액을 입력받고 몇 % 할인 받았는지, 최종금액이 얼만지 출력\
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매 금액: ");
		int money = sc.nextInt();
		
		if(money < 50000) {
			System.out.println("할인 받을 수 없습니다."); 
		} else if(money >= 100000) {
			System.out.println("할인 된 금액: " + money*0.8);
		} else if(money >= 50000) {
			System.out.println("할인 된 금액: " + money*0.9);
		}
		
		/////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
