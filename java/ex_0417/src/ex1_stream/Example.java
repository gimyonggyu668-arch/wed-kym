package ex1_stream;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,5,7,8,10,4,1,2,6,9,1,1,1,3,3,3);
		
		//짝수 출력하기 
		numbers.stream()
		.filter(x -> x%2 == 0)
		.map(x -> x + 10)
		.forEach(x -> System.out.println(x+""));
		System.out.println();
		
		
		List<String> words = Arrays.asList("java", "spring", "react", "db", "server");
		words.stream()
		.filter(y -> y.length() >= 5)
		.map(x -> x.toUpperCase())
		.forEach(System.out::println);
		
	}
}
