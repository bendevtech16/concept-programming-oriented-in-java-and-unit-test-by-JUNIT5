package miam;

public class Four {
     private int puissance;
    private  int capacite;
    private  Resistance resistance;
    private Soufflerie soufflerie;
    public  void  cuire(Aliment aliment){
        System.out.println("je suis un aliment");
        System.out.println("avec ma capacite " + capacite +" litres");
        System.out.println("et ma puissance " + puissance + " degres");
        aliment.estCuit=true;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public void setSoufflerie(Soufflerie soufflerie) {
        this.soufflerie = soufflerie;
    }
}
