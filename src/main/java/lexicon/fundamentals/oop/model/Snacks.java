package lexicon.fundamentals.oop.model;

public class Snacks extends Product{

    private static final int id=3;
    private String type;
    private String brand;
    private int calories;
    private int price;

    public Snacks(int id, int price,String productName,String type){
        super(id, price, productName);
        this.type=type;
    }

    public String examine(){
        return "Choose any Snacks from here";
    }

    public String use(){
        return "We eat";
    }
}
