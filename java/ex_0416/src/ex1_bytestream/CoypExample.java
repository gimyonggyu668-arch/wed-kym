package ex1_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CoypExample {
	public static void main(String[] args) {
		//상대경로에 있는 이미지 파일을 바이트기반 스트림으로 읽어오기
		//복사본 만들기 복사본 이름 : wall_copy.jpg
		//복사하면서 걸리는 시간을 currentTimeMillis();로 측정하기
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
            // 1. 시작 시간 기록
            long startTime = System.currentTimeMillis();

            in = new FileInputStream("wall.jpg");
            out = new FileOutputStream("wall_copy2.jpg");
            byte[] buffer = new byte[512];
            int data;
            // 2. read()가 -1을 반환할 때까지 반복
            while ((data = in.read(buffer)) != -1) {
                // buffer의 0부터 data개수 만큼 출력파일에 기록
                out.write(buffer,0,data);
            }
            //파일은 4mb
            //우리 전달한 배열은 512byte
            //우리가 전달한 파일을 512바이트씩 잘라서 여러번 읽고 쓰는 방식
            
            
            // 3. 종료 시간 기록 및 결과 출력
            long endTime = System.currentTimeMillis();
            System.out.println("복사 완료!");
            System.out.println("걸린 초: " + (endTime - startTime)/1000);

        } catch (Exception e) {
            e.printStackTrace(); // 어디서 오류 났는지 출력
        } finally {
            // 4. 통로 닫기 (사고가 나든 안 나든 무조건 닫아야 함)
            try {
            	//닫을 때는 역순으로 닫는다.
            	if (out != null) out.close();
                if (in != null) in.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
