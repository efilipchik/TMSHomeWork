package Lesson10_add.Shop;

public class Product {

    private int id;
    private String name;
    private int price;
    private static int b;

    public Product(String name, int price) {
        b++;
        this.id = b;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}