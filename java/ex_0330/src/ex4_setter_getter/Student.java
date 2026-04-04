package ex4_setter_getter;

public class Student {
	private String name;
	private int age;
	
	//하나에 하나의 필드만 설정
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("잘못된 나이입니다.");
			return;
		}else {
			this.age = age;
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
}
