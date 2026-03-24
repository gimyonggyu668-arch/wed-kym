package ex4_for;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		
		
		int i; //이건 가능
		
		for(i = 0; i <= 2; i++) {  //(int i = 1; i <= 3; i++) 보통 이렇게 사용
			//특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
			//안에서 만든 변수는 바깥에서 사용할 수 없다.
			//바깥에서 만든 변수는 안쪽에서 사용할 수 있다.
			
		System.out.println(i+"");
		
		
		
		
		}
		
		
		//int i; 이건 불가능
		System.out.println("외부 i의 값: "+ i);
		System.out.println("---------------");
		
		//5부터 1까지 출력하기 
		for(int j = 5; j >= 1; j--) {
			System.out.print(j+" ");
			
		
			
		}
		System.out.println("---------------");
		
		
		
		int sum = 0;//총 합을 담을 변수
		for(int d = 1; d <= 10; d++) {
			sum += d;//sum = sum + i;
		
		
		System.out.println("1~10까지의~총 합:"+ sum);
		}
		System.out.println("---------------");
		//1부터 10까지 3의 배수만 출력하는 for문 작성하기
		
		
		for(int u = 1; u <= 10; u++) {
			if(u % 3 == 0) {
				System.out.println(u+"");
			}
		}
		
		//1부터 20까지 홀수만 출력하세요
		
		for(int u = 1; u <= 20; u++) {
			if(u % 2 != 0) {
				System.out.println(u+"");
			}
		}
		//내가 반복하고 싶은 거
		int you = 0;
		for(int o = 1 ; o <= 9; o++) {
			you = o;
			System.out.println(3*you);
					
		}
		
		
		//정수형 변수를 하나 초기화 한다.
		//해당 정수에 해당하는 구구단 출력하기 
		
		
		//키보드에서 정수를 하나 입력 받고
		//1부터 입력받은 정수까지의 총 합 구하기
		//예를 들어 5르릉 ㅣㅂ력받으면 1~5까의 총합인 15를 출력해야한다.
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("숫자를 입력하시오: ");
		//int k = sc.nextInt();
		
		
		//int sus = 0;
		
		//for(int l = 1; l <= k; l++) {
			//sus += l;
				//System.err.println(sus+" ");
		//}
		
		Scanner sc = new Scanner(System.in);
		//10개의 정수를 입력받고 그 수들 중 짝수가 몇개인지 구하세요
		int count = 0;
		for(int t = 0; t <= 9; t++) {
			System.out.println("정수 입력:");
			int a = sc.nextInt();
			
			if(a == 0) {
				System.out.println("0일때는 카운트 하지 않습니다");
			}else if (a % 2 == 0) {
				count++;
			
			}
			System.out.println(count);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 }
}