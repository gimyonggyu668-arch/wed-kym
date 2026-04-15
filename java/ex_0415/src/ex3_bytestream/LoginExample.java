package ex3_bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\adminn\\Desktop\\web-kym\\java\\ex_0415");
		byte[] read = new byte[(int) f.length()];
		Scanner sc = new Scanner(System.in);

		try {
			FileInputStream fis = new FileInputStream("member.txt");
			fis.read(read);
			String ori = new String(read);

		} catch (Exception e) {
			// TODO: handle exception
		}

		while (true) {
			System.out.println("아이디를 입력하시오: ");
			String id = sc.nextLine();
			if (!id.equals(read)) {
				System.out.println("아이디가 틀렸습니다 다시 입력해주십시오.");
			} else {

			}
		}
	}
}
