package ex4_constructor;

public class person {
	 	String name;
	 	int age;
	 	
	 	
	 	
	 	//생성자 선언
	 	public person(String name, int age) {
	 			
	 		this.name = name;
	 		this.age = age;
	 	}
	 	public void introduce() {
	 		System.out.println("안녕하세요, 저는 " + age + "살" + name + "입니다.");
	 	}
}
