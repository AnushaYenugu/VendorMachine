package lexicon.fundamentals.oop.model;

public class VendingMachineImpl implements  VendingMachine{
    private int depositePool=0;
    private int amount;
    private
    Product[] products;
     static int balance=0;


    public VendingMachineImpl(int amount, Product[] products){
        this.amount=amount;
        this.products=products;
    }


    @Override
    public void addCurrency(int amount) {
        if(amount==1 || amount==2 || amount==5 || amount==10 || amount==20 || amount==50 || amount==100 || amount==200 || amount==500 || amount==1000){
            depositePool=depositePool+amount;

        }
        else {
            System.out.println("Please deposit valid amount");
        }
    }
    @Override
    public int getBalance(){

        return this.depositePool;
    }

    @Override
    public Product request(int id) {


        if (depositePool <= getBalance()) {
            for (int i = 0; i < products.length; i++) {
                if (id == products[i].getId()) {
                    return products[i];
                }
            }
        }
        return null;
    }


// LOOK THIS LATER
    @Override
    public int endSession() {

        return depositePool=0;

    }

    @Override
    public String getDescription(int id) {
        for (Product prod:products) {
            if(id==prod.getId()){
                return prod.examine();
            }

        }

        return null;
    }

    public void setBalance(int balance){
       this.depositePool=balance;

    }
    @Override
    public String[] getProducts(){
        String[] productInformation = new String[products.length];
        for (int i=0;i<products.length;i++) {
           productInformation[i]=products[i].getId()+" "+ products[i].getProductName()+" "+products[i].getPrice();
        }


      //  String[] productInfo={products.getId()+" "+ products.getProductName()+" "+products.getPrice()};

        return productInformation;

    }


    public int change(){
        int[] value=new int[products.length];
       // int balance=0;
        int change=0;
        for(int i=0;i<products.length;i++){
             value[i]=  products[i].getPrice();
             balance=getBalance()-value[i];
             setBalance(balance);

             //change=balance[i];

        }
        return balance;

    }
}
