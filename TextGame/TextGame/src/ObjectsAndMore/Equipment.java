// src/ObjectsAndMore/Equipment.java
package ObjectsAndMore;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private List<Item> inventory;
    private Item weapon1;
    private Item weapon2;
    private Armor armor;
    private double maxWeight;

    public Equipment(double maxWeight) {
        this.maxWeight = maxWeight;
        this.inventory = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        double currentWeight = inventory.stream().mapToDouble(Item::getWeight).sum();
        if (currentWeight + item.getWeight() > maxWeight) {
            System.out.println("You are carrying too much weight, you would hurt yourself if you try to carry more.");
            return false;
        }
        inventory.add(item);
        return true;
    }

    public boolean setWeapon1(Item weapon) {
        if (weapon instanceof Firearm || weapon instanceof MeleeWeapon) {
            this.weapon1 = weapon;
            return true;
        }
        System.out.println("Invalid item type for weapon slot.");
        return false;
    }

    public boolean setWeapon2(Item weapon) {
        if (weapon instanceof Firearm || weapon instanceof MeleeWeapon) {
            this.weapon2 = weapon;
            return true;
        }
        System.out.println("Invalid item type for weapon slot.");
        return false;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Equipment [inventory=" + inventory + ", weapon1=" + weapon1 + ", weapon2=" + weapon2 + ", armor=" + armor + ", maxWeight=" + maxWeight + "]";
    }
}

