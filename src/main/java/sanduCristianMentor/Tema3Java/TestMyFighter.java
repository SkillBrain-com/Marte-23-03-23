package sanduCristianMentor.Tema3Java;

public class TestMyFighter {

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Fighter wizzard = new Wizard();
        int wizardDamage = ((Wizard) wizzard).getSpell();
        System.out.println("Prepared spells " + wizardDamage);
        System.out.println("Wizard damage " + wizzard.damage(warrior));
        System.out.println("Warrior damage " + warrior.damage(wizzard));
        ((Wizard) wizzard).prepareSpell();
        wizardDamage = ((Wizard) wizzard).getSpell();
        System.out.println("Prepared spells " + wizardDamage);
        System.out.println("Wizard damage " + wizzard.damage(warrior));
        wizardDamage = ((Wizard) wizzard).getSpell();
        System.out.println("Prepared spells " + wizardDamage);

        System.out.println("==================================");
        System.out.println("Warrior damage " + warrior.damage(wizzard));





    }

}
