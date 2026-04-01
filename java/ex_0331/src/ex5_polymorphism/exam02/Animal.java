package ex5_polymorphism.exam02;

//추상 클래스
public 
abstract class Animal{
	 int feed;
	 
	 public void breath() {
		 System.out.println("숨쉰다.");
	 }
	
	
	//추상메서드 
	public abstract void sound();
}
