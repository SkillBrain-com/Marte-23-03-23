package FayedMustafa.JavaBasics3;

public class Cat {

    private final String name;
    private final String race;
    protected String dateOfBirth;
    private static int catCounter;
    private static String favoriteFood;

    static {
        catCounter++;
        System.out.println("Static block is called");
    }

    static {
        favoriteFood = "Whiskas";
        System.out.println(" Static Calling favorite food initialization");
    }

    {
        this.dateOfBirth = " 15/06/2020";
        System.out.println("Date was initialized");

    }

    {
        this.name = "Zyra";
        System.out.println("Name was initialized");

    }

    {
        this.race = "Tomberoneza";
        System.out.println("Race was initialized");

    }

    Cat() {
        System.out.println("Calling constructor");
    }

    {
        this.dateOfBirth = " 20/08/2021";
        System.out.println("Date was initialized");
    }


}




