package com.korea.todo;

import org.springframework.stereotype.Repository;

@Repository
//주로 데이터베이스와 상호작용하는 클래스에서 사용되며, CRUD와 같은 데이터베이스 작업을 처리하는데 사용하다.
//스프링이 Bean으로 등록한다.
//다른 계층에서 주입받아 사용할 수 있다.
//JpaRepository<T, ID>
//Spring Data JPA에서 제공하는 기본 인터페이스로 JPA를 사용하여 데이터베이스 작업을 
//쉽게 처리할 수 있도록 도와주는 역할을 한다.
//이 인터페이스는 CRUD 기능과 페이징, 정렬같은 데이터 처리 기능을 기본적으로 제공한다.
public class TodoRepository extends JpaRepositor<TodoEntity, String>{
	// 주요 메서드
	// save(S entity): 엔티티를 데이터베이스에 저장하거나 업데이트한다.
	
	//엔티티 생성
	TodoEntity entity = TodoEntity.builder().title("My first todo item").buil
			
	//TodoEntity 검색
	TodoEntity savedEntity = repository.findById(entity.getId()).get();
	
	//Optional
	//Java 8에서 도입된 클래스로, null값을 안전하게 처리하기 위한 용도로 사용이 된다.
	//findById() 메서드의 결과가 존재 할 수도 있고, 존재하지 않을 수도 있기 때문에
	//null을 반환하는 대신 Optional을 사용하여 결과를 감싸서 반환한다.
	//Optional은 해당 엔티티가 존재하는 지 여부를 확인하고, 존재하면 그 값을 반환하며, 
	//존재하지 않을 경우 추가적인 처리를 할 수 있는 다양한 메서드를 활용한다.

	//isPresent() : 반환된 Optional 객체 안에 값이 존재하면 true, 아니면 false
	
	//get() : Optional안에 값이 존재할 때 그 값을 반환한다.
	//만약 값이 없는데 get()을 호출하면 NosuchElementException이 발생할 수 있다.
	
	//orElse(T other) : 값이 존재하지 않을 때 기본값을 반환한다.
	
	return savedEntity.getTitle();
	
	
			
			
			
			
			
			
	
}
