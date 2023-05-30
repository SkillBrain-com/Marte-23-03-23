package sanduCristianMentor.Tema3Java;

public class Warrior implements Fighter {

    @Override
    public int damage(Fighter fighter) {
        return fighter.isVulnerable() ? 10:6;
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName() ; //hard code
    }
}
