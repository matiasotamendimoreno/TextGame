import java.util.ArrayList;
import java.util.List;

public class Equipment {
    // Atributos
    private Item weapon1;
    private Item weapon2;
    private Item armor;
    private List<Item> inventory;
    private double maxCarryWeight; // En kilogramos
    private double currentCarryWeight; // En kilogramos

    // Constructor
    public Equipment(double maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
        this.currentCarryWeight = 0.0;
        this.inventory = new ArrayList<>();
    }

    // Métodos para equipar armas
    public boolean equipWeapon1(Item weapon) {
        if (currentCarryWeight - (weapon1 != null ? weapon1.getWeight() : 0.0) + weapon.getWeight() <= maxCarryWeight) {
            if (weapon1 != null) {
                currentCarryWeight -= weapon1.getWeight();
            }
            weapon1 = weapon;
            currentCarryWeight += weapon.getWeight();
            return true;
        }
        return false;
    }

    public boolean equipWeapon2(Item weapon) {
        if (currentCarryWeight - (weapon2 != null ? weapon2.getWeight() : 0.0) + weapon.getWeight() <= maxCarryWeight) {
            if (weapon2 != null) {
                currentCarryWeight -= weapon2.getWeight();
            }
            weapon2 = weapon;
            currentCarryWeight += weapon.getWeight();
            return true;
        }
        return false;
    }

    // Método para equipar armadura
    public boolean equipArmor(Item armor) {
        if (currentCarryWeight - (this.armor != null ? this.armor.getWeight() : 0.0) + armor.getWeight() <= maxCarryWeight) {
            if (this.armor != null) {
                currentCarryWeight -= this.armor.getWeight();
            }
            this.armor = armor;
            currentCarryWeight += armor.getWeight();
            return true;
        }
        return false;
    }

    // Método para añadir un objeto al inventario
    public boolean addItemToInventory(Item item) {
        if (currentCarryWeight + item.getWeight() <= maxCarryWeight) {
            inventory.add(item);
            currentCarryWeight += item.getWeight();
            return true;
        }
        return false;
    }

    // Método para remover un objeto del inventario
    public boolean removeItemFromInventory(Item item) {
        if (inventory.remove(item)) {
            currentCarryWeight -= item.getWeight();
            return true;
        }
        return false;
    }

    // Getters
    public Item getWeapon1() {
        return weapon1;
    }

    public Item getWeapon2() {
        return weapon2;
    }

    public Item getArmor() {
        return armor;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public double getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public double getCurrentCarryWeight() {
        return currentCarryWeight;
    }
}

class Item {
    private String name;
    private double weight; // En kilogramos

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
