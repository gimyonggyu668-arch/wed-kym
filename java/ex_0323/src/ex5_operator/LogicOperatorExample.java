package ex5_operator;

public class LogicOperatorExample {
	public static void main(String[] args) {
		int x = 10 ;
		int y = 5;
		//&& 논리연산자 둘다 참인지 
		boolean result = x >= 10 && y == 10;//거짓
		
		System.out.println("result : " + result);
		
		//&&
		//T && T = T
		//T && F = F
		//F && T = F
		//F && F = F
		result = (x-y) >= 10 && y == 5;
		
		//y 값은 얼마일까?
		//&&는 이미 앞에서 false 나왔기 때문에 계산하지 않으므로 5
		System.out.println(y);
		
		
		
		
		// ||
		// T || T = T
		// T || F = T
		// F || F = T
		// F || F = F
		
		result = (x-y) <= 10 || (++y) == 5;
		System.out.println(y);
		//앞이 참이면 뒤는 연산하지않는다
		
		//비트 논리 연산자
		//기능은 논리연산자와 같지만 bit단위 (진수)의 연산만 가능하다
		//피연산자가 1,0이라는 것과 산출 결과가 1,0이라는 점이 특징이다.
		//1은 true. 0은 false 라고 생각하면 논리연산자와 차이는 없다.
		
		//& 논리곱 : 둘 다 1이면 1, 아니면 0
		//| 논리합 : 둘 중 하나라도 1이면 1, 아니면 0
		//^ 배타적 논리합 : 두 항이 다르면 1 , 같으면 0
		//~ 부정 : 1을 0으로 ,0을 1로 연산
		
		int a = 10; // 1010; 2진수로 보는 법은 소인수분해
		int b = 7; // 0111;
		int c = a & b;
		System.out.println("c : " + c);
		
		int a2 = 12;  //1100
		int b2 = 8; //1000
		int c2 = a2 | b2; //1100 | 1000 = 1100 답은 12
		System.out.println("c2: " + c2); 
		int a3 = 9; //1001
		int b3 = 11; //1011
		int c3 = a3 ^ b3;
		System.out.println(c3);
		
		//~연산
		//2진수는 음수를 표현할 수 없다.
		//비트의 맨 앞자리는 부호의 표현으로 쓰기로 약속했다.
		
		int a4 = 7; //0111 -> 1000 -> 1001
		System.out.println("~a4 : " + ~ a4);
		//-(7+1) = -8
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
