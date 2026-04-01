package ex1_abstract;

public abstract class Delivery {
	public void printInvoice() {
		System.out.println("송장을 출력합니다.");
		
	}
	
	public abstract void ship();
	
	public void complete() {
		System.out.println("배송 처리가 완료 되었습니다.");
		
		
		
		
	}
}



