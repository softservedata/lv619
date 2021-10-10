package hw008OOP2.hw01;

public class ContractEmployee extends Employee {
	
	private int federalTaxIdmember;
	
	private double fixed_monthly_payment;
	
	public ContractEmployee(String name, int id, int federalTaxIdmember, int fixed_monthly_payment) {
		super(name, id);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixed_monthly_payment = fixed_monthly_payment;
	}
	@Override
	public double calculatePay() {
		return fixed_monthly_payment;
	}
	
	

}
