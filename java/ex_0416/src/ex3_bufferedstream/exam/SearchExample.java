package ex3_bufferedstream.exam;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class SearchExample {
	public static void main(String[] args) {
		//사용자로 부터 검색할 단어를 입력받고, stroy.txt파일에서
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			System.out.println("검색할 단어를 입력: ");
			str = b.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//해당 단어가 포함된 줄을 출력하세요
		try (
				FileOutputStream fos = new FileOutputStream("story.txt")
				;){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//실행 예시
		//검색어 입력 : 자바
		//자바는 객체지향 언어이다.
		//오늘 자바 공부를 했다.
		
		//파일을 한줄씩 읽는다.
		
		//권장 스트림
		//BufferedReader
	}
}
