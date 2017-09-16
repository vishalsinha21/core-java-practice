package pattern.structural.proxy.protection;

public class TestProtectionProxy {

    public static void main(String[] args) {
        WizardTower proxy = new WizardTowerProxy(new IvoryTower());

        proxy.enter(new Wizard("wizard1"));
        proxy.enter(new Wizard("wizard2"));
        proxy.enter(new Wizard("wizard3"));
        proxy.enter(new Wizard("wizard4"));
    }

}
