package ex1_innerclass.interfaceexample;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		//내부 인터페이스를 구현하는 클래스
		class OkListener implements Button.ClickListener{
			
			
			//추상메서드 오버라이딩
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
				
			}
			
		}
	
		
	
		
	}
}
		
		
	
		
	

