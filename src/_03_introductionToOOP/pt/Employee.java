package _03_introductionToOOP.pt;

class Employee {
	////////////////////////////////////////////////////////////////////////////
	static double totalSum = 0;
	private String name;
	private int rate;
	private int hours;
	////////////////////////////////////////////////////////////////////////////
	Employee(){}
	Employee(String name, int rate){
		if(!name.equals(null) && name.length() > 1)
			this.name = name;
		if(rate > 0)
			this.rate = rate;
	}
	Employee(String name, int rate, int hours){
		this(name, rate);
		if(hours >= 0)
			this.hours = hours;
		totalSum += (getBonuses() + getSalary()); 
	}
	////////////////////////////////////////////////////////////////////////////
	String getName() {return name;}
	int getRate() {return rate;}
	int getHours() {return hours;}
	////////////////////////////////////////////////////////////////////////////
	int getSalary() {
		return rate * hours; 
	}
	double getBonuses() {
		return (double)getSalary() / 10;
	}
	void changeRate(final int rate) {
		if(rate < 1) return;
		totalSum -= (getBonuses() + getSalary());
		this.rate = rate;
		totalSum += (getBonuses() + getSalary());
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return new StringBuilder().append("\tname -  ").append(name).
				append(name.length() > 7 ? '\t' : "\t\t").
				append("\trate -  ").append(rate).append("\t\thours -  ").
				append(hours).toString();
	}
	////////////////////////////////////////////////////////////////////////////
}