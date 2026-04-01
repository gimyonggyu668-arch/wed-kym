package ex2_interface;

//리모컨에 대한 가이드라인 (인터페이스)
public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;// 생략해도 상수 취급을 한다.
	
	//추상 메서드
	public void turnOn();
	public void setVolume(int Volume);
	
	//디폴트 메서드
	//디폴트 메서드에는 실행부가  있다.
	//상수 필드를 읽거나 추상 메서드를 호출하는 코드를 작성할 수 있다.
	default void setMute(boolean Mute) {
		if(Mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
			
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적메서드
	//static메서드는 구현 객체가 없어도 인터페이스만으로 호출할 수 있다.
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교체합니다.");
	}
	
	//private메서드
	//인터페이스 외부에서 접근할 수 없는 메서드
	@SuppressWarnings("unused")
	private void config() {
		System.out.println("설정모드로 접근");
	}
	
	
	
	
	
	
	
	
	
	
}
