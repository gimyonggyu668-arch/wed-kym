package ex1_final;

public class KoreanMain {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567","김용민");
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		//final 필드
		//k1.ssn = "123-12-1234";
		//k1.name = "나카무라";
		
		
	}
}
