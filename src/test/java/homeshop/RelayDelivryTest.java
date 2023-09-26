package homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDelivryTest {
    @Test
    public  void  Given_FreeRelay_whenGettingDeliveryPrice_thenGet0e(){
        Delivry delivry = new RelayDelivry(5);
        assertEquals(0.0,delivry.getPrice(),0.01);
    }
    @Test
    public  void  Given_LowPriceRelay_whenGettingDeliveryPrice_thenGet2e99(){
        Delivry delivry = new RelayDelivry(27);
        assertEquals(2.99,delivry.getPrice(),0.01);
    }
    @Test
    public  void  Given_HightPriceRelay_whenGettingDeliveryPrice_thenGet4e99(){
        Delivry delivry = new RelayDelivry(52);
        assertEquals(4.99,delivry.getPrice(),0.01);
    }

}