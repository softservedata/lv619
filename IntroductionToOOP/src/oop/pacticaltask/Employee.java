package oop.pacticaltask;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    static int totalSum;
    private int salary;
    private double bonuses;

    public Employee () {}
    public Employee ( String name, int rate)
    {
        this.name=name;
        this.rate = rate;
        getSalary();
    }
    public Employee ( String name, int rate, int hours)
    {
        this.name=name;
        this.rate = rate;
        this.hours = hours;
        getSalary();
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRate(int rate)
    {
        this.rate = rate;
    }
    public void setHours(int hours)
    {
        this.hours = hours;
    }
    public String getName()
    {
        return this.name;
    }
    public int getRate()
    {
        return this.rate;
    }
    public int getHours()
    {
        return this.hours;
    }

    public int getSalary()
    {
        salary = rate * hours;
        totalSum+=salary;
        return salary;
    }

    public double getBonuses()
    {
       bonuses = salary * 0.1;
       return bonuses;
    }
    public void changeRate(int newRate)
    {
        totalSum-=salary;
        this.rate = newRate;
        this.salary = hours * newRate;
        totalSum+=salary;

    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + ", salary=" + salary + ", bonuses=" + getBonuses() + "]";
    }

    public static void main(String[] args) {
	 Employee e1 = new Employee( "Oleksandr", 6, 9);
	 Employee e2 = new Employee( "Yulia", 4, 11);
	 Employee e3 = new Employee( "Denis", 5, 15);
	 System.out.println(e1);
	 System.out.println(e2);
	 System.out.println(e3);
     System.out.println();
     System.out.println("Total salary of all workers with bonuses:" + totalSum);
     System.out.println();
     System.out.println("Changing rates of some workers:");
	 e1.changeRate(8);
	 System.out.println(e1);
	 System.out.println("New total salary:" + totalSum);

    }
}
