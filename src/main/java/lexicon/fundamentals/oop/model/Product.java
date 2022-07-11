package lexicon.fundamentals.oop.model;

import java.util.ArrayList;

public abstract class Product {
    private int id;
    private int price;
    private String productName;

    ArrayList<Product> products=new ArrayList<>();

    public Product(int id,int price,String productName){
        this.id=id;
        this.price=price;
        this.productName=productName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract String examine();
    public abstract String use();



}
