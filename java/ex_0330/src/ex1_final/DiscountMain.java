package ex1_final;

import java.util.Scanner;

public class DiscountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액: ");
		int price = sc.nextInt();
		
		
		DIscount discount = new DIscount();
		double total = discount.calculatePrice(price);
		System.out.println("총 할인 받은 금액: " + total );
		
		
		
	}
}