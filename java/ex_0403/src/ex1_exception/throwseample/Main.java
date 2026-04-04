package ex1_exception.throwseample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter con = new Converter();
		try {
			System.out.println("문자를 입력하세요 : ");
			String is = sc.nextLine();
			int num = con.tolnt(is);
			System.out.println("변환결과: "+ num);
			
		} catch (Exception e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
	}

}
