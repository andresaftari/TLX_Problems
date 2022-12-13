package asprak.ima;

import java.util.Scanner;

public class Bruh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int bilanganN = sc.nextInt();
        int pajak = 0;

        if (bilanganN >= 0 && bilanganN <= 50) {
            pajak = 5;
        } else if (bilanganN >= 51 && bilanganN <= 250) {
            pajak = 15;
        } else if (bilanganN >= 251 && bilanganN <= 500) {
            pajak = 25;
        } else if (bilanganN > 500) {
            pajak = 30;
        }
        
        long penghasilanKotor = bilanganN * 1000000;
        long hasilPajak = (penghasilanKotor * pajak) / 100;
        
        System.out.println("Penghasilan kotor: Rp. " + bilanganN + " juta rupiah");
        System.out.println("Pajak " + pajak + "% = Rp. " + hasilPajak);
        System.out.println("Penghasilan bersih Rp. " + (penghasilanKotor - hasilPajak));
    }
}
