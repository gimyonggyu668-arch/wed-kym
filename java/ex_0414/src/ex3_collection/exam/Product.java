package ex3_collection.exam;
//재고관리 프로그램에서 각 클래스의 역할이 뭔지 알면 좋음
//Product 클래스로 만들어진 객체 -> 하나의 상품
public class Product {
	private String code;
	private String name;
	private int price;
	private int stock;

	public void setProduct(String code, String name, int price, int stock) {
		this.code = code;	//제품코드
		this.name = name;	//제품명
		this.price = price;	//가격
		this.stock = stock;	//재고
	}

	//객체를 만들면서 필드에 값을 넣겠다.(초기화)
	public String toString() {
		return "Product { code = " + code + ", name = " + name + ", price = " + price + ", stock = " + stock + " }";

	}
	//필드의 값을 반환
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
