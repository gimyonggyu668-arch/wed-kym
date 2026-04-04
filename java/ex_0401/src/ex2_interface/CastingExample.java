package ex2_interface;

public class CastingExample {
	public static void main(String[] args) {
		//자동타입 변환
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehucle.checkFare();
		
		//강제 타입 변환루 호출
		((Bus)vehicle).checkFare();
	}
}
