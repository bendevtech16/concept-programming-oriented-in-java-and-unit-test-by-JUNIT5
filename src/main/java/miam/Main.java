package miam;

import garage.Bike;
import garage.Car;
import garage.Vehicule;
import homeshop.*;
import yaounde.Bus;
import yaounde.Taxi;
import yaounde.Yaoudeen;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Four grandFour = new Four();
//        grandFour.setCapacite(55);
//        grandFour.setPuissance(400);
////      grandFour.soufflerie =null;
//
//        Product cafe = new Product("philips","philips quarante noir -456F",79.80);
//        Fridge fridge = new Fridge("Innova "," innova cool freezer economic", 45.67, 180, false);
//        Television tv = new Television("Sony bravia","sony bravia smart 2018", 289.4,43, "LED");
//        Custumer custumer = new Custumer("juste lenoir","16 rue germain pangoin yaounde");
//
//        Bill bill =new Bill( custumer);
//        bill.addProduct(tv, 2);
//        bill.addProduct(cafe, 3);
//        bill.addProduct(fridge,1);
//
//        Vehicule vehicule = new Bike();
//
//
//        Aliment aliment2 = new Aliment();
//        aliment2.nom ="viande";
//        aliment2.estCuit =false;
//        aliment2.manger();
//
//        Car car = new Car("yaris","la yaris a essence","TOYOTA",2008,"jaune",6,
//                new  int[]{4,5,6},1240,4,6,"motor name", List.of(new String[]{"vitres electriques","GPS","boitier automatique"}) );
//
//        System.out.println("");
//        grandFour.cuire(aliment2);
//        System.out.println("");
//        aliment2.manger();
        Yaoudeen yaoundeen = new Yaoudeen();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        yaoundeen.seDeplacer(bus);
        yaoundeen.seDeplacer(taxi);
    }
}
