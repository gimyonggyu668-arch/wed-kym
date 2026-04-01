package ex4_innerclass.instanceclass;

public class AMain {
	public static void main(String[] args) {
		//외부 클래스의 객체
		A a = new A();
		
		
		a.new B();
		
		
		
		a.useB();
		
		
		
		
		 
	}
}
