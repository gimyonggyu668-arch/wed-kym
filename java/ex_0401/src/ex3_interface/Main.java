package ex3_interface;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		EmailNotification email = new EmailNotification();
		Notification[] notiy = { new SmsNotification(), new EmailNotification() };

		for (Notification n : notiy) {
			n.send("안녕하세요");
		}

		ClickListener cl = new Login();
		Button bi = new Button();

		bi.setClickListener(cl);
		bi.cilck();

		ClickListener l = new LogoutListener();
		bi.setClickListener(l);

		bi.cilck();

	}
}
