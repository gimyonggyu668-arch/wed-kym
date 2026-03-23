package ex2_casting;

public class StringConvertExample {
	public static void main(String[] args) {
		//문자열 -> 기본타입      //메서드(기능)
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		                //자바에서 기본적으로 제공하는 class     
		
		
		//정수로 바꿔서 계산해 출력해도 계산은 실수와 정수로 계산 되고 출력 값이 정수로 나온다.
		int v1 = (int)(value1 + value2);
		System.out.println(v1);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//기본타입 -> 문자열 
		//String.valueOf(데이터)
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf("true");
		
		
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
