package homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    private  String output;
    private  Writer writerMock =new Writer() {

        @Override
        public void sart() {
            output = "";
        }

        @Override
        public void writeLine() {
            String line = null;
            output = output + line + "%n";
        }

        @Override
        public void stop() {

        }
    };

        Product cafe = new Product("philips","philips quarante noir -456F",79.80);
        Fridge fridge = new Fridge("Innova "," innova cool freezer economic", 45.67, 180, false);
        Television tv = new Television("Sony bravia","sony bravia smart 2018", 289.4,43, "LED");
        Custumer custumer = new Custumer("juste lenoir","16 rue germain pangoin yaounde");
        Delivry lowCostRelayDelivry = new RelayDelivry(27);

        @Test
        private  void Given_2productsAndDelivery_when_geneatingBill_then_getGoodLineNumber(){
            Bill bill = new Bill(custumer, lowCostRelayDelivry);
        bill.addProduct(tv, 2);
        bill.addProduct(cafe, 3);
        bill.generate(writerMock);
        int lineNumber = output.split("\n").length;
        assertEquals(20, lineNumber);
//        bill.addProduct(fridge,1);
        }

    @Test
    private  void Given_3productsAndDelivery_when_geneatingBill_then_getGoodLineNumber(){
        Bill bill = new Bill(custumer, lowCostRelayDelivry);
        bill.addProduct(tv, 1);
        bill.addProduct(cafe, 1);
        bill.addProduct(fridge,1);
        bill.generate(writerMock);
        int lineNumber = output.split("\n").length;
        assertEquals(870.98, bill.getTotal(),0.01);
    }


}