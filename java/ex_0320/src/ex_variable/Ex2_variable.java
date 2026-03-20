package ex_variable;

public class Ex2_variable {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		//변수를 변환해봐라
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x :" + x);
		System.out.println("y :"+ temp);
		
	}

}
