package Marco;

public class Variabile {
    public static void main(String[] args) {
// Variabile primitive

        int numarPozitiv = 253647586;
        int numarNegativ = -253647586;

        long numerPozitiv = 28347589289432L;
        long numarNegariv = -28347589289432L;

        int numarNormal = 45;
        double numarVirgula = 16.8;

        boolean isJavaFun = false;
        boolean isTimeToLearnJava = true;


        //Toate primitivele se scriu cu litere mici


// Variabile non-primitive

        //Comanda "psvm"  - Public static void Main(String[] args) - este un punct de intrare in cod

        int piure;
        int x = 25;
        String prenume = "George";
        String nume = "Chirita";
        System.out.println(prenume.toLowerCase()); // comanda sout scrisa cu o metoda in ea

        System.out.println(x);

        System.out.println(nume + prenume);   // procesul se numeste concatenare (legare)

        System.out.println(nume + " " + prenume);  // legam 2 string-uri cu spatiu gol intre ele

    }
}