package ex2_interface;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("오디오를 켠다.");
		
		
	}
	int Volume;
		@Override
		public void setVolume(int Volume) {
			if(Volume > RemoteControl.MAX_VOLUME) {
				this.Volume = RemoteControl.MAX_VOLUME;
			}else if(Volume < RemoteControl.MIN_VOLUME) {
				this.Volume = RemoteControl.MIN_VOLUME;
			}else {
				this.Volume = Volume;
			}
		
		}
		
	
}
