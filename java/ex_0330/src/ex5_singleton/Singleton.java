package ex5_singleton;

public class Singleton {
	//클래스 내부에서 객체를 생성함
	private static Singleton singleton = new Singleton();//객체는 얘가 만듬
	
	//private 접근제한을 갖는 생성자를 선언
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	
	
	
	
}
