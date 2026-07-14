package dto2;

import java.util.List;

//http 응답으로 사용할 DTO
public class BookDTO<T> {
	private String error;
	private List<T> data;
	
	
	//비즈니스 계층
	//표현계층과 영속계층 사이에서 비즈니스 로직을 수행하는 역할을 한다.
	//HTTP와 긴밀히 연결된 컨트롤러에서 분리돼 있고, 또 데이터베이스와 긴밀히 연결된 
	//영속계층과도 분리되어 있다.
	//따라서 우리가 개발하고자 하는 로직에 집중할 수 있다.
	
	//TodoService를 필드로 갖고 객체를 생성자 주입을 한다.
	
	// /test 로 요청이 들어오면 testTodo라는 메서드가 실행되고
	// 서비스의 메서드를 실행하여 응답으로 반환한다.
	
	
}
