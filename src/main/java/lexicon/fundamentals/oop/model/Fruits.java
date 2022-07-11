package lexicon.fundamentals.oop.model;

public class Fruits extends  Product{
    private static final int id=2;
    private String type;
    private int price;

    public Fruits(int id,int price,String productName,String type){
        super(id, price, productName);
        this.type=type;
    }


    public String examine(){
        return "Fruits are here";
    }

    public String use(){
        return "We eat";
    }
}
