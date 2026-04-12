package ex2_annotaion.standaerd;

public class DeprecatedExample {
	
	@Deprecated //더 이상 사용을 권장하징 ㅏㄶ는 기능에 기능에 붙인다.
	public void oldMethod() {
		System.out.println("오래된 메서드");
		
	}
	
	public static void main (String[] args) {
		//oldMethod();
	}
}
