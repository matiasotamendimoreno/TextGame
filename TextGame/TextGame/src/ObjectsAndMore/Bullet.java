// src/ObjectsAndMore/Bullet.java
package ObjectsAndMore;

public class Bullet extends Item {
    private int damage;

    public Bullet(String name, double weight, int damage, int nukaColaCapsPrice, int stateCreditsPrice, int santosPrice) {
        super(name, weight, nukaColaCapsPrice, stateCreditsPrice, santosPrice);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return super.toString() + " [Bullet: Damage=" + damage + "]";
    }
}
