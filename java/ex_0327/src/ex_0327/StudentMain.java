package ex_0327;

import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
		Student minsu = new Student();
		minsu.name = "민수";
		minsu.age = 20;
		minsu.score = 80;
		
		
		
		Student gildong = new Student();
		gildong.name = "길동";
		gildong.age = 21;
		gildong.score = 45;
		
		
		
		Student yonghee = new Student();
		yonghee.name = "영희";
		yonghee.age = 20;
		yonghee.score = 80;
		
		//배열에는 같은 타입의 데이터만 넣을 수 있다.
		//데이터의 타입은 배열 앞에 명시한다.
		
		Student[] students = {minsu, gildong, yonghee};//**중요**
		//우리가 만든 참조자료형
		
		System.out.println(students[0].name);
		
		//배열에 들어있는 내용을 모두 출력하기
		
		for(int i = 0 ; i < students.length; i++) {
			System.out.println("이름 : " + students);
			System.out.println("나이 : " + students);
			System.out.println("점수 : " + students);
		
		
		}
		
		
		
		
	}
}
