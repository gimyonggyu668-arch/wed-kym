package ex6_sealed;

public sealed class Person permits Employee, Manager{

	
	String name;
	
	public void work() {
		System.out.println("하는 일이 결저오디지 않았습니다.");
	}
	
	
	
}
