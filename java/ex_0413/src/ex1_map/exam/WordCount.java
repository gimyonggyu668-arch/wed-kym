package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		//단어 빈도수 분석기
		//문자열을 공백을 기준으로 분리한다.
		//모두 소문자로 바꾼다.
		
		//HashMap<String, Integer>에 단어별 개수를 저장한다.
		
		 String text = "Apple banana apple Banana apple";
	        String lowerCaseText = text.toLowerCase();
	        String[] fruits = lowerCaseText.split(" ");
	        Map<String, Integer> frequencyMap = new HashMap<>();
	        for (String fruit : fruits) 
	            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
	        System.out.println(frequencyMap); 
	        }
		
	}

