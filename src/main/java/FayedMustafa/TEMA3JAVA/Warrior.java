package FayedMustafa.TEMA3JAVA;

public class Warrior implements Fighter {



    @Override
    public String toString() {
        return "Fighter is a " +  this.getClass().getSimpleName();
    }

    @Override
    public int damage(Fighter fighter) {
        return fighter.isVulnerable() ? 10:6;
    }
}
