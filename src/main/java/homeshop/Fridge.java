package homeshop;

import javax.swing.plaf.ProgressBarUI;

public class Fridge extends Product {
    private  int litre;
    private boolean freezer;
    public Fridge(String name, String description, Double price, int litre, boolean freezer) {
        super(name, description, price);
        this.litre = litre;
        this.freezer = freezer;
    }

    public int getLitre() {
        return litre;
    }

    public void setLitre(int litre) {
        this.litre = litre;
    }

    public boolean isFreezer() {
        return freezer;
    }

    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }
}
