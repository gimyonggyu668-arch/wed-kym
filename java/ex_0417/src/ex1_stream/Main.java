package ex1_stream;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Member> m = Arrays.asList();
		
		m.add(new Member(1,"홍길동", "ACTIVE"));
		m.add(new Member(2,"김철수", "INACTIVE"));
		m.add(new Member(3,"이영희", "ACTIVE"));
		m.add(new Member(4,"박민수", "INACTIVE"));
		m.add(new Member(5,"최지은", "ACTIVE"));
	
		
		m.stream()
		.filter(b -> b.getStatus().equals("ACTIVE"))
		.forEach(System.out::print);
		
		
		
		
	
	
	
	
	
	}
	
	
	
	
	
}
