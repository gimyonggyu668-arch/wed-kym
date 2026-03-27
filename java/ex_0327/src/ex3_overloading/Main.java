package ex3_overloading;

public class Main {
	public static void main(String[] args) {
		OverloadingExample o = new OverloadingExample();
		
		//메서드 오버로딩의 장점
		//같은 이름으로 여러가지 타입의 매개값을 처리할 수 있다.
		int result = o.plus(1, 2);
		double result2 = o.plus(1.0, 2.0);
		
		System.out.println(result);
		System.out.println(result2);
	
		CalC f = new CalC();
		f.area(10,5);
		int result4 = f.area(6);
		
		System.out.println(result);
		
	}
	
}
