package sanduCristianMentor.JavaBasics1;

public class ClasaB {

    // scope
    // declaratie - tipulVariabilei numeVariabila;
    // initializare (dupa egal) -> ii dam o valoare
    // variabila globala (definita in clasa)
    // variabila (en - field ->f)


    //global
    static int a ;


    public static void main(String[] args) {
//        a =  17;
//        //
//        //
//        //
//        System.out.println(a);
//        System.out.println("=============================");
//        //
//        //
//        a = 12;
//        System.out.println(a);
//        Test();

        String nume = numePrenume("Cristian", "Sandu");
        String nume2 =numePrenume("Andreea", "Adriana");
        int i = Test();
    }

    static int Test() {
        System.out.println(a = 12);
        System.out.println(a == 12? "YES":"NO");
        return 1;
    }

    static String numePrenume(String nume, String prenume) {
        return nume + " " + prenume;
    }



}
