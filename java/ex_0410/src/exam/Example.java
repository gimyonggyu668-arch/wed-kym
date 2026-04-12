package exam;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		//사용자로 부터 여러개의 문자열을 입력받아 List 에 저장한다.
		//이후 중복을 제거하고 정렬학여 출력하는 프로그램 작성하기 
		//입력은 exit입력시 종료
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String e = "exit";
		
		
		String str;
		

		do {
		    System.out.print("문자를 입력하세요 (종료하려면 exit): ");
		    str = sc.nextLine();
		    list.add(str);
	
		    
		    
		} while (!str.equalsIgnoreCase("exit")); 

		System.out.println("프로그램을 종료합니다.");
		 
		
		Set<String> set = new HashSet<String>(list);
		List<String>result = new ArrayList<String>(set);
		
		
		//정렬
		Collections.sort(result);
		
		System.out.println("중복 제거 후 정렬 결과 : " + result);
		
		
		
		//학생 이름을 입력 받아 List 에 저장한다.
		//이미 존재하는 이름이면 추가하지 않고 "이미 존재하는 이름입니다." 메세지를 출력한다.
		
		List<String> name = new ArrayList<String>();
		
		String s = "exit";
		
		while(true) {
			System.out.println("(프로그램 종료 : exit)\n학생 이름을 입력하세요: ");
			String n = sc.nextLine();
			
			
			if(n.equalsIgnoreCase(s)) {
				break;
				
			
				
			}if(name.contains(n)) {
				System.out.println("이미 존재하는 이름입니다.");
			
			
			
			} else {
				name.add(n);
			}
			
			
  }
 }
}	    
