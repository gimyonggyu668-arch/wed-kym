package ex1_generic.superEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
	//List<? super Dog> list 에서 허용되는 타입
	//List<Dog>, List<Animal>. :ost<Object>
	//List<Puppy>는 안됨
	public static void addDog(List<? super Dog>list) {
		list.add(new Dog());
		list.add(new Puppy()); //Puppy 객체는 Dog로 취급함
	}
	
	
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		
		
		
		addDog(animalList);
	
		addDog(dogList);
		
		//addDog(PuppyList);
			//"이건 불가능"
		
		//각 리스트에 들어있는 객체의 메서드 호출하기
		
		System.out.println("animalList : ");
		for(Object o : animalList) {
			((Animal)o).speak();
			
		}
		System.out.println("dogList :");
		for(Dog o : dogList) {
			o.speak();
		}
		
		
		
		
		
		
	}
	
}
