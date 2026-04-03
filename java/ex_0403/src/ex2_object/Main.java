package ex2_object;

public class Main {
	public static void main(String[] args) {
		
	
	
	
	Object[] arr = {"Java", 100, 3.14, new Employee("홍길동","개발팀")};
	
	//반복문으로 배열을 순회하면서
	//문자열이면 "문자열 데이터 : xx"
	//정수면 "정수데이터: xx"
	//Employee 객체면 이름과 부서를 출력해주세요
	
	for(Object o : arr) {
		
		
	if(o instanceof String) {
		System.out.println("문자열 데이터 :" + o);
		
	}else if(o instanceof Integer)
		System.out.println("정수 데이터 : "+ o);
	else if(o instanceof Double) 
		System.out.println("실수 데이터 : "+ o);
	else if(o instanceof Employee) {
		Employee e = (Employee)o;
		System.out.println("사원명: "+ e.name + "\n부서: " + e.dept);
	}
	}
	
	
	
	
	
	
	}
}
