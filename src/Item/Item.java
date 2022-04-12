package Item;

public abstract class Item {

    private String name;
    private int damage;
    private int weight;

    public Item(String name,int damage,int weight) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", weight=" + weight +
                '}';
    }
}
