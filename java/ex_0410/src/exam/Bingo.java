package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo{
	public static void main(String[] args) {
		Integer result;
		List<Integer> name = new ArrayList<Integer>();
		for(int i = 1; i <= 50; i++) {
			name.add(i);
		}
		Collections.shuffle(name);
		
		while(name.size() > 25) {
			 name.remove(0);
			
		}
		System.out.println(name);
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%02d ", name.get(5*i + j));
			}
			System.out.println();
		}

	
		}
	
}