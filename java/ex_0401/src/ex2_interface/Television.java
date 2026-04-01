package ex2_interface;

public class Television implements RemoteControl{
	
	int Volume;
	
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켠다.");
	
		
	}
	
	//볼륨을 조절하는 setVolume 메서드 오버라이딩하기
	//넘어온 볼륨값이 MAX 보다 크면 필드를 MAX로 세팅
	//그게 아니면 넘어온 볼륨값으로 필드를 세팅
	@Override
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
		}else if(Volume< RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		}else {
			this.Volume = Volume;
		}
	
	}
	
	
	
	

}
