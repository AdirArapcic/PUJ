public class VariablesExample {
    public static void main(String[] args) {
        // pravimo varijable za nase podatke
        String ime = "Adir";
        int godine = 21;
        double visina = 1.83;
        boolean student = true;
        char ocjena = 'D';

        // ispisujemo podatke
        System.out.println("Moje ime je " + ime + " i imam " + godine + " godinu.");
        System.out.println("Visok sam " + visina + " metara.");
        System.out.println("Da li sam student: " + student);
        System.out.println("Ocjena: " + ocjena);

        // ako promjenimo int u string ne mozemo staviti broj bez navodnika
        // npr String godine = 21; bi bila greska

    }
}
