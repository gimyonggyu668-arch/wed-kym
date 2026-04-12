package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cat {
	
 	Pet n;
 	
	
	public Cat(Pet n) {
	    this.n = n;
	    }
	List<String> list = new ArrayList<>(Arrays.asList(
			"바보야","배고파(꼬르르)","너 뭐함(냥)","참치 줘!","놀아줘(냐옹)"
			));
	public void Express() {
		Collections.shuffle(list);
		String value = list.get(0);
		System.out.println(n.getName() + ": "+value);
		
	}
}

