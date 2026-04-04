package ex5_polymorphism.exam01;

public class CarMain {
	public static void main(String[] args) {
		//자동차 객체 만들기
		Car c = new Car();
		
		c.tire = new Tire();
		
		
		c.run();
		
		//한국타이어로 타이어 교체
		
		c.tire = new HankookTire();
		c.run();
		
		//금호타이어로 타이어 교체
		c.tire = new KumhoTire();
		c.run();
		
		
		Order d = new Order();
		
		
		d.payment = new Payment();
		
		
		d.go(1000);
		
		
		
		d.payment = new KakaoPayment();
		
		d.go(20000);
		
		
		
		
		
		
		
		
	}
}
