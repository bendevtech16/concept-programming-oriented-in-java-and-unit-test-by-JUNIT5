package garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicule{

    private  int door;
    private int litrePer100km;
    private String motor;
    private List<String> option = new ArrayList<>();

    public Car(String modelName, String desription, String manufacturer, int year, String color, int speed, int[] dimension, int weight, int door, int litrePer100km, String motor, List<String> option) {
        super(modelName, desription, manufacturer, year, color, speed, dimension, weight);
        this.door = door;
        this.litrePer100km = litrePer100km;
        this.motor = motor;
        this.option = option;
    }

    @Override
    public void start() {
        System.out.println("je suis "+ modelName+ "je demarre vite quand mes " +door+ " sont fermes");
    }

    @Override
    public void stop(){
        System.out.println("je suis "+ modelName+ "je m'arrete vite avec mon motor: "+motor+" !" );
    }

    public void rouler(){
        System.out.println("je suis un car "+getModelName() +" je roule");
    }
    public  void startHeadLight(){
        System.out.println("j'allume mes phares");
    }
    public void  openTrunck(){
        System.out.println("j'ouvre mes coffres");
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getLitrePer100km() {
        return litrePer100km;
    }

    public void setLitrePer100km(int litrePer100km) {
        this.litrePer100km = litrePer100km;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public List<String> getOption() {
        return option;
    }

    public void setOption(List<String> option) {
        this.option = option;
    }
}
