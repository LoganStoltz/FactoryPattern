package Atire;

public abstract class Attire {

    private String label;
    private int armorRating;

    // Constructor
    public Attire(String label, int armorRating) {
        this.label = label;
        this.armorRating = armorRating;
    }
        // Copy constructor
    public Attire(Attire attire){
        this(attire.label,attire.armorRating);
    }
    // Getters
    public String getlabel() {
        return label;
    }

    public int getArmorRating() {
        return armorRating;
    }

    // Setters
    public void setlabel(String label) {
        this.label = label;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }

    @Override
    public String toString() {
        return "Attire{" +
                "label='" + label + '\'' +
                ", armorRating=" + armorRating +
                '}';
    }
}
