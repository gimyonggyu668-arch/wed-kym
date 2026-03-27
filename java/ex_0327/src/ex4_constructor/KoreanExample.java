package ex4_constructor;

public class KoreanExample {
    public static void main(String[] args) {
        // k1 객체 생성
        Korean k1 = new Korean("박자바", "011225-1234567");
        k1.printInfo();
        
        System.out.println("--------------------");

        // k2 객체 완성: 필드명과 매개변수가 같으면 툴팁(도움말)에 
        // name, ssn이라고 떠서 훨씬 입력하기 편해집니다.
        Korean k2 = new Korean("김자바", "950101-2345678");
        k2.printInfo();
    }
}