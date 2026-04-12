package exam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		List<Cat> cats = new ArrayList<>();
		
		AnimalPrint ap = new AnimalPrint();
		
		ap.printAnimal(dogs);
		ap.printAnimal(cats);
		
		List<Integer> a2 = Arrays.asList(1,2,3,4,5);
		List<Double> a1 = Arrays.asList(1.2,2.2,3.3,4.4,5.5);
		System.out.println(sum(a1));
		System.out.println(sum(a2));
		
	}
	
	public static double sum(List<? extends Number>list) {
		double total = 0;
		for(Number n : list) {
			total += n.doubleValue();
			
		}
		return total;
		
	}
	
	
	
	
}
