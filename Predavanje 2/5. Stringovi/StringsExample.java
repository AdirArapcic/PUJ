public class StringsExample {
    public static void main(String[] args) {
        String tekst = "Java je super";

        // pretvaramo sva slova u recenici u mala slova
        System.out.println(tekst.toLowerCase());

        // ispusujemo prvi "x" karaktera u recenici u ovom primjer je prvi 10 karaktera.
        System.out.println(tekst.substring(0,10));

        // ispusjemo prvi karakter u recenici
        System.out.println("Prvo slovo: " + tekst.charAt(0));

        // Ovdje ispusujemo zadnji karakter u recenici to je slovo "r". U ovom dijelu trazimo Karaktere
        //sve u recenici i to preko teskst.charAT al u zagradi znaci trazi iz cega a to je tekst.length
        // al sto je -1 na kraju? Zato sto ova recenica ima 13 karaktera a 13-1 je 12. A java broji od 0.Da l
        System.out.println("Zadnje slovo: " + tekst.charAt(tekst.length()-1));

        // tajni kod, mijenjamo prva dva slova. Znaci substr(1,2) uzima drugo slovo samo, (0,1) uzima prvo slovo i na kraju substr(2) od treceg slova pa do kraja
        //i na kraju "Sabiramo ili dodajemo" u varijablu i ispusjemo na kraju
        String kod = tekst.substring(1,2) + tekst.substring(0,1) + tekst.substring(2);

        System.out.println("Tajni kod: " + kod);

    }
}
