package ex4_setter_getter;

public class Main {
	
	public static void main(String[] args) {
		
	
	Student s = new Student();
	
	s.setName("김용민");
	s.setAge(-10);
	System.out.println(s.getName());
	
	
	User u = new User();
	
	u.setUserName("김용가리치킨");
	u.setPassword("1234567");
	u.userInfo();

	}
}