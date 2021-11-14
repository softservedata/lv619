package _04_conditionStatementsFile.pt4;
import java.util.Arrays;

class Product {
	////////////////////////////////////////////////////////////////////////////
	private String name;
	private int price;
	private int quantity;
	////////////////////////////////////////////////////////////////////////////
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	////////////////////////////////////////////////////////////////////////////
	String getName() {return name;}
	int getPrice() {return price;}
	int getQuantity() {return quantity;}
	////////////////////////////////////////////////////////////////////////////
	static Product getMaxProduct(Product[] products, boolean priceRequired) {
		Product res = products[0];
		for(Product product: Arrays.copyOfRange(products, 1, products.length))
			if(priceRequired ? product.getPrice() > res.getPrice() :
				product.getQuantity() > res.getQuantity())
				res = product;
		return res;
	}
	////////////////////////////////////////////////////////////////////////////
	static void print(Product[] products) {
		for(Product product: products)
			System.out.println(product);
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return name + ":\tprice = " + price + "\tquantity = " + quantity;
	}
}