package ex3_print;

//java.util 패키지에 있는 Scanner 클래스
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		//클래스에 정의되어있는 기능을 사용하려면
		//클래스를 객체로 만드는 작업을 해야된다.
		//객체의 생성 : new 클래스 명 ();
		//new가 공간 확보를 하고 클래스로 실행한다.
		Scanner sc = new Scanner(System.in);
		//(System.in) = 키보드로 받겠다는 준비 상태
		System.out.println(sc);
		
		
		
		//쓸 변수들을 미리 나열
		String name,address;
		int age;
		double height;
		
		
		System.out.print("이름 :");
		name = sc.next();
		
		//객체를 통해 클래스 안에 정의된 기능을 호출 
		
		
		System.out.print("나이 :");
		//키보드로 받겠다
		age = sc.nextInt();
		
		
		
		System.out.print("주소 :");
		address = sc.next();
		
		System.out.print("신장 :");
		height = sc.nextDouble();
		
		
		System.out.printf("당신의 이름은 %s입니다.\n",  name);
		System.out.printf("당신의 나이는 %d세입니다.\n",  age);
		System.out.printf("당신의 주소는 %s입니다.\n",  address);
		System.out.printf("당신의 신장는 %.1fcm세입니다.\n",  height);
		
		
		
		
		
		
		
		
		
		
	}
}
