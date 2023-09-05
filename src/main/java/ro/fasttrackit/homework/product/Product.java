package ro.fasttrackit.homework.product;

import ro.fasttrackit.homework.bottle.Bottle;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        if (category == null) {
            this.category = "MISC";
        }
        this.quantity = 0;
    }

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        if (category == null) {
            this.category = "MISC";
        }
    }

    public void someMethod() {
        Bottle bottle = new Bottle(5);
//        bottle.bottleSaysHi();
//        bottle.bottleSaysHello();
//        bottle.defaultTest();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        return quantity > 0;
    }

    public boolean isCategory(String category) {
        return this.category.equals(category);
    }
}
