package ex3_generic.exam;



public class Main {
	public static void main(String[] args) {
		String [] name = {"김철수","이영희","박민수"};
		Integer[] nums = {10,20,30};
		
		
		ArrayPrinter c = new ArrayPrinter();
		c.printArray(name);
		System.out.println();
		
		c.printArray(nums);
		System.out.println();
		
	}
}
