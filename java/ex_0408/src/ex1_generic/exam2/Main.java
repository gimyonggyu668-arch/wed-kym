package ex1_generic.exam2;

public class Main {
	public static void main(String[] args) {
		//T payment = new KakayPay();
		//payment.pay();
		
		
		
		PaymentProcessor<KakaoPay> k = new PaymentProcessor<KakaoPay>(new KakaoPay()); 
		
		k.getProcess().pay();
	
	}
}
