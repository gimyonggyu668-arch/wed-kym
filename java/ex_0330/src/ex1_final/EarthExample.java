package ex1_final;

public class EarthExample {
    public static void main(String[] args) {
        // Earth 클래스에 정의된 static 멤버임을 명시
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + " km²");
    }
}