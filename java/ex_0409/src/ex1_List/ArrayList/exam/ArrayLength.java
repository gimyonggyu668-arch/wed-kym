package ex1_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayLength {
	public static void main(String[] args) {
		//문자열 타입 리스트 객체를 만든다.
		//리스트에 "Java" ,"Spring" , "HTML", "CSS"를 저장하기
		//각 문자열의 길이를 계산하여 length라는 새로운 리스트를
		//만들어서 저장하기
		//lengths 리스트 출력하기
		List<String> list = new ArrayList<String>(); 
		List<Integer> lengthList = new ArrayList<Integer>(); 
		list.add("Java");
		list.add("String");
		list.add("HTML");
		list.add("CSS");
		for(int i = 0;i <= list.size()-1; i++) {
			
			String word = list.get(i);
			lengthList.add(word.length());
		}
		
		System.out.println(lengthList);
		
		
		
		//문자열 형태의 리스트 생성하기
		//"김철수", "이영희", "김철수","박민수","김철수"
		//리스트에서 김철수가 몇번 들어있는지 계산하여 출력하세요
		
		
		
		List<String> list2 = new ArrayList<String>(); 
		list2.add("김철수");
		list2.add("이영희");
		list2.add("김철수");
		list2.add("박민수");
		list2.add("김철수");
		int sum = 0;
		
		for(String name : list2) {
			
			if(name.equals("김철수")) {
				sum++;
			}
		}
		System.out.println("이름이 반복된 횟 수 :"+sum);
		
		//scores라는 이름의 정수타입 리스트를 만든다.
		//88,72,95,60,81을 저장한다.
		//최고점수와 최소점수를 찾아서 차이를 출력하시오.
		
		
		List<Integer> scores = new ArrayList<Integer>(); 
		
		scores.add(88);
		scores.add(72);
		scores.add(95);
		scores.add(60);
		scores.add(81);
		int max = scores.get(0);
		int min = scores.get(0);
		
		for(int i = 0; i <=scores.size(); i++) {
			int score = scores.get(i);
			
			if(score > max) {
				max = score;
				
			}
			
			
			if(score < min) {
				min = score;
			}
			int diff = max - max;
			
			System.out.println(diff);
			
			
		}
		
		
		
	}
}
