package ex3_class;

public class CarMain {
	public static void main(String[] args) {
		//Scanner 변수명 = new Scanner();
		Car sd = new Car();// 자동차를 1대 만듦
		
		//객체를 통해 필드에 접근하는 방법
		//변수명.필드명;
		//필드에 들어있던 값을 수정할 수 있다.
		sd.price = 100000000;
		sd.color = "wgute";
		sd.brand = "HTNDAI";
		     
		//sd.tire = "금호"; 정의되지 않은 필드를 사용할 수는 없다.
		
		
		
		System.out.println("가격 : " + sd.price);
		System.out.println("색상 : " + sd.color);
		System.out.println("브랜드 : " + sd.brand);
		
		//두 번째 자동차 객체 만들기
		Car sd2 = new Car();
		sd2.price = 90000000;
		sd2.color = "black";
		sd2.brand = "KIA";
		
		System.out.println(sd2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
