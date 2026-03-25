package ex2_while;

import java.util.Scanner;

public class whileExample {
	public static void main(String[] args) {
		int x = 1;
		
		
		//x의 값이 변하지 않으면 조건이 거짓이 될 수 없기 때문에
		//무한으로 돌게 된다.
		while(x < 4) { //참일때 나갈 수 있다.
			System.out.println(x);
			x++;//초기식의 값을 변화시켜줄 수 있는 증감식을 따로 작성해줘야 한다.
		}
		
		//1 ~ 6 사이의 난수를 뽑아 변수에 저장하기!
		//난수: 무작위성
		//int rand = (int)(Math.random()*6) + 1;
		
		//정답을 키보드에서 입력받자!
		//정답을 맞출때 까지 반복
		
		
		//몇번만에 정답을 맞출 수 있을지 모름
		//Scanner sc = new Scanner(System.in);
		//int answer = 0;
		//while(answer != rand) {
			//System.out.println("정답 : ");
			//answer = sc.nextInt();
			//if(answer == rand) {
				//ystem.out.println("정답을 맞췄습니다.");
			//}
			
		//}
		//결과를 담아줄 변수 만들기
		//int total = 0;
		//int a = 1;
		//while(a != 100) {
			//total += 0;
			
			
			
		
		//키보드에서 정수를 하나 입력 받아서, 각 자리의 합을 더한 결과를 출력하세요
	//예를 들어 12345를 입력받았다면 더한 15를 출력하기
		
		 Scanner sc = new Scanner(System.in);
		//System.out.println("숫자를 입력하시오: ");
		//int a = sc.nextInt();
		//int b = 0;
		//while(a != 0) {
			//b += a % 10;//a%10한 계산 값은 a에게 저장되는 것이 아니므로 b = b + a % 10; 
			//b에 저장 된 값은 a의 나머지 이기에 따로 저장됨
			//여기서 a를 또 따로 저장해서 나눈뒤 서로 더해서 10진수로 10을 이용해 다음 자리 수를 더하게끔 도움
			
			//a = a/10;//a는 그대로이다.
			
			
			
		//}
			
			//System.out.println(b);
			
			System.out.println("숫자 입력하시오:");
			int num = sc.nextInt();
			int sum = 0; // 총 합을 담을 변수
			while(num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			
			System.out.println("각 자리의 총 합: " +sum);
			
			
			
			
			
			
		
		
	}
}
