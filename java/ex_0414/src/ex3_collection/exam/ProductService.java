package ex3_collection.exam;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	Product p = new Product();
	List<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		for (Product p : products) {
			if (p.getCode().equals(product.getCode())) {
				System.out.println("이미 존재하는 상품 코드입니다.");
				return;
			}
			products.add(product);

		}
	}

	public void printAllProducts() {
		for (Product p : products) {
			System.out.println(p);
		}
	}

	public Product findByCode(String code) {
		for (Product p : products) {
			if (p.getCode().equals(code))
				return p;
		}
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}