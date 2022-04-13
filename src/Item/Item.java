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

    public Item(Item item){
        this(item.name,item.damage,item.weight);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getWeight() {
        return weight;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setWeight(int weight) {
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
