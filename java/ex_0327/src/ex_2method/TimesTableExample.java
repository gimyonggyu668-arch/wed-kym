package ex_2method;

import java.util.Scanner;

public class TimesTableExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a = sc.nextInt();
		
		TimesTable tt = new TimesTable();// 클래스에 속했는 메서드를 호출하는 방법
		tt.showTable(a);                 
		System.out.println();               //1. 클래스의 객체를 생성한다.
		
		                                  //객체를 통해서 메서드를 호출한다
	}

}
