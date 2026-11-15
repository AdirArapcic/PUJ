
public class Kalkulator {
    public static void main(String[] args) {
        // predifinisane vrijednosti
        int a = 20;
        int b = 6;

        // racunamo osnovne operacije
        int zbir = a + b;
        int razlika = a - b;
        int mnozenje = a * b;
        int dijeljenje = a / b;
        int ostatak = a % b;

        System.out.println("Sabiranje: " + zbir);
        System.out.println("Oduzimanje: " + razlika);
        System.out.println("Mnozenje: " + mnozenje);
        System.out.println("Dijeljenje: " + dijeljenje);
        System.out.println("Ostatak dijeljenja: " + ostatak);

        // provjeravamo da li je prvi broj veci
        boolean veci = a > b;
        System.out.println("Da li je a veci od b: " + veci);

        // ovdje koristimo zagrade da promjenimo redoslijed racunanja
        System.out.println("Bez zagrada(a + b * 2): " + (a + b * 2));
        System.out.println("Sa zagradama(a + b) * 2)): " + ((a + b) * 2));

    }
}
