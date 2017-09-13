package pattern.structural.bridge;

public class Sword implements Weapon {

    Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void attack() {
        System.out.println("sword attack");
        enchantment.apply();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }

}
