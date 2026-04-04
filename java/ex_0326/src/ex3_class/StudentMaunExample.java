package ex3_class;



public class StudentMaunExample {
	public static void main(String[] args) {
		StudentMaun student = new StudentMaun();
		@SuppressWarnings("unused")
		String arr1;
		@SuppressWarnings("unused")
		int arr;
		student.name = "김용민";
		student.age = 20;
		student.score = 87;
		
		
		System.out.println("이름: "+ student.name);
		System.out.println("점수: "+ student.score);
		System.out.println("나이: " + student.age);
	}
}
