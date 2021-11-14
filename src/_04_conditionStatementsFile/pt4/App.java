package _04_conditionStatementsFile.pt4;

class App {
	public static void main(String[] args) {
		Product[] products = new Product[]{
				new Product("qwe", 5654, 3213),
				new Product("asd", 1698, 7981),
				new Product("zxc", 5968, 1819),
				new Product("rfv", 948, 549)};
		Product.print(products);
		System.out.println(
				"max price product - " + Product.getMaxProduct(products, true));
		System.out.println(
				"max quantity product - " + Product.getMaxProduct(products, false));
	}
}