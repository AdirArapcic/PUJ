public class Profil {
    public static void main(String[] args) {
        String ime = "Adir";
        int godine = 21;
        double visina = 1.83;
        char ocjena = 'D';
        boolean student = true;

        System.out.println("Moje ime je: " + ime);
        System.out.println("Imam " + godine + "godinu.");
        System.out.println("zadnje slovo mog imena je: " + ime.charAt(ime.length()-1));
        System.out.println("Pocento slovo mog imena je: " + ime.charAt(0));
        System.out.println("Moja visina je " + visina + " metara.");
        System.out.println("Moja ocjena: " + ocjena);
        System.out.println("Da li sam student: " + student);
    }
}
