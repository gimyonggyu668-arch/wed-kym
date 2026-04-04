package ex4_constructor;

public class person {
	 	String name;
	 	int age;
	 	
	 	
	 	
	 	//생성자 선언
	 	//매개변수와 클래스의 멤버변수와 이름이 같다면 
	 	//매개변수의 사용 우선순위가 더 높다.
	 	//생성자 (메서드) 를 호출한 객체의 필드임을 명시하기 위해서
	 	//this라는 키워드를 사용한다.
	 	public person(String name, int age) {
	 			
	 		this.name = name;//this가 없다면 챗바퀴돌듯이 함수 내에서만 둘이 같다는 것만 증명함
	 		this.age = age;
	 	}
	 	public void introduce() {
	 		System.out.println("안녕하세요, 저는 " + age + "살" + name + "입니다.");
	 	}
}
