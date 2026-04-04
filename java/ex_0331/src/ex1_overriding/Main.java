package ex1_overriding;

public class Main {
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		d.sound();
		Cat c = new Cat();
		c.sound();
		
		
		PartTimeEmployee k = new PartTimeEmployee(2, 10000, "김용민");
		System.out.println(k.name + "님의 여");
		System.out.println(k.getPay() + "원");
		
		
		
	}
}
