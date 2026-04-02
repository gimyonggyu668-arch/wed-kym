package ex1_innerclass.hiddenclass;

public class Main {
	public static void main(String[] args) {
	
	//익명클래스는 인터페이스에서 많이 활용된다.
	Calculator cal = new Calculator() {
		
		//접근제한자를 부모보다 좁게 줄일 수 없다.
		@Override
		public void add(int x, int y) {
			int result = x + y;
			System.out.println("두 수의 합은 " + result + " 입니다.");
		}
	};

		cal.add(12, 12);
	
	}
}
