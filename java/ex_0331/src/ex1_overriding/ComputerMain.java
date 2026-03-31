package ex1_overriding;

public class ComputerMain {
	public static void main(String[] args) {
		double x = 5.0;
		
		//Calculator 객체 만들고 메서드 호출하기
		Calculator calculator = new Calculator();
		System.out.println(calculator.areaCircle(x));
		
		//컴퓨터 객체 만들어서 오버라이딩 된 메서드 호출하기
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(x));
		
		//오버라이팅의 경우 상속관계에서만 사용할 수 있다.
		
	}
}
