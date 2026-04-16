package ex3_collection.exam;

import java.util.ArrayList;
import java.util.List;

//상품관리 기능들이 모여있는 클래스
public class ProductService {
	Product p = new Product();
	//제품을 담기 위한 리스트
	private List<Product> productList = new ArrayList<Product>();
	
	//제품 추가하기
	public void addProduct(Product product) {
		//제품코드가 같으면 추가하면 안된다.
		for (Product p : productList) {
			if (p.getCode().equals(product.getCode())) {
				System.out.println("이미 존재하는 상품 코드입니다.");
				return;
			}
			productList.add(product);

		}
	}
	
	public void printAllProducts() {
		 System.out.println("=== 전체 상품 목록 ===");//오버라이딩 된 to String이 같이 쓰임
		for (Product p : productList) {
			System.out.println(p);
		}
	}
    
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
