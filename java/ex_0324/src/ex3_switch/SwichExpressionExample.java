package ex3_switch;

import java.util.Scanner;

public class SwichExpressionExample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//break를 빼먹으면 fall= through가 발생한다.
		//값을 변수에 넣으면 중복 코드가 많아진다.
		//int num = 2;
		//String result;
		//switch(num) {
		//case 1:
		//	result = "A";
		//	break;
		//case 2:
		//	result = "B";
		//	break;
	//	}
	
		//String result = switch(num) {
		
		//여러 case를 묶기가 불편하다.
		
		
	   // int day = 3;  
		//case 1 -> "A";
		//case 2 -> "B";
		//case 3 -> "C";
		//default -> "F";
		//break;
		
		//};
	
		//String type = switch(day) {
		//case 1,2,3,4,5 -> "평일";
		//case 6,7 -> "주말";
		//default -> "잘못된 값";
		
		
		
		//화살표 오른쪽에 여러 줄의 로직이 필요하다면 {}를 써야할ㄴ다.
		//이때 최종적으로 반환할 값을 명시하려면 yield 키워드를 사용한다.
		
		//result = switch(num) {
		//case 1 -> "하나";
		//case 2 -> {
			//System.out.println("2가 입력됨");
			//yield "둘";
			
		//}
		
	///	default -> "기타";
		
		
		
		
//};
  	
		
		
		
		
		
		//정수형 변수를 하나 만들고 해당 달이 몇일까지 있는지
		//switch문을 이용하여 작성하세여 
		//1월은 31일 까지 있습니다.
		//2월은 28일 까지 있습니다.
		//4월은 30일 까지 있습니다.
		
		//int month = 3;
		//String result3 = switch(month) {
		//case 1,3,5,7,8,10,12 -> month+ "월은 31일까지 있습니다.";
		//case 4,6,9,11 -> month+"월은 30일까지 있습니다.";
		//case 2 -> "다시 입력해주세요";
		
		//default -> "다시 입력해주세요";
		
		                                               
		
		
		
		//};
		
		//System.out.println(result3);
		
		
		//계산기 만들기
		//두 개의 정수형 변수를 키보드에서 입력받는다.
		//연산자 기호를 담아줄 문자열 변수를 만든다.
		//switch문을 담아줄 문자열 변수를 만든다.
		//10
		//7
		//*
		//10*7=10
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하십시오: ");
		int s = sc.nextInt();
		
		System.out.println("(*,-,+)고르시오: ");
		String u = sc.next();
		
		
		
		System.out.println("숫자를 입력하십시오: ");
		int x = sc.nextInt();
		
		switch(u) {
		
		
		case "*":
			System.out.println("결과:"+(s*x));
			break;
		
		case "+":
			System.out.println("결과:"+(s+x));
			break;
		case "-":
			System.out.println("결과:"+(s-x));
			break;
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
}
