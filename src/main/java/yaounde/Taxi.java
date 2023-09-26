package yaounde;

public class Taxi implements MoyenDeLocomotion{

    @Override
    public void deplace(String address) {
        System.out.println("je me deplace par taxi vers l'adresse : "+address);
    }
}
