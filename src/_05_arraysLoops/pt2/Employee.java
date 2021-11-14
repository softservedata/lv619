package _05_arraysLoops.pt2;

class Employee {
	////////////////////////////////////////////////////////////////////////////
	private String name;
	private int departmentNumber;
	private int salary;
	////////////////////////////////////////////////////////////////////////////
	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	////////////////////////////////////////////////////////////////////////////
	String getName() {return name;}
	int getDepartmentNumber() {return departmentNumber;}
	int getSalary() {return salary;}
	////////////////////////////////////////////////////////////////////////////
	static void printDepartmentEmployees(Employee[] empls, int dep) {
		System.out.println("Employees in department " + dep + ':');
		for(Employee empl: empls)
			if(empl.getDepartmentNumber() == dep)
				System.out.println(empl);
		System.out.println("_______________________");
	}
	////////////////////////////////////////////////////////////////////////////
	public static void sortBySalaryDscnd(Employee[] empls) {
		Employee tmp;
		boolean isSorted;
		for(int i = 0, j = i, minSalIndx = i,
				k = empls.length - 1, l = k, maxSalIndx = k;
				i < k; j = ++i, minSalIndx = i, l = --k, maxSalIndx = k)
		{
			isSorted = true;
			while(++j <= k)
				if(empls[j].getSalary() > empls[minSalIndx].getSalary()) {
					minSalIndx = j;
					if(isSorted) isSorted = false;
				}
			if(isSorted) break;
			if(minSalIndx != i) {
				tmp = empls[i];
				empls[i] = empls[minSalIndx];
				empls[minSalIndx] = tmp;
			}
			 while(--l > i)
				if(empls[l].getSalary() < empls[maxSalIndx].getSalary()) {
					maxSalIndx = l;
					if(isSorted) isSorted = false;
				}
			 if(isSorted) break;
			 if(maxSalIndx != k) {
				 tmp = empls[k];
				 empls[k] = empls[maxSalIndx];
				 empls[maxSalIndx] = tmp;
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return name + ":\tdepartment number" + departmentNumber +
				"\tsalary = " + salary; 
	}
	////////////////////////////////////////////////////////////////////////////
}