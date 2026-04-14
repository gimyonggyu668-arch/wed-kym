package ex1_lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		CalculatorService cs = new CalculatorService();
		
		
		Calculator c = (a,b) -> a+b;
		
		cs.execute(c);
		cs.execute((a,b) -> a-b);
		
		
		//람다식을 반환 받아서 사용 
		Calculator add = cs.getCalculator("add");
		
		Calculator sub = cs.getCalculator("sub");
		System.out.println(add.calc(2, 4));
		System.out.println(sub.calc(8, 6));
		
		
		
		
		TextService ts = new TextService();
		
		String text = "This product is currently out of stock";
		
		String result = ts.processText(text, str -> str.toUpperCase());
		System.out.println(result);
		
		String result1 = ts.processText(text, str -> str.replace("out of stock", "in stock"));
		
		System.out.println(result1);
		
		
		
		
		UserFilter n = (UserFilter) new User(result1, 0, result1);
		
		
		
		
		
		
		
		
		
		List<User> users = new ArrayList<>();
		users.add(new User("김철수", 25, "서울"));
		users.add(new User("이영희", 18, "인천"));
		users.add(new User("김민수", 30, "부산"));
		users.add(new User("박지은", 22, "서울"));
		
		
		UserService service = new UserService();
		System.out.println("성인 회원");
		
		
		service.filterUssers(users, service.getFilter("adult"));
		System.out.println("-------");
		System.out.println("서울 거주 회원");
		service.filterUssers(users, service.getFilter("seoul"));
		System.out.println("-------");
		System.out.println("김씨 회원");
		service.filterUssers(users, service.getFilter("kim"));
		
		
		
		
	}
}
