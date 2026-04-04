package ex2_object;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
		
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
	}
	
}
	class Product {
		String name;
		int price;
		int stock;
		
		
		
		
		public Product(String name, int price, int stock) {
			this.name = name;
			this.price = price;
			this.stock = stock;
		}
		
		
		public String toString() {
			return "상품명: " + name + " | 가격: " + price + "원 | 재고: " + stock + "개";
		}


	
		}
		
		
		
		
	
	

