package yaounde;

public class Bus implements  MoyenDeLocomotion{

    @Override
    public void deplace(String address) {
        System.out.println("je me deplace par bus sur l'axe lord de l'adresse : "+address);
    }
}
