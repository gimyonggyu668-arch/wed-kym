package ex3_generic;

class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}

public class FruitsExample { // 1. 메인 클래스 시작

    // 2. 내부 클래스로 만드셨으므로 static을 붙여야 메인에서 바로 사용 가능합니다.
    static class FruitBox<T>{ 
        private T[] fruits;
        private int size;
        
        @SuppressWarnings("unchecked")
        public FruitBox() {
            fruits = (T[])new Object[10];
        }

        public void add(T fruit) {
            fruits[size++] = fruit;
        }
            
        public T get (int index) {
            return fruits[index];
        }

        public int size() {
            return size;
        }
    } // FruitBox 끝

    public static void main(String[] args) {
        // 3. FruitBox 객체 생성 및 코드 완성
        FruitBox<Fruit> box = new FruitBox<Fruit>();
        box.add(new Apple());
        box.add(new Banana());
        
        System.out.println("박스 크기: " + box.size());
    }
} // FruitsExample 끝
	

