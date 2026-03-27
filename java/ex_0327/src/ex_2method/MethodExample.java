package ex_2method;



public class MethodExample {
	
	
	//메서드의 구조
	//접근제한자 반한현 메서드명(매개변수) {
	//   실행하고자 하는 명령어
	//   return 반환값;
	
	
    //}

	//반환할 값이 없으면 반환형은 void 
	//외부에서 받을 값이 없으면 매개변수는 생략 가능하다.
	
	//"메서드가 호출 되었습니다." 라고 출력되는 printTnfo 메서드 작성하기
	
	public void printInfo() {  
		System.out.println("메서드가 호출되었습니다.");
	}
	
	//두 수를 더하여 반환하는 add 메서드 작성하기
	public int add(int a, int b) {
	
		int x = a;
		int y = b;
		int z = x + y;
		return z;
	
	}
	//메서드의 호출
	public double circleArea(double r) {
			return 3.14*r*r; }
	
			
			
			
			
			
			
//원의 둘레를 구하는 circleRound메서드 정의
//반지름은 외부에서 전달 받는다.
//원의 둘레 : 2* 3,14*반지름
//메서드 내부에서 둘레를 구하고 출력한다음 종료

	//정수 배열을 매개변수로 받아서 짝수의 개수를 반환하는  countEven 메서드 작성하기
	
			
	public int countEven(int[] x) {
		int count = 0;
		for(int i : x) {
			if( i % 2 == 0) {
				count++;
				
			}
		}
		
		return count;
	}
	//메서드를 만드는 이유
	//자주 사용되는 기능을 재사용하기 위함
	
		//특정 문자 개수 세기 
		//문자열과 문자 하나를 매개 변수로 받아서 
		//문자열에서 해당 문자가 몇번 등장하는지반환하는 countChar메서드 작성하기
		
//		public int countChar(String m, char c) {
//			for(String str: m.split("")) {
//				if(str.charAt(0) == c) {
//					count++;
//				}
//			}
//			return count;	
//			
//			
//			
//			
//		}
			
			
			
			
			
			
			
	}
			
	
