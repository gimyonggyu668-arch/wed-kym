package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dog {
	
 	Pet n;
	
	public Dog(Pet n) {
	    this.n = n;
	    }
	
	List<String> list = new ArrayList<>(Arrays.asList(
			"바보야","배고파","너 뭐함","밥 줘!","놀아줘"
			));
	public void Talent() {
		Collections.shuffle(list);
		String value = list.get(0);
		System.out.println(n.getName() + ": "+value);
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
