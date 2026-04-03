package ex1_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		//키보드에서 정수를 입력받고, 정수이외의 값이 입력되었다면
		//"정수만 입력 가능" 메시지 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 입력 : ");
			int num = sc.nextInt();
			System.out.println("결과:"+num);
			
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력가능." + e.getMessage());
		}
		
		
		String[] fruits = {"사과", "바나나", "포도","복숭아"};
		
		
		//인덱스를 입력 받는다.
		//해당 위치의 과일을 출력한다.
		//숫자가 아닌값을 입력하면 "숫자를 입력해야 합니다."
		//범위를 벗어난 인덱스를 입력하면 "존재하지 않는 인덱스 입니다."
		
		
	
		
		
		try {
			System.out.println("인덱스 값을 입력하시오 :");
			int num1 = sc.nextInt();
			System.out.println(fruits[num1]);
			
			
		
		} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해야 합니다."); //숫자가 아닌 것을 걸러냄
				
				
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스 입니다.");//배열에서 벗어난 숫자를 걸러냄
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}


