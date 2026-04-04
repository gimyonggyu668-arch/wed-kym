package ex1_innerclass.interfaceexample;

public class RemoteControl {
	private String power = "Off";
	
	
	public class Button {
		void press() {
			power = "on";
			System.out.println("전원을 켭니다.");
		}
	}
	
	
	
	
	
	
	
}
