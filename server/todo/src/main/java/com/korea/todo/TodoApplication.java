package com.korea.todo;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoApplication {
	
	private int id;
	private String name;
	private String course;
	private String email;
}


@GetMapping
public ResponseEntity<?> getStudent{
	
}

//데이터를 주소에 넣어서 보낸게 아님
//api/students/ ,...
//api/ students?

//수강생등록
@PostMapping 
public Responseentity<?> addStudent(){
	
}

//수강생등록
@PostMapping 
public void addStudent( 
		@RequestBody StudentDTO studentDTO) {
	
}
