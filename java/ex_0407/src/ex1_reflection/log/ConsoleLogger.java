package ex1_reflection.log;

public class ConsoleLogger implements Logger{
	@Override
	public void log(String message) {
		System.out.println("[Console] 로그출력 : " + message);
	}
}
