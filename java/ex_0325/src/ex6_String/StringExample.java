package ex6_String;

import java.util.Arrays;
import java.util.Scanner;


public class StringExample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//String
		//문자들의 집합을 저장하는 객체 타입
		
		//묵시적 객체 생성
		//같은 문자열이면 객체를 공유
	//	String s1 = "홍길동";
	//	String s2 = "홍길동";
	//	if(s1 == s2) {
		//	System.out.println("s1과 s2의 주소가 같습니다.");
		//}
		
		//String s3 = new String("홍길동");
		//String s4 = new String("홍길동");
		//명시적 객체 생성(new를 통해 생성하는 객체)
		//항상 새로운 객체가 만들어진다.
		//if(s3 != s4) {
		//	System.out.println("s1과 s2의 주소 같지 않습니다.");
			
			//String은 클래스 
			//클래스 안에는 자주 사용하는 기능들이 메서드 형태로 정의되어 있다.
		//}
		
		//문자열에서 문자 추출하기 
		//charAt(index);
		//index : 컴퓨터가 숫자를 세는 방식 (0부터 순차적으로 센다.)
		String subject = "자바 프로그래밍";
		//char charValue = subject.charAt(3);
		//System.out.println(charValue);
		
		//String ssn = "9201231230123";
		//이 사람이 남자인지 여자인지 "남자","여자"면 여자라고 출력
		//문자열의 길이 측정
		//int length = subject.iength();
		//System.out.println("문자열의 길이"+ length);
		
		//특정문자열을 대체
		//replace("기존","새로운");
		String newStr = subject.replace("자바","JAVA");
		System.out.println(newStr);
		
		//문자열 잘라내기
		//substring(시작 index,끝 index);
		String str = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str.substring(2,9));
		
		//위치 찾기 
		//indexOf("문자열");
		int index = subject.indexOf("프로그래밍");//시작 점은 여기 index 가 여기서 발생댐
		System.out.println(index);
		
		index = subject.indexOf("안녕하세요");
		System.out.println(index);
		
		
		//문자열을 분리
		//split("기준값");
		String board = "번호 ,제목, 내용, 성명";
		//분리한 문자열을 배열로 반환
		String[] arr = board.split(",");
		System.out.println(Arrays.toString(arr));
		//특정 문자열을 포함하고 있는지에 대한 여부(true,false)
		//comtains("문자열);
		
		//키보드에서 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하는 코드 작성하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.next();
		int count = 0;
		for(int i = 0; i <s.length(); i++) {
			if(s.charAt(i) == 'a')
				count++;
			
			
			
			
			
			
		}		
			System.out.print("a의 개수:"+ count);
		//문자열을 입력받고 그 문자열을 뒤집어서 원본과 같으면
		//같습니다. 다르면 다릅니다. 출력하기
			
		
		System.out.println("원본 : ");
		String original = sc.nextLine(); 
		String reverse = "";
		      
		for(int i = original.length()-1; i >= 0; i--) {
		     reverse += original.charAt(i);
	      }if (original.equals(reverse)) {
		     System.out.println("같습니다");
		  }else {
		     System.out.println("다릅니다");
		  }
			
		
	
	
	
	}	
			
		
		
		
		
		
}

