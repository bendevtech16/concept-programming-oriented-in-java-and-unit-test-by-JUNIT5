package homeshop;

public class Product {
    private String name;
     private String description;
     private Double price;


    public Product() {
    }

    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Display afull description of product
     */
    public  void look(){

    }

    /**
     * add the product to a bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
    public  void buy(Bill bill, Integer quantity){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
