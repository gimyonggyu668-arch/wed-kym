package ex_2method;

public class Calculator {
	//계산기 기능이 있는 메서드
	//숫자 2개 , 문자열타입의 연산자
	public int getResult(int num, int num2, String op) {
		if(op.equals("+")) {
			return num + num2;
		}else if(op.equals("-")) {
			return num-num2;
		}else if(op.equals("*")) {
			return num * num2;
		}else if(op.equals("/")) {
			return num / num2;
		}else {
			System.out.println("잘못 입력하셨습니다.");
			return -1;
		}
			
		
		}
	
}
