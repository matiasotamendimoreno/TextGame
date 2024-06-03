// src/ObjectsAndMore/Item.java
package ObjectsAndMore;

public abstract class Item {
    private String name;
    private double weight; // Peso en kilogramos
    private int nukaColaCapsPrice;
    private int stateCreditsPrice;
    private int santosPrice;

    public Item(String name, double weight, int nukaColaCapsPrice, int stateCreditsPrice, int santosPrice) {
        this.name = name;
        this.weight = weight;
        this.nukaColaCapsPrice = nukaColaCapsPrice;
        this.stateCreditsPrice = stateCreditsPrice;
        this.santosPrice = santosPrice;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getNukaColaCapsPrice() {
        return nukaColaCapsPrice;
    }

    public int getStateCreditsPrice() {
        return stateCreditsPrice;
    }

    public int getSantosPrice() {
        return santosPrice;
    }

    @Override
    public String toString() {
        return name + " (Weight: " + weight + " kg)";
    }
}
