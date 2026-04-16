package ex2_charstream.exam;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("hello.txt", true);
			fw.write("\n첫 번째 줄 작성합니다.\n");
			fw.write("두 번째 줄 작성합니다.");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
