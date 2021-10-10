package hw008OOP2.hw01;

import java.util.Arrays;

public class Appl {
	
	public static void main(String[] args) {
		
		Employee[] empl = new Employee[4];
		empl[0] = new ContractEmployee("Ivan", 259787, 111111, 2000);
		empl[1] = new ContractEmployee("Roman", 259788, 111112, 25000);
		empl[2] = new SalariedEmployee("Petro", 299999, 222222, 125.5, 40);
		empl[3] = new SalariedEmployee("Pavlo", 300000, 222223, 1555.5, 40);
		
		Arrays.sort(empl);
		
		for(int i = 0; i < empl.length; i++) {
			System.out.println(empl[i]);
		}
	}

}
