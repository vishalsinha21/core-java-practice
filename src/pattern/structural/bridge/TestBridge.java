package pattern.structural.bridge;

public class TestBridge {

    public static void main(String[] args) {
        Weapon weapon1 = new Sword(new FlyingEnchantment());
        Weapon weapon2 = new Hammer(new SoulEatingEnchantment());

        weapon1.attack();
        weapon2.attack();
    }
}
