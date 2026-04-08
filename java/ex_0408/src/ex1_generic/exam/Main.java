package ex1_generic.exam;

public class Main {
	public static void main(String[] args) {
		GenericBox<String> box = new GenericBox<String>();
		box.setItem("사과");
		System.out.println(box.getItem());
		
		GenericBox<Integer> box1 = new GenericBox<Integer>();
		box1.setItem(100);
		System.out.println(box1.getItem());
		
		
		Member m = new Member("김용민", 20);
		MemberResponse<Member> M = new MemberResponse<Member>(true, "회원 조회 성공", m);
		System.out.println("성공여부: " + M.isSuccess());
		System.out.println("메시지: " + M.getMessage());
		System.out.println("이름: " + M.getData().getName());
		System.out.println("나이: " + M.getData().getAge());
		
		
		AnimalHospital<Dog> dogHospital = new AnimalHospital<Dog>(new Dog());
		AnimalHospital<Cat> catHospital = new AnimalHospital<Cat>(new Cat()); 
		
		
		//동물병원은 동물만 다루는 곳인데
		//문자열이나 숫자 다른 객체가 들어오면 이상해진다.
		
		dogHospital.treat();
		catHospital.treat();
		
		
	}
}
