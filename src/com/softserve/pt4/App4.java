package com.softserve.pt4;

public class App4 {
    public static void main(String[] args) {
        Product product1 = new Product("Product1", 1.2F, 20);
        Product product2 = new Product("Product2", 3.2F, 10);
        Product product3 = new Product("Product3", 1.2F, 8);
        Product product4 = new Product("Product4", 2.8F, 20);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        if (product1.getPrice() >= product2.getPrice() &&
                product1.getPrice() >= product3.getPrice() &&
                product1.getPrice() >= product4.getPrice()) {
            System.out.println("Name "+ product1.getName() +" quantity of the most expensive item "
                    + product1.getQuantity());
        }
        if (product2.getPrice() >= product1.getPrice() &&
                product2.getPrice() >= product3.getPrice() &&
                product2.getPrice() >= product4.getPrice()) {
            System.out.println("Name "+ product2.getName() +" quantity of the most expensive item "
                    + product2.getQuantity());
        }
        if (product3.getPrice() >= product1.getPrice() &&
                product3.getPrice() >= product2.getPrice() &&
                product3.getPrice() >= product4.getPrice()) {
            System.out.println("Name "+ product3.getName() +" quantity of the most expensive item "
                    + product3.getQuantity());
        }
        if (product4.getPrice() >= product2.getPrice() &&
                product4.getPrice() >= product3.getPrice() &&
                product4.getPrice() >= product1.getPrice()) {
            System.out.println("Name "+ product4.getName() +" quantity of the most expensive item "
                    + product4.getQuantity());
        }
        if (product1.getQuantity() >= product2.getQuantity() &&
                product1.getQuantity() >= product3.getQuantity() &&
                product1.getQuantity() >= product4.getQuantity()) {
            System.out.println("name of the items, which has the biggest quantity "+ product1.getName());
        }
        if (product2.getQuantity() >= product1.getQuantity() &&
                product2.getQuantity() >= product3.getQuantity() &&
                product2.getQuantity() >= product4.getQuantity()) {
            System.out.println("name of the items, which has the biggest quantity "+ product2.getName());
        }
        if (product3.getQuantity() >= product2.getQuantity() &&
                product3.getQuantity() >= product1.getQuantity() &&
                product3.getQuantity() >= product4.getQuantity()) {
            System.out.println("name of the items, which has the biggest quantity "+ product3.getName());
        }
        if (product4.getQuantity() >= product2.getQuantity() &&
                product4.getQuantity() >= product3.getQuantity() &&
                product4.getQuantity() >= product1.getQuantity()) {
            System.out.println("name of the items, which has the biggest quantity "+ product4.getName());
        }
    }
}
