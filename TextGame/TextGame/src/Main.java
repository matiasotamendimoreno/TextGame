// src/Main.java
import ObjectsAndMore.*;

public class Main {
    public static void main(String[] args) {
        Equipment equipment = new Equipment(5.0); // Peso máximo 5 kg

        Firearm pistol = new Firearm("9mm Pistol", 1.5, 10, 10, 100, "Military", 100, 50, 25);
        MeleeWeapon knife = new MeleeWeapon("Combat Knife", 0.5, "Afilado", 100, "Prepared", 5, 50, 25, 10);
        Bullet bullet = new Bullet("9mm Bullet", 0.02, 10, 1, 1, 1);
        UsableItem medkit = new UsableItem("Medkit", 1.0, 5, 200, 100, 50);
        Food cannedFood = new Food("Canned Beans", 0.3, false, 0, 10, 5, 2);
        Armor kevlarVest = new Armor("Kevlar Vest", 2.0, 100, "Military", 50, 500, 250, 125);

        equipment.addItem(pistol);
        equipment.addItem(knife);
        equipment.addItem(bullet);
        equipment.addItem(medkit);
        equipment.addItem(cannedFood);
        equipment.addItem(kevlarVest);

        equipment.setWeapon1(pistol);
        equipment.setWeapon2(knife);
        equipment.setArmor(kevlarVest);

        System.out.println(equipment);
    }
}
