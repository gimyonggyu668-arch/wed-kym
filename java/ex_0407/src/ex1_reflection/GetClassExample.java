package ex1_reflection;

public class GetClassExample {
	public static void main(String[] args) throws Exception{
		
		Class clazz = Car.class;
		
		//방법2
		//경로를 찾아갔는데 클래스가 없을 수도 있기 때문에
		//CLassNotFoundExceptiom 예외가 발생할 수 잇는 코드
		//Class claszz = Class.forName("ex1_reflection.Car");
		
		//방법 3
		//객체를 만들고 getClass() 메서드를 통해서 정보르 얻어온다.
		//Car car new Car();
		//Class clazz = car.getClass();
		
		
		
		System.out.println("패키지 : " + clazz.getPackageName());
		System.out.println("클래스 간단 이름 : "+ clazz.getSimpleName());
		System.out.println("클래스 전체 이름 : " + clazz.getName());
		
		
		
		
	}
}
