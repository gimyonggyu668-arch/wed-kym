package ex1_stream.exam;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<Integer> orders = Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
		orders.stream()
		.filter(t -> t >= 50000)
		.forEach(x -> System.out.println(x));
		
		
		List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);
		
		
		boolean isAllAdult = ages.stream().allMatch(a -> a >= 20);
		System.out.println("전원 성인입니까? " + isAllAdult);
		
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		
		
		
		
		
	}
}
