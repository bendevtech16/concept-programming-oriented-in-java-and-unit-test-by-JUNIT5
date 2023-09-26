package garage;

public abstract class Vehicule {
    protected String modelName;
    private String desription;
    private String manufacturer;
    private  int year;
    private String color;
    private  int speed;
    private  int[] dimension = new  int[3];
    private  int weight;

    public Vehicule() {
    }

    public Vehicule(String modelName, String desription, String manufacturer, int year, String color, int speed, int[] dimension, int weight) {
        this.modelName = modelName;
        this.desription = desription;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.dimension = dimension;
        this.weight = weight;
    }

    public abstract   void start();
    public abstract void stop();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getDimension() {
        return dimension;
    }

    public void setDimension(int[] dimension) {
        this.dimension = dimension;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
