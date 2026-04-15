package ex2_file.exam;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		//1.폴더가 없으면 생성
		
		File di = new File("uploads");
		
		boolean result = di.mkdirs();
		
		if(result) {
			
			System.out.println("폴더 생성");
		} else {
			System.out.println("이미 존재하는 폴더");
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		String path = "C:\\Users\\adminn\\Desktop\\web-kym\\java\\ex_0415\\uploads";
		File f = new File(path);
		//2.폴더인지 확인
		if(f.isFile()) {
			System.out.println("파일입니다.");
		}else {
			System.out.println("파일이 아닙니다.");
		}
	
		//3.내부 목록 조회
		File[] files = f.listFiles((d,name) -> name.endsWith(".txt"));
		for(File file : files) {
			System.out.println(file.getName());
		}

	}
}
