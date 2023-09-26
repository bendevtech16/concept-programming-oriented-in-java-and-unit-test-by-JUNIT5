package garage;

public class Bike extends  Vehicule{
    public Bike() {
    }

    public Bike(String modelName, String desription, String manufacturer, int year, String color, int speed, int[] dimension, int weight) {
        super(modelName, desription, manufacturer, year, color, speed, dimension, weight);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
