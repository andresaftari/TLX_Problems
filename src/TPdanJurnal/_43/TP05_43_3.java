package TPdanJurnal._43;

import java.util.Scanner;

public class TP05_43_3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String namaBangun = scanner.nextLine();
        setCalculation(namaBangun);
    }

    private static void setCalculation(String bangunDatar) {
        int sisi, panjang, lebar, alas, tinggi, diameter;
        final double phi = 3.14;

        switch (bangunDatar) {
            case "Persegi" -> {
                sisi = scanner.nextInt();

                int luasPersegi = sisi * sisi;
                int kelilingPersegi = 4 * sisi;

                System.out.println(luasPersegi + " " + kelilingPersegi);
            }
            case "Persegi Panjang" -> {
                panjang = scanner.nextInt();
                lebar = scanner.nextInt();

                int luasPersegiPanjang = panjang * lebar;
                int kelilingPersegiPanjang = (2 * panjang) + (2 * lebar);

                System.out.println(luasPersegiPanjang + " " + kelilingPersegiPanjang);
            }
            case "Segitiga Siku-Siku" -> {
                alas = scanner.nextInt();
                tinggi = scanner.nextInt();

                int luasSegitigaSikuSiku = (alas * tinggi) / 2;
                int sisiMiring = (int) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
                int kelilingSegitigaSikuSiku = (alas + tinggi + sisiMiring);

                System.out.println(luasSegitigaSikuSiku + " " + kelilingSegitigaSikuSiku);
            }
            case "Lingkaran" -> {
                diameter = scanner.nextInt();

                double luasLingkaran = (phi * diameter * diameter) / 4;
                double kelilingLingkaran = 3.14 * diameter;

                System.out.println(luasLingkaran + " " + kelilingLingkaran);
            }
        }
    }
}