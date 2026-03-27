package ex_2method;

public class MethodMain {
	public static void main(String[] args) {
		//클래스 안에 정의된 메서드 사용하기
		
		//1.  객체가 정의되어야 한다.
		MethodExample m = new MethodExample();
		//2. 객체를 통해서 메서드를 호출해야 한다.
		//변수명.메서드명();
		m.printInfo();
		
		m.add(10,7);
		//메서드의 호출
		int result = m.add(7, 19);
		System.out.println(result);
		System.out.println(m.add(2, result));
		
		
		m.circleArea(5);
		
//		int result2 = m.countChar("apple",'p');
	}
	
	//원의 넓이를 구하는 circleArea메서드 작성하기
	//원의넓이: 3.14 *반지름* 반지름
	//반지름을 외부에서 받아서 넓이를 반환하기
	
	//1.메서드를 정의한다.
	//-외부에서 받아야 할 값이 있으면 매개변수
	//-코드블럭에 기능을 정의 기능을 정의
	//-연산결과를 보내줘야하면 return을 저의


	
	
}
