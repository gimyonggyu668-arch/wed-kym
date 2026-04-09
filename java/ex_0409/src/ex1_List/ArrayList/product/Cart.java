package ex1_List.ArrayList.product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cart = new ArrayList<>();

    // 상품 추가 메서드
    public void addProduct(String name, int price, int quantity) {
        
        // [순서 1] 이미 있는 상품인지 보따리(cart)를 뒤진다
        for(Product p : cart) {
            if(p.getName().equals(name)) {
                // 이름이 같으면 수량만 올리고 메서드 종료(return)
                p.setQuantity(p.getQuantity() + quantity);
                System.out.println("기존 상품[" + name + "] 수량 증가 완료");
                return; 
            }
        }
        
        // [순서 2] 반복문을 다 돌았는데도 return을 못 만났다? (=새로운 상품이다)
        // 그때서야 리스트에 새 객체를 만들어 넣는다.
        cart.add(new Product(name, price, quantity));
        System.out.println("신규 상품[" + name + "] 장바구니 추가 완료");
    }

    // 장바구니 전체 보기 (테스트용으로 추가해두면 좋음)
    public void showCart() {
        System.out.println("========= 장바구니 목록 =========");
        for(Product p : cart) {
            System.out.println("품명: " + p.getName() + " | 가격: " + p.getPrice() + " | 수량: " + p.getQuantity());
        }
    }
}