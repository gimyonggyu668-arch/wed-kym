package ex1_innerclass.interfaceexample;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		//익명클래스
		@Override
		public void roll() {
			System.out.println("오버라이딩 타이어가 굴러갑니다.");
		}
		
		
		
		
	
	
	
	};
}
