package ex3_protected.package2;

import ex3_protected.package1.A;

public class D extends A{
	public D() {
		super(); //A 클래스의 생성자 호출
	}
	public void method1() {
		
		this.field = "value";
		this.method();
	}
	
	//public woid method2() {
	//	A a = new A();
	//	a.field = "value";
	//	a.method();
	//}
}
