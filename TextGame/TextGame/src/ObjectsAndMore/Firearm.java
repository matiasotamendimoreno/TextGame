// src/ObjectsAndMore/Firearm.java
package ObjectsAndMore;

public class Firearm extends Item {
    private int ammoCapacity;
    private int currentAmmo;
    private int wear;
    private String quality;

    public Firearm(String name, double weight, int ammoCapacity, int currentAmmo, int wear, String quality, int nukaColaCapsPrice, int stateCreditsPrice, int santosPrice) {
        super(name, weight, nukaColaCapsPrice, stateCreditsPrice, santosPrice);
        this.ammoCapacity = ammoCapacity;
        this.currentAmmo = currentAmmo;
        this.wear = wear;
        this.quality = quality;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }

    public int getWear() {
        return wear;
    }

    public String getQuality() {
        return quality;
    }

    public void reload(int ammo) {
        if (ammo > 0) {
            this.currentAmmo = Math.min(ammoCapacity, currentAmmo + ammo);
        }
    }

    public void useAmmo() {
        if (currentAmmo > 0) {
            currentAmmo--;
            // Disminuir el desgaste del arma
            wear = Math.max(0, wear - 1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Firearm: AmmoCapacity=" + ammoCapacity + ", CurrentAmmo=" + currentAmmo + ", Wear=" + wear + ", Quality=" + quality + "]";
    }
}



