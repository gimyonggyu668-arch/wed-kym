package ex2_package.kia;


//import 긴 이름을 줄여서 쓰기 위한 문법
import ex2_package.hankook.SnowTire;
import ex2_package.Kumho.AllseasonTire;

public class Car {
	//타이어가 필요하다
	
	//클래스의 전체 경로를 다 작성해줬기 떄문에 import를 써주지 않아도 된다.
	ex2_package.hankook.Tire tire1 = new ex2_package.hankook.Tire();
	ex2_package.Kumho.Tire tire2 = new ex2_package.Kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllseasonTire tire4 = new AllseasonTire();
	
	
	
}
