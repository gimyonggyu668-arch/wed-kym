package ex5_static;

public class CalculatorMain {
    public static void main(String[] args) {
        // 정적 필드, 정적 메서드는 객체 생성없이 호출하여 사용할 수 있다.
        // 사용방법: 클래스명.필드명 / 클래스명.메서드명();

        // 1. 정적 필드 출력
        System.out.println(Calculator.pi);

        // 2. 정적 메서드 호출 (중첩 호출 예시)
        int sum = Calculator.plus(3, 4);
        System.out.println(Calculator.plus(sum, 10)); // 이런 식으로 결과를 다시 전달해야 확인이 가능합니다.

        int diff = Calculator.minus(3, 4);
        System.out.println(diff);
    }
}
	

