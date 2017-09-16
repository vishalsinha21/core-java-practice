package pattern.structural.proxy.protection;

public class WizardTowerProxy implements WizardTower {

    private WizardTower wizardTower;
    private int NUM_OF_WIZARDS_ALLOWED = 3;
    private int num = 0;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (num < NUM_OF_WIZARDS_ALLOWED) {
            wizardTower.enter(wizard);
            num++;
        } else {
            System.out.println("No more wizards allowed");
        }
    }
}
