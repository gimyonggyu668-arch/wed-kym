package service;

      //패키지 적고 클래스 명
import member.Member;  //다른 패키지에 있는 메서드를 사용하기 위한 선언


//실제 기능을 만드는곳
public class MemberService {
	
	
	public void register(Member member) {  //member 메서드를 사용하기 위한 호출
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : " + member.getName());  //getName 호출로 메인 -> member 필드 -> 여기로 이동해서 정보 값을 받음 
		System.out.println("회원 나이 : " + member.getAge()+ "살");
		System.out.println("회원 등록이 완료되었습니다.");
		
			
	}
	
	public void checkAdult(Member member) {
		if(member.getAge() >= 20) {
			System.out.println("성인 회원입니다.");
		}else {
			System.out.println("미성년자 회원입니다.");
		}
	}
	
	
	
	
}
