package ex2_charstream.exam;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;



public class FileConverter {
	public void copy(String source, String target) {
		FileInputStream in = null;
		FileOutputStream out2 = null;
		
		try {
			
			in = new FileInputStream(source);
			out2 = new FileOutputStream(target);
			
			byte[] buffer = new byte[1024];
			int len;
			long totalBytes = 0;
			while ((len = in.read(buffer)) != -1) {
				out2.write(buffer, 0, len);
				totalBytes += len;
			}
			in.close();
			out2.close();
			
			//로그기록
			FileOutputStream logFos = new FileOutputStream("log.txt, true");
			String logMsg = "복사 완료 : " + totalBytes + "bytes\n";
			logFos.write(logMsg.getBytes());
			logFos.close();
		} catch (IOException e) {
	   
	   
	    }
	}
}