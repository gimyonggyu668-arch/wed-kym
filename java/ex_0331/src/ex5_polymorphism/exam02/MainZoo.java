package ex5_polymorphism.exam02;

public class MainZoo {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		//Animal a = new Animal(); 추상 클래스는 객체를 직접 생성할 수 없다.
		
		
		z.printSound(new Dog());
		z.printSound(new Cat());
		
		
		
		
		
	}
}
