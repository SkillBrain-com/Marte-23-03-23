package FayedMustafa.TEMA3JAVA;

public interface Fighter {

      int damage(Fighter fighter);


     default boolean isVulnerable(){
         return false;
     }
}
