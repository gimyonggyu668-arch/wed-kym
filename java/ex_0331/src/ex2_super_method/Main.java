package ex2_super_method;

public class Main {
		public static void main(String[] args) {
			SuperSonicAirplane sky = new SuperSonicAirplane();
			
			sky.takeOff();
			
			sky.fly();
			
			sky.flyMode = SuperSonicAirplane.SUPERSONIC;
			
			sky.fly();
			
			sky.flyMode = SuperSonicAirplane.NORMAL;
			
			sky.fly();
			
			sky.land();
			
			
			
		}
}
