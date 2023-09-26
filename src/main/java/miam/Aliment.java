package miam;

public class Aliment {
    String nom;
    boolean estCuit;
    public  void manger(){
        if(estCuit){
            System.out.println("miam miam cet " +nom+" est bien cuit");
        }
        else {
            System.out.println("beerk cet aliment "+nom+" est cru !");
        }
    }
}
