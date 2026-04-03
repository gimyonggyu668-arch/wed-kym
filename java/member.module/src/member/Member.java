package member;


//자바에서 앞글자가 대문자로 시작하는것
//클래스명, 인터페이스명, 열거형

//내가 회원관리 프로그램에서 "회원"의 정의
public class Member {
	
	
	
	private String name;//여기서 객체를 받을, 필드 준비
	private int age;
	
	//생성자 
	//접근제한자 클래스명(매개변수)
	
	//필드에 값을 넣어주는 방법
	//1.필드에 직접 넣는다.(private일 경우 불가능)
	//2.생성자를 통해서 초기화 한다.
	//3.setter를 통해서 대입한다.
	
	//this : 이 해당 메서드를 호출한 객체의 정보
	public Member(String name, int age) { //메인에서 받은 객체를 필드 이동하기 위한 초기화
		this.name = name;
		this.age = age;
	}
	
	
	
	//setter & getter
	//한번에 한가지 필드만 세팅하거나 반환
	//set필드명, get필드명
	
	public String getName() { //여기서 받고 MemberService 에다가 반환 해줄 함수를 만듬
		return name;
	}
	public int getAge() {
		return age;
	}
	
}





