package ex1_abstract;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//추상클래스의 객체는 직접만들 수 없다.
		//Animal a = new Animal();
		
		Tiger t = new Tiger();
		t.sound();
		
		
		Delivery r = new StorePickup();
		r.ship();
		
		Delivery k = new RoketDelivery();
		k.ship();
		
		Delivery rk [] = {new StorePickup(), new RoketDelivery()};
		
		Delivery rk2 [] = {r,k};
		
		for(Delivery delivery : rk) {
			delivery.printInvoice();
			delivery.ship();
			delivery.complete();
			System.out.println("------");
		}
		
		
		
		//--------------------------
		
		Transport[] transport = {
				new Bus("버스", 1200),
				new Taxi("택시", 4000, 10 , 100),
				new AirPlane("비행기", 100000, 500000, 20000, 23)
		
		};
			for(Transport t2 : transport) {
		         t2.printFare();
		         System.out.println("--------");
		      }


		
		
		
		
	}

}