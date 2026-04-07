package ex1_reflection.resource;

public class GetResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		//이미지의 경로 얻어오기
		
		//같은 패키지에 있는 photo1.jpg파일의 경로 가져오기
		//getResource() : 클래스가 있는 위치 기준으로 파일 찾기
		//getPath(): 실제 파일 경로를 문자열 반환
		
		String Path1 = clazz.getResource("photo1.jpg").getPath();
		String Path2 = clazz.getResource("images/photo1.jpg").getPath();
	}
}
   