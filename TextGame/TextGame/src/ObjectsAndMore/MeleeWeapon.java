// src/ObjectsAndMore/MeleeWeapon.java
package ObjectsAndMore;

public class MeleeWeapon extends Item {
    private String sharpness;
    private int wear;
    private String quality;
    private int damage;

    public MeleeWeapon(String name, double weight, String sharpness, int wear, String quality, int damage, int nukaColaCapsPrice, int stateCreditsPrice, int santosPrice) {
        super(name, weight, nukaColaCapsPrice, stateCreditsPrice, santosPrice);
        this.sharpness = sharpness;
        this.wear = wear;
        this.quality = quality;
        this.damage = damage;
    }

    public String getSharpness() {
        return sharpness;
    }

    public int getWear() {
        return wear;
    }

    public String getQuality() {
        return quality;
    }

    public int getDamage() {
        return damage;
    }

    public void useWeapon() {
        if (wear > 0) {
            wear = Math.max(0, wear - 1);
            if (wear < 50 && sharpness.equals("Afilado")) {
                sharpness = "Mellado";
            } else if (wear < 25 && sharpness.equals("Perfecto")) {
                sharpness = "Afilado";
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [MeleeWeapon: Sharpness=" + sharpness + ", Wear=" + wear + ", Quality=" + quality + ", Damage=" + damage + "]";
    }
}

