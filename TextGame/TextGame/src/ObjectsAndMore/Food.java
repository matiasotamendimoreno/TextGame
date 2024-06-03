// src/ObjectsAndMore/Food.java
package ObjectsAndMore;

public class Food extends Item {
    private boolean perishable;
    private int expirationDays; // Días de caducidad, solo para alimentos perecederos

    public Food(String name, double weight, boolean perishable, int expirationDays, int nukaColaCapsPrice, int stateCreditsPrice, int santosPrice) {
        super(name, weight, nukaColaCapsPrice, stateCreditsPrice, santosPrice);
        this.perishable = perishable;
        this.expirationDays = expirationDays;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    @Override
    public String toString() {
        return super.toString() + " [Food: Perishable=" + perishable + ", ExpirationDays=" + expirationDays + "]";
    }
}

