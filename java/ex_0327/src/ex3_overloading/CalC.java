package ex3_overloading;

public class CalC {

    // 1. 직사각형의 넓이를 구하는 메서드 (가로, 세로)
    // 조건: 메서드 내에서 출력하고 종료 (반환값 없음 -> void)
    public void area(int width, int height) {
        int result = width * height;
        System.out.println("직사각형의 넓이: " + result);
    }

    // 2. 오버로딩: 정사각형의 넓이를 구하는 메서드 (한 변의 길이)
    // 조건: 넓이를 반환한다 (반환값 있음 -> int)
    public int area(int length) {
        return length * length; // 오타 수정: retrun -> return
    }
}