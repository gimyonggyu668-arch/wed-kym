package ex1_innerclass.hiddenclass;

import ex1_innerclass.interfaceexample.RemoteControl;

public class Home {
//인터페이스의 객체는 직접 만들 수 없다
//인터페이스를 구현하는 클래스를 만들어 객체로 사용해야 한다.
	
	
	private RemoteContontrol rc = (RemoteContontrol) new RemoteControl();
		
	

	public void use1() {
		rc.turnOn();
		rc.turnOff();
}

	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOn();
}











}