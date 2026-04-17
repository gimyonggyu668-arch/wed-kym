package ex2_file.exam;

public class Member {
	 String id;
	 String name;
	 int age;
	
	public Member(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}

	public void printInfo() {
		System.out.println("아이디: " + id + "이름: " + name + "나이: " + age);
	}
	
	
}
