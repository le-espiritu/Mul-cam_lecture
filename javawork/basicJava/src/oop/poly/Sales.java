package oop.poly;

public class Sales extends Employee implements Bonus{
	public Sales() {
	}
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	public double tax() {
		double tax = getSalary()*0.13;
		return tax;
	}
	public void incentive(int pay) {
		int salary = 0;
		setSalary(getSalary()+(int)(pay*120/100));
		System.out.println(123);
	}
}