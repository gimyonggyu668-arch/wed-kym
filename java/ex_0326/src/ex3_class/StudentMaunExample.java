package ex3_class;

import java.util.Arrays;

public class StudentMaunExample {
	public static void main(String[] args) {
		StudentMaun student = new StudentMaun();
		String arr1;
		int arr;
		student.name = "김용민";
		student.age = 20;
		student.score = 87;
		
		
		System.out.println("이름: "+ student.name);
		System.out.println("점수: "+ student.score);
		System.out.println("나이: " + student.age);
	}
}
