package lexicon.fundamentals.oop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static Assertions.*;

class VendingMachineImplTest {
    VendingMachineImpl sut;
    private static int amt = 100;
    private Product[] testProducts = new Product[2];

    @BeforeEach
    void setUp() {
        Dricks cocoCola=new Dricks(1,10,"CocoCola","Bevargers");
        testProducts[0] = cocoCola;
        Fruits orange = new Fruits(2,20, "orange", "fruity");
        testProducts[1] = orange;
        sut = new VendingMachineImpl(amt, testProducts);
        sut.addCurrency(200);
    }

    @Test
    void addCurrency() {
        sut.addCurrency(200);
      //  Assertions.assertEquals(200,sut.addCurrency(200));
    }

    @Test
    void getBalance() {

        Assertions.assertEquals(200,sut.getBalance());

    }

    @Test
    void request() {
        sut.request(1);
    }

    @Test
    void endSession() {
        Assertions.assertEquals(0,sut.endSession());
    }

    @Test
    void getDescription() {
        Assertions.assertEquals("Drink from here",sut.getDescription(1));
        Assertions.assertEquals("Fruits are here",sut.getDescription(2));
    }

    @Test
    void getProducts() {
        Assertions.assertAll(

                ( )->  Assertions.assertEquals(1,testProducts[0].getId()),
                ()->   Assertions.assertEquals("CocoCola",testProducts[0].getProductName()),
                ()->   Assertions.assertEquals(10,testProducts[0].getPrice())
          );



    }

    @Test
    void change(){
        Assertions.assertEquals(170,sut.change());
    }
}