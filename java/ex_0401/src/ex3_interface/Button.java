package ex3_interface;

public class Button {
	private ClickListener listener;

	public void setClickListener(ClickListener listener) {
		this.listener = listener;
	}

	public void cilck() {
		listener.onClick();
	}

}
