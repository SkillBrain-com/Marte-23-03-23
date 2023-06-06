package FayedMustafa.TEMA3JAVA;

public class TestMyFighter {

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        String myFighter = warrior.toString();
        System.out.println(myFighter);
        Fighter wizard = new Wizard();
        System.out.println("Wizard damage " + wizard.damage(warrior));
        int wizardDamage = ((Wizard)wizard).getSpell();
        System.out.println("Prepared spells " + wizardDamage);
        System.out.println("Wizard damage " + wizard.damage(warrior));
        ((Wizard)wizard).prepareSpell();
        wizardDamage = ((Wizard)wizard).getSpell();
        System.out.println("Prepared spells " + wizardDamage);
        System.out.println("Wizard damage " + wizard.damage(warrior));
        System.out.println("===============================================");
        System.out.println("Warrior damage " + warrior.damage(wizard));



    }
}
