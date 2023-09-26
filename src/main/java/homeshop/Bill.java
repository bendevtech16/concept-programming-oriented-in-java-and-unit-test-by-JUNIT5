package homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {

    private Custumer custumer;
    private Map<Product,Integer> productIntegerMap = new HashMap<>() ;
    private Delivry delivry;

    public Bill() {
    }

    public Bill(Custumer custumer, Delivry delivry) {
        this.custumer = custumer;
        this.delivry = delivry;
    }

    public Bill(Custumer custumer) {
        this.custumer = custumer;
    }

    /**
     * add a produc and quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public  void  addProduct(Product product, Integer quantity){
        productIntegerMap.put(product,quantity);
    }
    public  void generate(Writer writer){
        writer.sart();
        writer.writeLine();
        writer.stop();

    }
    public double getTotal(){
        double total = 0;

        for (Map.Entry<Product,Integer> entry:productIntegerMap.entrySet()){
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total = product.getPrice() +quantity;

        }
        total += delivry.getPrice();
        return total;
    }

    public Custumer getCustumer() {
        return custumer;
    }

    public void setCustumer(Custumer custumer) {
        this.custumer = custumer;
    }

    public Map<Product, Integer> getProductIntegerMap() {
        return productIntegerMap;
    }

    public void setProductIntegerMap(Map<Product, Integer> productIntegerMap) {
        this.productIntegerMap = productIntegerMap;
    }
}
