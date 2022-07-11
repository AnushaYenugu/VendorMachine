    package lexicon.fundamentals.oop.model;

    public class Main {
    public static void main(String[] args) {

       //ArrayList<Product> products=new ArrayList<>();


        Dricks cocoCola=new Dricks(1,10,"CocoCola","Bevargers");
       // products.add(cocoCola);

        Product[] productArray=new Product[2];
        productArray[0]=cocoCola;

        Fruits orange=new Fruits(2,20,"Orange","Fruity");
        productArray[1]=orange;


       VendingMachineImpl product1=new VendingMachineImpl(100,productArray);
        System.out.println(product1.getDescription(1));

         product1.addCurrency(100);
        System.out.println(product1.getBalance());

        System.out.println(product1.request(1).getProductName());
        System.out.println(product1.request(1).use());
      //  System.out.println(product1.getProducts());
        for (String str: product1.getProducts())
              {
                  System.out.println(str);
        }

      //  System.out.println(product1.change());


        // fruit

        System.out.println(product1.request(2).getProductName());
        System.out.println(product1.change());







    }
}