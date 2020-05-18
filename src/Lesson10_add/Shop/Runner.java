package Lesson10_add.Shop;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Product product1 = new Product("Телефон", 600);
        Product product2 = new Product("Телевизор", 700);
        Product product3 = new Product("Компьютер", 800);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);


        ArrayList<Product> list = shop.receiveProducts();
        for (Product product: list) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
        System.out.println();
        list.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        for (Product product: list) {
            System.out.println(product.getName() + " " + product.getPrice());
        }

        shop.deleteProduct(1);
        list = shop.receiveProducts();
        list.sort((o1, o2) -> o1.getId() - o2.getId());
        for (Product product: list) {
            System.out.println(product.getName() + " " + product.getPrice());
        }

        list.get(2).setName("Планшет");
        for (Product product: list) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }
}