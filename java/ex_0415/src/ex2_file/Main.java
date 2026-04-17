package ex2_file;

import java.util.ArrayList;

import ex2_file.exam.Member;

public class Main {
	public static void main(String[] args) {
		 ArrayList<Member> m = new ArrayList();
		 
		 
		 m.add(new Member("홍길동", 20, "hong"));
		 
		 int count = 0;
		 for(Member f : m) {
			 if(f.getAge() >= 20) {
				 count++;
				 System.out.println(count);
			 }
			f.printInfo();
		 }
		 
		 
	}
}
