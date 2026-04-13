package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bingo{
	
	public List<Integer> name;
	
	
	public Bingo() {
		createBoard();
	}
	
	
	public void createBoard() {
		
		Integer result;
		name = new ArrayList<Integer>();
		for(int i = 1; i <= 50; i++) {
			name.add(i);
		}
		Collections.shuffle(name);
		
		while(name.size() > 25) {
			 name.remove(0);
			
		}
			printBoard();
	}
	
	public boolean markNumber(int number) {
		for (int num : name) {
			if (num == number) {
				num = 0;
				printBoard();
				return true;
			}
		}
		printBoard();
		return false;
	}
	
	public void printBoard() {
		System.out.println(name);
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if (name.get(5*i + j) == 0) {
					System.out.print("XX ");
				}
				else {
					System.out.printf("%02d ", name.get(5*i + j));
				}
			} System.out.println();
		}
	}	
	
}