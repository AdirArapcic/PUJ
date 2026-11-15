public class DataTypesDemo {
    public static void main(String[] args) {
    //Pretvaranje broja sa zarezom u cijeli broj.
        double broj = 15.75;
        int noviBroj = (int) broj;
    //Zasto se broj prom? Jer Double je za brojeve sa zarezom a INT samo cijele brojeve.
        System.out.println(noviBroj);
    // Ovjde sam htio napisati "byte x = 127 + 1" al IntJ mi je dao preporuku da napisem ovo
    // jer ce biti neki problem tkd hvala IntJ :D
        byte x = (byte) (127+1);
    // "byte" moze maksimalno imati 127 "vrijednosti" ako dodamo +1 ode u minus al plus jedan minus ono 127 u -128
        System.out.println(x);
    }
}
