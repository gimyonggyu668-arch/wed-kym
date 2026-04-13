package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 	public class Lion {
 		Pet n;
	
	public Lion(Pet n) {
	    this.n = n;
	    }
	List<String> list = new ArrayList<>(Arrays.asList(
			"어흥","육고기 내놔","죽는다","밥 줘!","크앙"
			));
	public void Llion() {
		Collections.shuffle(list);
		String value = list.get(0);
		System.out.println(n.getName() + ": "+value);
		
	}
	
	
}
