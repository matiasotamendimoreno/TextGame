// src/ObjectsAndMore/UsableItem.java
package ObjectsAndMore;

public class UsableItem extends Item {
    private int uses;

    public UsableItem(String name, double weight, int uses, int nukaColaCapsPrice, int stateCreditsPrice, int santosPrice) {
        super(name, weight, nukaColaCapsPrice, stateCreditsPrice, santosPrice);
        this.uses = uses;
    }

    public int getUses() {
        return uses;
    }

    public void use() {
        if (uses > 0) {
            uses--;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [UsableItem: Uses=" + uses + "]";
    }
}
