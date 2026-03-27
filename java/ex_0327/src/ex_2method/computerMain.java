package ex_2method;

public class computerMain {

	public static void main(String[] args) {
		Computer c = new Computer();
		
		//1,2,3,4,5
		
		int sum = c.sum(1,2,3,4,5);
		System.out.println("총 합:"+ sum);
		
		sum = c.sum(1,2,3);
		System.out.println("종합:"+ sum);
	}

}
