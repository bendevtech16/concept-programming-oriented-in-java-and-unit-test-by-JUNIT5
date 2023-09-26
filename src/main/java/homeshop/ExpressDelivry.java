package homeshop;

public class ExpressDelivry implements Delivry {
    private String city;

    public ExpressDelivry(String city) {
        this.city = city;
    }
    @Override
    public double getPrice() {
        if (city.equals("yaounde"))
            return 6.99;
        else
            return 9.99;
    }
}


