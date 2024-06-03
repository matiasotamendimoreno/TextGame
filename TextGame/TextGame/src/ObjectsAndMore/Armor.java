// src/ObjectsAndMore/Armor.java
package ObjectsAndMore;

public class Armor extends Item {
    private int durability;
    private String quality;
    private int damageReduction;

    public Armor(String name, double weight, int durability, String quality, int damageReduction, int nukaColaCapsPrice, int stateCreditsPrice, int santosPrice) {
        super(name, weight, nukaColaCapsPrice, stateCreditsPrice, santosPrice);
        this.durability = durability;
        this.quality = quality;
        this.damageReduction = damageReduction;
    }

    public int getDurability() {
        return durability;
    }

    public String getQuality() {
        return quality;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void useArmor() {
        if (durability > 0) {
            durability = Math.max(0, durability - 1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Armor: Durability=" + durability + ", Quality=" + quality + ", DamageReduction=" + damageReduction + "]";
    }
}
