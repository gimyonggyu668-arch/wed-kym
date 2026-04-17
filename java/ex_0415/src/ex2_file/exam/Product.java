package ex2_file.exam;

public class Product {
	private String name;
	private int stock;
	
	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void printInfo() {
		System.out.println(name + ":" + stock);
	}
	public void sell(int amount) {
		if(stock <= amount) {
			System.out.println("재고가 부족합니다.");
			return;
		}else {
			System.out.println("판매 완료");
			System.out.println(amount + "개 판매");
		}
	}
	
	
}
