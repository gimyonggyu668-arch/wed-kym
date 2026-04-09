package ex1_List.ArrayList.product;

public class Product {
    private String name;
    private int price;
    private int quantity;

    // 1. 기본 생성자
    public Product() {}

    // 2. 매개변수가 있는 생성자 (Cart에서 new Product(name, price, quantity) 할 때 필요!)
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 3. Getter와 Setter (Cart에서 .getName(), .setQuantity() 쓸 때 필요!)
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}