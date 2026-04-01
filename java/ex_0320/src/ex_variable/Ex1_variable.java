package ex_variable;


public class Ex1_variable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//System.out.println(10);
		int x; //x라는 이름의 정수타입의 변수를 선언
		
		x = 10;// 변수 x에 10을 대입
		//프로그래밍 언어에서 = 은 우변에 값을 좌변에 대입하겠다는 말
		System.out.println(x+1);
		System.out.println(x);
		
		x = 55;//기존의 값을 버리고 새로운 값을 대입할 수 있다
		System.out.println(x);
		
		x = x + 1;
		System.out.println(x);
		//대입은 필요한 만큼 할 수 있다.
		//선언과 동시에 값을 대입할 수 있다
		int y = 30;
		//변수는 출력문이나 연산식에 사용되어 값을 
		//활용할 수 있다.
		int hour = 3; 
		int minute = 5;
		//숫자 + 문자열은 모두 문자열로 합쳐진다.
		
		
		
		System.out.println(hour + "시간" + minute + "분");
		//총 몇분인지 구하기
		int totalminute = hour * 60 + minute;
		System.out.println("총" + totalminute + "분");
		//변수는 또 다른 변수에 대입되어 메모리 간에 값을 
		// 복사할 수 있다.
		int a= 3;
		int b = a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
