package ex2_object;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj = new Object();
		
		obj.toString();
		
		
		SmartPhone myPhone = new SmartPhone("삼성전자","안드로이드");
		
		System.out.println(myPhone);
		
		
		
		Product[] products = {
				new Product("키보드",5000,10),
				new Product("마우스",25000,10),
				new Product("모니터",30000,10)
		};
		
		for (int i = 0; i < products.length; i++) {
		    System.out.print((i + 1) + "번 상품: ");
		    System.out.println(products[i].toString());
		}

		
		
		
		
		}
	}

