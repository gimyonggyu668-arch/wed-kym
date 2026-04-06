package ex2_system;

import java.util.Properties;
import java.util.Set; // Set 인터페이스를 사용하기 위해 필요합니다.

public class PropertyExample {
    public static void main(String[] args) {
        
        // 1. 개별 속성 읽기: System.getProperty("키")를 사용합니다.
        String osName = System.getProperty("os.name");   // 운영체제 이름 (예: Windows 11)
        String userName = System.getProperty("user.name"); // 현재 로그인된 사용자 계정
        String userHome = System.getProperty("user.home"); // 사용자의 홈 디렉토리 경로
        
        System.out.println("OS: " + osName);
        System.out.println("User: " + userName);
        System.out.println("Home: " + userHome);
        
        System.out.println("--------------------------------------------------");
        
        // 2. 전체 속성 목록 가져오기
        Properties props = System.getProperties(); // 시스템의 모든 정보를 Properties 객체에 담습니다.
        Set keys = props.keySet();                // 정보들의 '이름(Key)'만 모아서 Set에 저장합니다.
         
        // 3. 반복문을 통해 모든 정보 출력하기
        for(Object objkey : keys) {
            String key = (String) objkey;          // Object 타입을 String으로 변환(캐스팅)합니다.
            String value = System.getProperty(key); // 각 키에 해당하는 실제 값을 가져옵니다.
            
            // printf를 사용하면 %-40s(40칸 왼쪽 정렬)를 통해 깔끔하게 줄을 맞출 수 있습니다.
            System.out.printf("%-40s: %s\n", key, value);
        }
    } // main 메소드 끝
} // class 끝
		
		
	
	

