package homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressDelivryTest {

    @Test
    public  void Given_yaoundeAsLocation_WhenGettingDelivryPrice_ThenGet6e99(){
        Delivry delivry = new ExpressDelivry("yaounde");
        assertEquals(6.99,delivry.getPrice(),0.01);
    }

    @Test
    public  void Given_regionCityAsLocation_WhenGettingDelivryPrice_ThenGet9e99(){
        Delivry delivry = new ExpressDelivry("adamaoua");
        assertEquals(9.99,delivry.getPrice(),0.01);
    }

}