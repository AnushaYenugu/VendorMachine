package lexicon.fundamentals.oop.model;

public class Dricks extends Product {
    private  int id=1;
    private String typeOfDrink;
    private String brand;
    private int price;

    public Dricks(int id, int price,String productName,String typeOfDrink){
        super(id, price, productName);
        this.typeOfDrink=typeOfDrink;


    }



    public String examine(){
        return "Drink from here";
    }

    public String use(){
        return "We drink";
    }
}
