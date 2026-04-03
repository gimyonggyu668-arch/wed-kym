package ex1_exception.customException;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		System.out.println("예금액: "+ account.getBalance());
		//15만원 출금
		try {
			account.withdraw(150000);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가격 : ");
		String don = sc.next();
		
		
		System.out.println("수량 : ");
		String  num = sc.next();
		
		
		
		
		
		
	}
}
