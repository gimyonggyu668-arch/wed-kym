package ex1_exception.customException;

import java.util.Scanner;

import ex1_exception.throwseample.Converter;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter converter = new Converter();
		OrderService os = new OrderService();
		
		try {
			System.out.println("상품 가격 입력:");
			String priceStr = sc.next();
			
			System.out.println("상품 수량 입력:");
			String quantityStr = sc.next();
			
			int price = converter.tolnt(priceStr);
			int quantity = converter.tolnt(quantityStr);
			
			int total = os.calculateTotal(price, quantity);
			
			System.out.println("총 금액 : "+ total);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
