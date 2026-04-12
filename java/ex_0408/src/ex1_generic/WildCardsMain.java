package ex1_generic;

import java.util.Arrays;
import java.util.List;

public class WildCardsMain {
	public static void main(String[] args) {
		Wildcards wc = new Wildcards();
		
		List<String> list1 = Arrays.asList("A","B","C");
		List<Integer> list2 = Arrays.asList(1,2,3);
		List<Double> list3 = Arrays.asList(1.5,2.9,3.2);
		wc.printList(list1);
		wc.printList(list2);
		wc.printList(list3);
		
	}
}
