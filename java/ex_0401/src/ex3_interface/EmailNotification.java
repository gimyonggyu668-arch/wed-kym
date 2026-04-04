package ex3_interface;

public class EmailNotification implements Notification{

	String message;
	@Override
	public void send(String message) {
		System.out.println("[EMAIL] "+ message + " 회원가입을 환영합니다.");
		
	}
	
	
	
	
	
}
