package asprak.ima;

public class Diskon {
    public static void main(String[] args) {
        int discMakanan = 15;
        int discMinuman = 10;

        int discMie = (17000 * discMakanan) / 100;
        int mie = 17000 - discMie;

        int discTahu = 12000 * discMakanan / 100;
        int tahu = (12000 - discTahu) * 3;

        int discEsTeh = (5000 * discMinuman) / 100;
        int esTeh = (5000 - discEsTeh) * 3;
        
        System.out.println((mie + esTeh + tahu));
    }
}
