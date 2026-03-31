package ex1_overriding;

public class PartTimeEmployee extends Employee {
	int time;
	int pay;

	@Override
	public int getPay() {
		return pay * time;

	}

	public PartTimeEmployee(int time, int pay, String name) {
		
		super(name);
		this.time = time;
		this.pay = pay;
		
			
		
	}
}
