package Atire;

public abstract class Atire {

    private String lable;
    private int armorRating;

    // Constructor
    public Atire(String lable,int armorRating) {
        this.lable = lable;
        this.armorRating = armorRating;
    }
        // Copy constructor
    public Atire(Atire atire){
        this(atire.lable,atire.armorRating);
    }
    // Getters
    public String getLable() {
        return lable;
    }

    public int getArmorRating() {
        return armorRating;
    }

    // Setters
    public void setLable(String lable) {
        this.lable = lable;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }


}
