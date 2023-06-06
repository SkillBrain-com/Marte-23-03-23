package FayedMustafa.TEMA3JAVA;

public class Wizard implements Fighter {

    private int spell;

    public int getSpell() {
        return spell;
    }

    public void prepareSpell(){
        spell++;
    }

    @Override
    public int damage(Fighter fighter) {
        if(spell==0){
            return 3;
        }
        spell-= 1;
        return 12;
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    @Override
    public boolean isVulnerable() {
        return spell == 0;
    }
}
