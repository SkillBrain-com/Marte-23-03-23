package sanduCristianMentor.Tema3Java;

public interface Fighter {

   int damage(Fighter fighter);

   default boolean isVulnerable() {
       return false;
   }


}
