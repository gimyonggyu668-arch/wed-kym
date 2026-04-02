package ex4_innerclass.instanceclass;

public class Order {
	int orderNumber;
	
	public Order(int orderNumber) {
		this.orderNumber = orderNumber;//생성자를 통해서 필드 초기화
	}
	
	class Item{
		String name; //상품정보, 주문번호 필드
		int price;
		int count;
		
		public Item(String name, int price, int count) {
			this.name = name;
			this.price = price;
			this.count = count;
		}
		
		void printInfo() {
			System.out.println("상품명 : " + name +", 가격 : " + price + "원, 수량 : " + count +"개");
		}	
		
	}
	
	void printOrderInfo(Item item) {
		System.out.println("주문번호 : " + orderNumber);
		item.printInfo();
	}
	
	
	
	
	
	
	
	
	
	
	
}