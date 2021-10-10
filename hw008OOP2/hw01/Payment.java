package hw008OOP2.hw01;

public interface Payment extends Comparable<Employee> {
	
	double calculatePay(); 
	
	
	@Override
	default int compareTo(Employee e) {
		return  (int)(this.calculatePay() - e.calculatePay());
	}
		
	

}
