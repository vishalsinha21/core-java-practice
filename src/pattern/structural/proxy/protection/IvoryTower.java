package pattern.structural.proxy.protection;

public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.getName() + " has entered Ivory tower");
    }

}
