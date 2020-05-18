package Lesson10_add.Shop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> productList = new ArrayList<>();

    public void addProduct(Product p) {
        boolean a = false;
        for (Product pr : productList) {
            if (pr.getId() == p.getId()) {
                a = false;
            }
        }
        if (a == false) {
            productList.add(p);
        }
    }
    public ArrayList receiveProducts () {
        return productList;
    }

    public void deleteProduct (int id){
        Product c = null;
        for (Product pr : productList) {
            if (pr.getId() == id) {
                c = pr;
            }
        }
        if (c==null) {
            System.out.println("Такого id нет");
        } else {
            productList.remove(c);
        }
    }
}