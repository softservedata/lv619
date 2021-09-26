package L4.practicaltask;

public class Product {
        public String name;
        public int price;
        public int quantity;

        public Product (String name, int price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    @Override
    public String toString() {
        return  name + ", price=" + price + ", quantity=" + quantity;
    }


    public static void main(String[] args) {
            Product p1 = new Product("Product1", 560, 6);
            Product p2 = new Product("Product2", 620, 4);
            Product p3 = new Product("Product3", 155, 13);
            Product p4 = new Product("Product4", 222, 22);
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());
            System.out.println(p4.toString());

            if (p1.price > p2.price && p1.price> p3.price && p1.price> p4.price) {
                System.out.println("The most expensive item:" + p1.toString());
            }
            else if (p2.price > p1.price && p2.price> p3.price && p2.price> p4.price){
                System.out.println("The most expensive item:" + p2.toString());
            }
            else if (p3.price > p1.price && p3.price> p2.price && p3.price> p4.price){
                System.out.println("The most expensive item:" + p3.toString());
            }
            else System.out.println("The most expensive item:" + p4.toString());

        if (p1.quantity > p2.quantity && p1.quantity> p3.quantity && p1.quantity> p4.quantity) {
            System.out.println("The item with the biggest quantity:" + p1.toString());
        }
        else if (p2.quantity > p1.quantity && p2.quantity> p3.quantity && p2.quantity> p4.quantity){
            System.out.println("The item with the biggest quantity:" + p2.toString());
        }
        else if (p3.quantity > p1.quantity && p3.quantity> p2.quantity && p3.quantity> p4.quantity){
            System.out.println("The item with the biggest quantity:" + p3.toString());
        }
        else System.out.println("The item with the biggest quantity:" + p4.toString());
         }
}
