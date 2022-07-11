package lexicon.fundamentals.oop.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Assertions.*;

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
    }

    @Test
    void addCurrency() {
        sut.addCurrency(200);
    }

    @Test
    void getBalance() {
    }

    @Test
    void request() {
    }

    @Test
    void endSession() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void getProducts() {
    }
}