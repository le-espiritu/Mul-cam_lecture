package oop.poly;

public class DDR5 extends Content{
	String company;
	public DDR5() {
	}
	public DDR5(String title, String company) {
		super(title);
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public void totalPrice() {
		if(company.equals("LG")) {
			price = 100000;
		}else if(company.equals("SAMSUNG")) {
			price = 150000;
		}else if(company.equals("SK")) {
			price = 100000;
		}else {
			price = 50000;
		}
		
	}

	

}
