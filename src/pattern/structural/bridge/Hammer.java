package pattern.structural.bridge;

public class Hammer implements Weapon {

    Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void attack() {
        System.out.println("hammer attack");
        enchantment.apply();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }

}
