package oop.poly;

public class Secretary extends Employee implements Bonus{
	public Secretary() {
		
	}
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	@Override
	public void incentive(int pay) {
		setSalary(getSalary()+pay*80/100);
	}
	@Override
	public double tax() {
		double tax = getSalary()*0.1;
		return tax;
	}
	
}