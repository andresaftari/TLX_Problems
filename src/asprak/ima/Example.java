package asprak.ima;

public class Example {
    public static void main(String[] args) {
        penjumlahan(3, 4);
        System.out.println(perkalian(3, 2));
    }

    private static void penjumlahan(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        System.out.println(hasil);
    }

    private static int perkalian(int angka1, int angka2) {
        return angka1 * angka2;
    }
}
