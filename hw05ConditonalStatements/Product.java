package hw05ConditonalStatements;

public class Product {
	
	private String name;
	private int value;
	private int quantity;
	
	public Product(String name, int val, int q) {
		this.name = name;
		this.value = val;
		this.quantity = q;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String toString () {
		return "Product [Name = " + name + ",value = " + value + ", quantity = " + quantity + "]";
	}
	
	
	public static void main(String[] args) {
		Product pr1 = new Product("PR1", 2, 10);
		Product pr2 = new Product("PR2", 4, 24);
		Product pr3 = new Product("PR3", 6, 14);
		Product pr4 = new Product("PR4", 8, 16);
		Product mostexpensive;
		if (pr1.value > pr2.value) {
			mostexpensive = pr1;
		}
		else {
			if (pr2.value > pr3.value) {
				mostexpensive = pr2;
			}
			else {
				if (pr3.value > pr4.value) {
					mostexpensive = pr3;
				}
				else {
					mostexpensive = pr4;
				}
			}
		}
		
		Product biggestnumber;
		if (pr1.quantity > pr2.quantity) {
			biggestnumber = pr1;
		}
		else {
			if (pr2.quantity > pr3.quantity) {
				biggestnumber = pr2;
			}
			else {
				if (pr3.quantity > pr4.quantity) {
					biggestnumber = pr3;
				}
				else {
					biggestnumber = pr4;
				}
			}
		}
		
		System.out.println("The most expenive product is " + mostexpensive);
		System.out.println("Product, which has the biggest quantity is " + biggestnumber);
		
	}

}
