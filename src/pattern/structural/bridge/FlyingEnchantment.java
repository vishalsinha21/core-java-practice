package pattern.structural.bridge;

public class FlyingEnchantment implements Enchantment {

    @Override
    public void apply() {
        System.out.println("flying enchantment");
    }
}
