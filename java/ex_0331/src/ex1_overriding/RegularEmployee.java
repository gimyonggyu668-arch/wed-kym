package ex1_overriding;

public class RegularEmployee extends Employee{
	
	int salary;
	
	@Override
	public int getPay() {
		return salary;
	}
	
	public RegularEmployee(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
}
